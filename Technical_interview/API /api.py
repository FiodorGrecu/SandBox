
from crypt import methods
from urllib import response
from flask import Flask, request, jsonify
from flask_restful import Resource, Api
from flask_cors import CORS
from posts import all_posts




app = Flask(__name__)
CORS(app)

@app.route('/api/ping', methods = ['GET'])
def get():
    return jsonify({'succes':'true'})

@app.route('/api/posts', methods = ['GET'])
def allPosts():
    posts = all_posts
    return jsonify({'posts':posts})

# @app.route('/api/posts/<id>', methods = ['GET'])
# def allPosts(id):
#     posts = response.request("GET", id)
#     data = response.json()
#     return data[id]

if __name__ == '__main__':
    app.run(debug=True)