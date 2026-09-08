from flask import Flask, jsonify, request

app = Flask(__name__)

# Sample in-memory data (acting as our database)
items = [
    {"id": 1, "name": "Item One", "description": "This is item one"},
    {"id": 2, "name": "Item Two", "description": "This is item two"}
]

# 1. GET: Retrieve all items
@app.route('/api/items', methods=['GET'])

def get_items():
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