import requests as req

resp=req.get("https://reqres.in/api/users/2")
print(resp)
print(resp.json())

