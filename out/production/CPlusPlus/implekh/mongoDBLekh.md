
---

# 🍃 MongoDB Ultimate Developer Cheat Sheet

**Developer:** [trixserch](trixsearch.github.io)
**Target:** Developers migrating from SQL (Java/Spring) to NoSQL (Django/Node).

---

## 1. Core Concepts (SQL vs NoSQL)

| SQL Concept | MongoDB Concept | Description |
| --- | --- | --- |
| **Table** | **Collection** | A container for documents. |
| **Row** | **Document** | A record stored in BSON (Binary JSON). |
| **Column** | **Field** | Key-value pair inside a document. |
| **JOIN** | **$lookup** | Aggregation stage to link collections. |
| **Primary Key** | **_id** | Unique ID (default is `ObjectId`). |

---

## 2. Read Operations (Retrieving Data)

| Command | Usage Example | Notes |
| --- | --- | --- |
| **Find All** | `db.users.find()` | Returns a cursor (iterator). |
| **Find One** | `db.users.findOne({ name: "Abhinav" })` | Returns a **single document** object (or `null`). |
| **Pretty Print** | `db.users.find().pretty()` | Formats JSON for readability. |
| **Count** | `db.users.countDocuments({ role: "Dev" })` | Accurate count of matches. |
| **Distinct** | `db.users.distinct("city")` | Returns array of unique values: `["Pune", "Mumbai"]`. |
| **Limit** | `db.users.find().limit(5)` | Restricts result size. |
| **Skip** | `db.users.find().skip(10)` | Skips first N results (Pagination). |
| **Sort** | `db.users.find().sort({ age: -1 })` | `1` = Ascending, `-1` = Descending. |

---

## 3. Write Operations (CRUD)

| Operation | Command | Note |
| --- | --- | --- |
| **Create** | `db.users.insertOne({ name: "Amit" })` | Inserts one. |
| **Create Bulk** | `db.users.insertMany([ {...}, {...} ])` | Inserts list. |
| **Update One** | `db.users.updateOne({ _id: 1 }, { $set: {...} })` | Updates first match. |
| **Update All** | `db.users.updateMany({ active: false }, { $set: {...} })` | Updates all matches. |
| **Delete One** | `db.users.deleteOne({ _id: 1 })` | Deletes first match. |
| **Delete All** | `db.users.deleteMany({ status: "Archived" })` | Deletes all matches. |

> **⚠️ Critical:** Always use atomic update operators (like `$set`). If you pass a plain object to an update command, it **overwrites** the entire document with that object.

---

## 4. The Operator Reference

### A. Logical Operators

* **`$and`**: Matches **all** conditions. (Implicit default).
* `db.col.find({ $and: [{ a: 1 }, { b: 1 }] })`


* **`$or`**: Matches **at least one** condition.
* `db.col.find({ $or: [{ role: "Dev" }, { role: "Manager" }] })`


* **`$nor`**: Matches **none** of the conditions.
* **`$not`**: Inverts the query.

### B. Comparison Operators

* **`$eq`**: Equal to (Explicit). `{ qty: { $eq: 20 } }`
* **`$ne`**: Not equal. `{ qty: { $ne: 20 } }`
* **`$gt` / `$gte**`: Greater than / Greater equal.
* **`$lt` / `$lte**`: Less than / Less equal.
* **`$in`**: Match any in array. `{ status: { $in: ["A", "B"] } }`
* **`$nin`**: Match none in array.

### C. Element & Evaluation

* **`$exists`**: Checks if field exists. `{ phone: { $exists: true } }`
* **`$type`**: Checks data type. `{ age: { $type: "number" } }`
* **`$regex`**: Pattern matching (SQL `LIKE`).
* `{ name: { $regex: /^Abh/i } }` (Starts with Abh, case-insensitive).



### D. Array Operators

* **`$size`**: Match array length. `{ tags: { $size: 3 } }`
* **`$all`**: Match if array has **all** items. `{ tags: { $all: ["Java", "Python"] } }`
* **`$elemMatch`**: Match if **one** item meets **multiple** conditions.
* `{ scores: { $elemMatch: { type: "Quiz", score: { $gt: 80 } } } }`



