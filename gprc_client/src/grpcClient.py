import os, sys
CURRENT_DIR = os.path.dirname(os.path.abspath(__file__))
sys.path.append(os.path.dirname(CURRENT_DIR))

import grpc
import proto.service_pb2_grpc as service_grpc
import proto.service_pb2 as service_pb2
from google.protobuf.json_format import MessageToJson

class CountryClient(object):

	def __init__(self):
		self.host = 'localhost'
		self.server_port = 9090

		self.channel = grpc.insecure_channel('{}:{}'.format(self.host, self.server_port))
		self.stub = service_grpc.CountryServiceStub(self.channel)

	def getList(self):
		param = service_pb2.Empty()
		return self.stub.GetList(param)

	def updateCountry(self, country):
		pCountry = service_pb2.CountryDTO(
			idCountry = int(country['idCountry']),
			idRegion = int(country['idRegion']),
			countryName = country['countryName'],
			countryCodeMain = country['countryCodeMain'],
			#nationalDay = country['nationalDay']
		)

		return self.stub.UpdateCountry(pCountry)

if __name__ == '__main__':
	client = CountryClient()
	result = client.getList()
	print(MessageToJson(result))
	