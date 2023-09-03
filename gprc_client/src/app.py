import os, sys
CURRENT_DIR = os.path.dirname(os.path.abspath(__file__))
sys.path.append(os.path.dirname(CURRENT_DIR))

from flask import Flask, request, jsonify, make_response
from flask_cors import CORS, cross_origin
from google.protobuf.json_format import MessageToJson
from src.grpcClient import CountryClient

app = Flask(__name__)

@app.route("/")
def hello():
    return "Hello, World!"

@app.route("/getList", methods=["GET"])
@cross_origin()
def create():
	client = CountryClient()
	result = client.getList()
	return MessageToJson(result)

@app.route("/update", methods=["POST"])
@cross_origin()
def update():
	client = CountryClient()
	result = client.updateCountry(request.json)
	return make_response("ok")