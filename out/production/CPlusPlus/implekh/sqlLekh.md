# SQL IMP Lekh

### JOINS

Maan Lete hai ki humare pass 2 tables hai A or B, to usme

* Inner Join : Dono tables ka given data Only
```sql
SELECT * FROM A INNER JOIN B ON A.key = B.key;

```


* Left Join : Left Full + Right ka Given Only
```sql
SELECT * FROM A LEFT JOIN B ON A.key = B.key;
```


* Right Join : Right Full + Left ka Given Only
```sql
SELECT * FROM A RIGHT JOIN B ON A.key = B.key;
```


* Full Outer Join : Dono Tables Ka Sara Data

```sql
SELECT * FROM A FULL OUTER JOIN B ON A.key = B.key;
```


* Self Join : Ek hi table ko khud se join karna (Comparison ke liye)
```sql
SELECT A1.name, A2.name FROM A A1, A A2 WHERE A1.id <> A2.id;
```


* Cross Join : Dono tables ka Cartesian Product (Har row ka har row ke saath combination)
```sql
SELECT * FROM A CROSS JOIN B;
```

__________________


See the Following Image for reference: 

![SQL Joins](https://red9.com/wp-content/uploads/2025/05/sql-joins-visualized-venn-diagram-red9.png)


______________________

