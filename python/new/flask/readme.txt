Here is a complete, step-by-step guide to creating a simple Flask REST API app in Visual Studio Code (VS Code).

Step 1: Set Up Your Project Folder
Open VS Code.

Open the terminal (Ctrl + ~ on Windows/Linux or Ctrl + ~ on macOS).

Create a new directory and navigate into it:

Bash
mkdir flask-rest-app
cd flask-rest-app
Step 2: Create a Virtual Environment
It is best practice to use a virtual environment for Python projects.

Run the following command in the terminal to create a virtual environment named venv:

Bash
python -m venv venv
Activate the virtual environment:

Windows:

Bash
venv\Scripts\activate
macOS / Linux:

Bash
source venv/bin/activate
Step 3: Install Flask
With your virtual environment activated, install Flask using pip:

Bash
pip install Flask
Step 4: Create the Application File
In the VS Code Explorer sidebar, create a new file named app.py.

Paste the following code into app.py:

Python
from flask import Flask, jsonify, request

app = Flask(__name__)

# Sample in-memory data (acting as our database)
items = [
    {"id": 1, "name": "Item One", "description": "This is item one"},
    {"id": 2, "name": "Item Two", "description": "This is item two"}
]

# 1. GET: Retrieve all items
@app.route('/api/items', methods=['GET'])
get_items():
    return jsonify({"items": items})

# 2. GET: Retrieve a single item by ID
@app.route('/api/items/<int:item_id>', methods=['GET'])
def get_item(item_id):
    item = next((item for item in items if item["id"] == item_id), None)
    if item is None:
        return jsonify({"error": "Item not found"}), 404
    return jsonify({"item": item})

# 3. POST: Create a new item
@app.route('/api/items', methods=['POST'])
def create_item():
    if not request.json or not 'name' in request.json:
        return jsonify({"error": "Bad request, 'name' is required"}), 400
    
    new_item = {
        "id": items[-1]["id"] + 1 if items else 1,
        "name": request.json['name'],
        "description": request.json.get('description', "")
    }
    items.append(new_item)
    return jsonify({"item": new_item}), 201

# 4. DELETE: Remove an item by ID
@app.route('/api/items/<int:item_id>', methods=['DELETE'])
def delete_item(item_id):
    global items
    item = next((item for item in items if item["id"] == item_id), None)
    if item is None:
        return jsonify({"error": "Item not found"}), 404
    
    items = [item for item in items if item["id"] != item_id]
    return jsonify({"result": True})

if __name__ == '__main__':
    app.run(debug=True)
Step 5: Run the App
In your terminal, make sure your virtual environment is active and run:

Bash
python app.py
You will see output indicating that the development server is running (usually at [http://127.0.0.1:5000](http://127.0.0.1:5000)).

Step 6: Test Your REST API
You can test your endpoints using tools like Postman, cURL, or VS Code extensions like Thunder Client.

Get all items:
Open your browser or run: GET [http://127.0.0.1:5000/api/items](http://127.0.0.1:5000/api/items)

Create a new item (POST):
Send a POST request to [http://127.0.0.1:5000/api/items](http://127.0.0.1:5000/api/items) with a JSON body:

JSON
{
    "name": "Item Three",
    "description": "This is item three description"
}