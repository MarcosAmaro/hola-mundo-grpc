# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/service.proto',
  package='',
  syntax='proto3',
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x13proto/service.proto\"\x07\n\x05\x45mpty\"\x88\x01\n\nCountryDTO\x12\x11\n\tidCountry\x18\x01 \x01(\x03\x12\x10\n\x08idRegion\x18\x02 \x01(\x03\x12\x13\n\x0b\x63ountryName\x18\x03 \x01(\t\x12\x12\n\nregionName\x18\x04 \x01(\t\x12\x17\n\x0f\x63ountryCodeMain\x18\x05 \x01(\t\x12\x13\n\x0bnationalDay\x18\x06 \x01(\x03\"5\n\x13\x43ountryListResponse\x12\x1e\n\tcountries\x18\x01 \x03(\x0b\x32\x0b.CountryDTO2_\n\x0e\x43ountryService\x12\'\n\x07GetList\x12\x06.Empty\x1a\x14.CountryListResponse\x12$\n\rUpdateCountry\x12\x0b.CountryDTO\x1a\x06.Emptyb\x06proto3'
)




_EMPTY = _descriptor.Descriptor(
  name='Empty',
  full_name='Empty',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=23,
  serialized_end=30,
)


_COUNTRYDTO = _descriptor.Descriptor(
  name='CountryDTO',
  full_name='CountryDTO',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='idCountry', full_name='CountryDTO.idCountry', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='idRegion', full_name='CountryDTO.idRegion', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='countryName', full_name='CountryDTO.countryName', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='regionName', full_name='CountryDTO.regionName', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='countryCodeMain', full_name='CountryDTO.countryCodeMain', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='nationalDay', full_name='CountryDTO.nationalDay', index=5,
      number=6, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=33,
  serialized_end=169,
)


_COUNTRYLISTRESPONSE = _descriptor.Descriptor(
  name='CountryListResponse',
  full_name='CountryListResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='countries', full_name='CountryListResponse.countries', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=171,
  serialized_end=224,
)

_COUNTRYLISTRESPONSE.fields_by_name['countries'].message_type = _COUNTRYDTO
DESCRIPTOR.message_types_by_name['Empty'] = _EMPTY
DESCRIPTOR.message_types_by_name['CountryDTO'] = _COUNTRYDTO
DESCRIPTOR.message_types_by_name['CountryListResponse'] = _COUNTRYLISTRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Empty = _reflection.GeneratedProtocolMessageType('Empty', (_message.Message,), {
  'DESCRIPTOR' : _EMPTY,
  '__module__' : 'proto.service_pb2'
  # @@protoc_insertion_point(class_scope:Empty)
  })
_sym_db.RegisterMessage(Empty)

CountryDTO = _reflection.GeneratedProtocolMessageType('CountryDTO', (_message.Message,), {
  'DESCRIPTOR' : _COUNTRYDTO,
  '__module__' : 'proto.service_pb2'
  # @@protoc_insertion_point(class_scope:CountryDTO)
  })
_sym_db.RegisterMessage(CountryDTO)

CountryListResponse = _reflection.GeneratedProtocolMessageType('CountryListResponse', (_message.Message,), {
  'DESCRIPTOR' : _COUNTRYLISTRESPONSE,
  '__module__' : 'proto.service_pb2'
  # @@protoc_insertion_point(class_scope:CountryListResponse)
  })
_sym_db.RegisterMessage(CountryListResponse)



_COUNTRYSERVICE = _descriptor.ServiceDescriptor(
  name='CountryService',
  full_name='CountryService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=226,
  serialized_end=321,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetList',
    full_name='CountryService.GetList',
    index=0,
    containing_service=None,
    input_type=_EMPTY,
    output_type=_COUNTRYLISTRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='UpdateCountry',
    full_name='CountryService.UpdateCountry',
    index=1,
    containing_service=None,
    input_type=_COUNTRYDTO,
    output_type=_EMPTY,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_COUNTRYSERVICE)

DESCRIPTOR.services_by_name['CountryService'] = _COUNTRYSERVICE

# @@protoc_insertion_point(module_scope)
