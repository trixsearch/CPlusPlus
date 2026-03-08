movie = {
    'title' : 'Life of Brian',
    'year' : 1979,
    'cast' : ['John','Eric','Michael','George','Terry']
}

# we can print a dictionary with direct print statementṇ
# print(movie)

# if we print something that doesn't exist, it'll be like 
print(movie.get('budget'))

# if you want to update whole dictionary
movie.update({'title' : 'The Holy Grail','year':1975,'cast':['John','Eric','Michael','George','Terry']})
print(movie)

# to delete a dictionary we can use this will just delete year in the dictinary
del movie['year']
print("deleted year : ",movie)

movie['year']=2001
print("updated year to : ",movie)

# instead of just deleting the value we can also use a more safer method that is pop
removedValueYear = movie.pop('year')
print("pop the value",removedValueYear,"from :" ,movie)

# for getting the length of a dictionary
print("length of the dict:",len(movie))

# we can have the keys and values alongside 
print("only keys: ",movie.keys())

print("only values:",movie.values())

# if we want each key value pair in the form of tuple we can do it using items
print(".items() method :",movie.items())

# for loop in dictionary will be like 
for key,value in movie.items():
    print("key:", key ," || ", "value:",value)

# dictionary 2 of python scrimba
python = {'John':35,'Eric':36,'Michael':35,'Terry':38,'Graham':37,'TerryG':34}
holy_grail = {'Arthur':40,'Galahad':35,'Lancelot':39,'Knight of NI':40, 'Zoot':17}
life_of_brian = {'Brian':33,'Reg':35,'Stan/Loretta':32,'Biccus Diccus':45}
#membership test
print('Arthur' in holy_grail)
if 'Arthur' not in python:
    print('He\'s not here!')

# let's know more about dictionary

people={}
people1={}
people2={}
people3={}

# if we use update method and add dictionary to it , it will concatenate two dicts

people.update(python)
print("people :",people)

people.update(holy_grail)
# this will add holy grail too
print("people :",people)

#method 2 comprehension
for groups in (python,holy_grail) : people1.update(groups)
#this will work as for groups in python which return tuple of all key value pairs than for groups in holy_grail and same goes with this too
print(people1)

#we can also write as
people2 = {**life_of_brian, **holy_grail}

print("people2: ",people2)

people3 = python | holy_grail

print(people3)

# we can use sorted method to sort a dictionary
print(sorted(people3))
#the above will only sort the keys and print it ,without affecting the original dict
# if we want all the keys to sort with there values we can do 

print(sorted(people2.items()))

# we can do sum of the whole values in dictionary
print("sum of python ages :"sum(python.values()))


# we have several more methods in the python as
# Maximum value
print("Maximum:",max(people3.values()))

# we can apply the same logic to the keys too 

print("Maximum Value key:",max(people3, key=people3.get))

#same for the smallest value
print("Smalles value:",min(people3.values()))

