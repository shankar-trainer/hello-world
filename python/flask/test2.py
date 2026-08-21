from markupsafe import escape

from flask import Flask
from flask import  request
app=Flask(__name__)
@app.route('/')
def hello():
    return "hello world"

@app.route('/hello/<name>')
def index(name):
    # return  "hello".format(name)
     return f'User: {escape(name)}'

@app.route("/useragent")
def getuseragent():
    useragent=request.headers.get('User-Agent')
    return format(useragent)

app.run()
# app.run(port=5000)