package com.grpc.demo.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: service.proto")
public final class CountryServiceGrpc {

  private CountryServiceGrpc() {}

  public static final String SERVICE_NAME = "CountryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.demo.service.CountryServiceClass.Empty,
      com.grpc.demo.service.CountryServiceClass.CountryListResponse> getGetListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetList",
      requestType = com.grpc.demo.service.CountryServiceClass.Empty.class,
      responseType = com.grpc.demo.service.CountryServiceClass.CountryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.demo.service.CountryServiceClass.Empty,
      com.grpc.demo.service.CountryServiceClass.CountryListResponse> getGetListMethod() {
    io.grpc.MethodDescriptor<com.grpc.demo.service.CountryServiceClass.Empty, com.grpc.demo.service.CountryServiceClass.CountryListResponse> getGetListMethod;
    if ((getGetListMethod = CountryServiceGrpc.getGetListMethod) == null) {
      synchronized (CountryServiceGrpc.class) {
        if ((getGetListMethod = CountryServiceGrpc.getGetListMethod) == null) {
          CountryServiceGrpc.getGetListMethod = getGetListMethod =
              io.grpc.MethodDescriptor.<com.grpc.demo.service.CountryServiceClass.Empty, com.grpc.demo.service.CountryServiceClass.CountryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.service.CountryServiceClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.service.CountryServiceClass.CountryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CountryServiceMethodDescriptorSupplier("GetList"))
              .build();
        }
      }
    }
    return getGetListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.demo.service.CountryServiceClass.CountryDTO,
      com.grpc.demo.service.CountryServiceClass.Empty> getUpdateCountryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCountry",
      requestType = com.grpc.demo.service.CountryServiceClass.CountryDTO.class,
      responseType = com.grpc.demo.service.CountryServiceClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.demo.service.CountryServiceClass.CountryDTO,
      com.grpc.demo.service.CountryServiceClass.Empty> getUpdateCountryMethod() {
    io.grpc.MethodDescriptor<com.grpc.demo.service.CountryServiceClass.CountryDTO, com.grpc.demo.service.CountryServiceClass.Empty> getUpdateCountryMethod;
    if ((getUpdateCountryMethod = CountryServiceGrpc.getUpdateCountryMethod) == null) {
      synchronized (CountryServiceGrpc.class) {
        if ((getUpdateCountryMethod = CountryServiceGrpc.getUpdateCountryMethod) == null) {
          CountryServiceGrpc.getUpdateCountryMethod = getUpdateCountryMethod =
              io.grpc.MethodDescriptor.<com.grpc.demo.service.CountryServiceClass.CountryDTO, com.grpc.demo.service.CountryServiceClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCountry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.service.CountryServiceClass.CountryDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.service.CountryServiceClass.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CountryServiceMethodDescriptorSupplier("UpdateCountry"))
              .build();
        }
      }
    }
    return getUpdateCountryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CountryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CountryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CountryServiceStub>() {
        @java.lang.Override
        public CountryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CountryServiceStub(channel, callOptions);
        }
      };
    return CountryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CountryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CountryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CountryServiceBlockingStub>() {
        @java.lang.Override
        public CountryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CountryServiceBlockingStub(channel, callOptions);
        }
      };
    return CountryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CountryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CountryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CountryServiceFutureStub>() {
        @java.lang.Override
        public CountryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CountryServiceFutureStub(channel, callOptions);
        }
      };
    return CountryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CountryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getList(com.grpc.demo.service.CountryServiceClass.Empty request,
        io.grpc.stub.StreamObserver<com.grpc.demo.service.CountryServiceClass.CountryListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetListMethod(), responseObserver);
    }

    /**
     */
    public void updateCountry(com.grpc.demo.service.CountryServiceClass.CountryDTO request,
        io.grpc.stub.StreamObserver<com.grpc.demo.service.CountryServiceClass.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCountryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.grpc.demo.service.CountryServiceClass.Empty,
                com.grpc.demo.service.CountryServiceClass.CountryListResponse>(
                  this, METHODID_GET_LIST)))
          .addMethod(
            getUpdateCountryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.grpc.demo.service.CountryServiceClass.CountryDTO,
                com.grpc.demo.service.CountryServiceClass.Empty>(
                  this, METHODID_UPDATE_COUNTRY)))
          .build();
    }
  }

  /**
   */
  public static final class CountryServiceStub extends io.grpc.stub.AbstractAsyncStub<CountryServiceStub> {
    private CountryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CountryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CountryServiceStub(channel, callOptions);
    }

    /**
     */
    public void getList(com.grpc.demo.service.CountryServiceClass.Empty request,
        io.grpc.stub.StreamObserver<com.grpc.demo.service.CountryServiceClass.CountryListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCountry(com.grpc.demo.service.CountryServiceClass.CountryDTO request,
        io.grpc.stub.StreamObserver<com.grpc.demo.service.CountryServiceClass.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCountryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CountryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CountryServiceBlockingStub> {
    private CountryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CountryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CountryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.demo.service.CountryServiceClass.CountryListResponse getList(com.grpc.demo.service.CountryServiceClass.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.demo.service.CountryServiceClass.Empty updateCountry(com.grpc.demo.service.CountryServiceClass.CountryDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCountryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CountryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CountryServiceFutureStub> {
    private CountryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CountryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CountryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.demo.service.CountryServiceClass.CountryListResponse> getList(
        com.grpc.demo.service.CountryServiceClass.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.demo.service.CountryServiceClass.Empty> updateCountry(
        com.grpc.demo.service.CountryServiceClass.CountryDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCountryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LIST = 0;
  private static final int METHODID_UPDATE_COUNTRY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CountryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CountryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LIST:
          serviceImpl.getList((com.grpc.demo.service.CountryServiceClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.grpc.demo.service.CountryServiceClass.CountryListResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COUNTRY:
          serviceImpl.updateCountry((com.grpc.demo.service.CountryServiceClass.CountryDTO) request,
              (io.grpc.stub.StreamObserver<com.grpc.demo.service.CountryServiceClass.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CountryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CountryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.demo.service.CountryServiceClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CountryService");
    }
  }

  private static final class CountryServiceFileDescriptorSupplier
      extends CountryServiceBaseDescriptorSupplier {
    CountryServiceFileDescriptorSupplier() {}
  }

  private static final class CountryServiceMethodDescriptorSupplier
      extends CountryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CountryServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CountryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CountryServiceFileDescriptorSupplier())
              .addMethod(getGetListMethod())
              .addMethod(getUpdateCountryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
