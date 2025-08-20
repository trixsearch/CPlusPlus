### Django REST framework imps

# Python JSON 

import json 
apna_data = {'name':'Abhinav','age':24}
# ye needche hum apna data ko json mein convert karke usko json_converted mein store kar denge
json_converted = json.dumps(apna_data)
# data ko print karoge toh {"name":"Abhinav","age":24} aayega


# Loads method in python json is used to parse json string
# agar humko wapas , json to python k object mein chahiye hai toh
wapas_python_data = json.loads(json_converted)

