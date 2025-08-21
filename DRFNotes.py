### Django REST framework imps

# Python JSON 

import json 
apna_data = {'name':'Abhinav','age':24}

# ye needche hum apna data ko json mein convert karke usko json_converted mein store kar denge
# python to json>>
json_converted = json.dumps(apna_data)
# data ko print karoge toh {"name":"Abhinav","age":24} aayega


# Loads method in python json is used to parse json string
# agar humko wapas , json to python k object mein chahiye hai toh
# json to python>>
wapas_python_data = json.loads(json_converted)

# Serializers in python
# can convert complex queries in simple things , Serializers are similar to Django Forms and Model Forms
# 
print(serializer.data) #will print serialized data

## JSON Renderer
# is used to render serialised data into JSON, which is understandable by frontend
from rest_framework.renderers import JSONRenderer
renderered_data = JSONRenderer().render(serializer.data)


# What we are doing is 
# MODEL Obj(DB) >>serialization>> Python Dict >>render into JSON>> JSON Data

# sabse pahle model obj banane k liye
stu = Student.object.get(id=1)

# fir isko serializer sey badlenge
serializer_wala_stu_data = StudentSerializer(stu)

# now we are rendering the python dict to JSON data
json_wala_data = JSONRenderer().render(serializer_wala_stu_data.data)

# JsonResponse()
# agar humko apne views mein direct Json response dena ho , tab ye help karega
JsonResponse(data,encoder=DjangoJSONEncoder, safe=True, json_dumps_params=None, **kwargs)
# isme jo pahla parameter data hai , voh dict hona chahiye , agar humko usko dict nahi rakhna hai toh safe=False karna hoga


# Deserializarion

# for deserialization you have to study BytesIO()

import io

stream = io.BytesIO(json_data)

# JSONParser()
# this is used to parse json data to python native data type

from rest_fromework.parsers import JSONParser
parsed_data = JSONParser().parse(stream)