### E. Update Operators

* **`$set`**: Update/Add field. `{ $set: { status: "Active" } }`
* **`$unset`**: Remove field. `{ $unset: { old_data: "" } }`
* **`$inc`**: Increment number. `{ $inc: { views: 1 } }`
* **`$push`**: Add to array. `{ $push: { logs: "Error" } }`
* **`$pull`**: Remove from array. `{ $pull: { logs: "Error" } }`

---

## 5. Advanced Developer Scenarios ("The Special Cases")

### Case 1: Field-to-Field Comparison (`$expr`)

Used when you want to compare two fields **within the same document** (e.g., finding items sold at a loss).

```javascript
// Find documents where "cost" is greater than "price"
db.products.find({
    $expr: { $gt: ["$cost", "$price"] }
})

```

### Case 2: Case-Insensitive Exact Match

Using Regex to ensure "Abhinav" matches "abhinav".

```javascript
db.users.find({
    name: { $regex: /^abhinav$/i }
})

```

### Case 3: Implicit vs Explicit Equality

* **Implicit:** `db.users.find({ role: "Admin" })` (Standard).
* **Explicit:** `db.users.find({ role: { $eq: "Admin" } })` (Required inside Aggregation or complex logic).

### Case 4: Deep/Nested Search

* **Dot Notation:** Use quotes to access nested objects.
* `db.users.find({ "address.city": "Mumbai" })`


* **Array Search:** To find a document where the tag "Django" exists anywhere in the `skills` array:
* `db.users.find({ skills: "Django" })` (No special operator needed!).



---

## 6. Aggregation Pipeline (Advanced Data Processing)

Used for Grouping, Joining, and Transforming data.

**Syntax:** `db.collection.aggregate([ {Stage1}, {Stage2}, ... ])`

| Stage | Description | SQL Equivalent |
| --- | --- | --- |
| **`$match`** | Filter documents. | `WHERE` |
| **`$group`** | Group by key & sum/avg. | `GROUP BY` |
| **`$lookup`** | Join with another collection. | `LEFT OUTER JOIN` |
| **`$project`** | Select specific fields to keep. | `SELECT` |
| **`$unwind`** | Deconstructs an array field. | (No direct SQL equivalent) |

**Example: Join Users with Orders**

```javascript
db.users.aggregate([
   { $match: { active: true } },
   { $lookup: {
       from: "orders",
       localField: "_id",
       foreignField: "user_id",
       as: "user_orders"
   }}
])

```

---

## 7. Atomic Operations & Consistency

Critical for ensuring data integrity during concurrent updates.

| Command | Description |
| --- | --- |
| **`findOneAndUpdate`** | Finds a doc, updates it, and returns the **original**. |
| **`findOneAndDelete`** | Finds a doc, deletes it, and returns the deleted data. |

**Example: Incrementing a Counter Safely**

```javascript
db.counters.findOneAndUpdate(
   { _id: "product_count" },
   { $inc: { seq: 1 } },
   { returnNewDocument: true } // Returns the *new* value
)

```

---

## 8. Indexing (Performance Tuning)

| Command | Usage |
| --- | --- |
| **Create Index** | `db.users.createIndex({ email: 1 })` |
| **Unique Index** | `db.users.createIndex({ email: 1 }, { unique: true })` |
| **Compound Index** | `db.users.createIndex({ role: 1, age: -1 })` |
| **TTL Index** | `db.sessions.createIndex({ createdAt: 1 }, { expireAfterSeconds: 3600 })` |
| **Explain Plan** | `db.users.find({ name: "Amit" }).explain("executionStats")` |

---

## 9. Bulk Write Operations

Execute multiple Insert/Update/Delete commands in one request.

```javascript
db.collection.bulkWrite([
  { insertOne: { document: { a: 1 } } },
  { updateOne: { filter: { a: 2 }, update: { $set: { a: 20 } } } },
  { deleteOne: { filter: { a: 1 } } }
])

```
