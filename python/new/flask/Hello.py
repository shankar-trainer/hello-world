from flask import Flask

# Initialize the Flask application
app = Flask(__name__)

# Define a route for the default URL (homepage)
@app.route("/")
def home():
    return "Hello, World! Welcome to my Flask app."


@app.route("/hello")
def hello_world():
    return "hello world"
# Start the local development server
if __name__ == "__main__":
    app.run(debug=True)



# Flask(__name__): 
# Tells Flask where to look for resources like templates and static files.
# @app.route("/"): A decorator that binds a URL path to a specific Python function. 
# In this case, visiting the root domain triggers the home() function.debug=True: Enables "Hot Reloading", 
# which automatically restarts the server whenever you save changes to your code. 
