package com.htzhu.protobuf.student;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * 定义rpc方法
 * </pre>
 */
@javax.annotation.Generated(
		value = "by gRPC proto compiler (version 1.4.0)",
		comments = "Source: Student.proto")
public final class StudentServiceGrpc {

	private StudentServiceGrpc() {
	}

	public static final String SERVICE_NAME = "com.htzhu.protobuf.student.StudentService";

	// Static method descriptors that strictly reflect the proto.
	@io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
	public static final io.grpc.MethodDescriptor<MyRequest,
			MyResponse> METHOD_GET_REAL_NAME_BY_USERNAME =
			io.grpc.MethodDescriptor.<MyRequest, MyResponse>newBuilder()
					.setType(io.grpc.MethodDescriptor.MethodType.UNARY)
					.setFullMethodName(generateFullMethodName(
							"com.htzhu.protobuf.student.StudentService", "GetRealNameByUsername"))
					.setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
							MyRequest.getDefaultInstance()))
					.setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
							MyResponse.getDefaultInstance()))
					.build();

	/**
	 * Creates a new async stub that supports all call types for the service
	 */
	public static StudentServiceStub newStub(io.grpc.Channel channel) {
		return new StudentServiceStub(channel);
	}

	/**
	 * Creates a new blocking-style stub that supports unary and streaming output calls on the
	 * service
	 */
	public static StudentServiceBlockingStub newBlockingStub(
			io.grpc.Channel channel) {
		return new StudentServiceBlockingStub(channel);
	}

	/**
	 * Creates a new ListenableFuture-style stub that supports unary calls on the service
	 */
	public static StudentServiceFutureStub newFutureStub(
			io.grpc.Channel channel) {
		return new StudentServiceFutureStub(channel);
	}

	/**
	 * <pre>
	 * 定义rpc方法
	 * </pre>
	 */
	public static abstract class StudentServiceImplBase implements io.grpc.BindableService {

		/**
		 * <pre>
		 * 一元RPC
		 * </pre>
		 */
		public void getRealNameByUsername(MyRequest request,
				io.grpc.stub.StreamObserver<MyResponse> responseObserver) {
			asyncUnimplementedUnaryCall(METHOD_GET_REAL_NAME_BY_USERNAME, responseObserver);
		}

		@Override
		public final io.grpc.ServerServiceDefinition bindService() {
			return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
					.addMethod(
							METHOD_GET_REAL_NAME_BY_USERNAME,
							asyncUnaryCall(
									new MethodHandlers<
											MyRequest,
											MyResponse>(
											this, METHODID_GET_REAL_NAME_BY_USERNAME)))
					.build();
		}
	}

	/**
	 * <pre>
	 * 定义rpc方法
	 * </pre>
	 */
	public static final class StudentServiceStub extends
			io.grpc.stub.AbstractStub<StudentServiceStub> {

		private StudentServiceStub(io.grpc.Channel channel) {
			super(channel);
		}

		private StudentServiceStub(io.grpc.Channel channel,
				io.grpc.CallOptions callOptions) {
			super(channel, callOptions);
		}

		@Override
		protected StudentServiceStub build(io.grpc.Channel channel,
				io.grpc.CallOptions callOptions) {
			return new StudentServiceStub(channel, callOptions);
		}

		/**
		 * <pre>
		 * 一元RPC
		 * </pre>
		 */
		public void getRealNameByUsername(MyRequest request,
				io.grpc.stub.StreamObserver<MyResponse> responseObserver) {
			asyncUnaryCall(
					getChannel().newCall(METHOD_GET_REAL_NAME_BY_USERNAME, getCallOptions()),
					request, responseObserver);
		}
	}

	/**
	 * <pre>
	 * 定义rpc方法
	 * </pre>
	 */
	public static final class StudentServiceBlockingStub extends
			io.grpc.stub.AbstractStub<StudentServiceBlockingStub> {

		private StudentServiceBlockingStub(io.grpc.Channel channel) {
			super(channel);
		}

		private StudentServiceBlockingStub(io.grpc.Channel channel,
				io.grpc.CallOptions callOptions) {
			super(channel, callOptions);
		}

		@Override
		protected StudentServiceBlockingStub build(io.grpc.Channel channel,
				io.grpc.CallOptions callOptions) {
			return new StudentServiceBlockingStub(channel, callOptions);
		}

		/**
		 * <pre>
		 * 一元RPC
		 * </pre>
		 */
		public MyResponse getRealNameByUsername(MyRequest request) {
			return blockingUnaryCall(
					getChannel(), METHOD_GET_REAL_NAME_BY_USERNAME, getCallOptions(), request);
		}
	}

	/**
	 * <pre>
	 * 定义rpc方法
	 * </pre>
	 */
	public static final class StudentServiceFutureStub extends
			io.grpc.stub.AbstractStub<StudentServiceFutureStub> {

		private StudentServiceFutureStub(io.grpc.Channel channel) {
			super(channel);
		}

		private StudentServiceFutureStub(io.grpc.Channel channel,
				io.grpc.CallOptions callOptions) {
			super(channel, callOptions);
		}

		@Override
		protected StudentServiceFutureStub build(io.grpc.Channel channel,
				io.grpc.CallOptions callOptions) {
			return new StudentServiceFutureStub(channel, callOptions);
		}

		/**
		 * <pre>
		 * 一元RPC
		 * </pre>
		 */
		public com.google.common.util.concurrent.ListenableFuture<MyResponse> getRealNameByUsername(
				MyRequest request) {
			return futureUnaryCall(
					getChannel().newCall(METHOD_GET_REAL_NAME_BY_USERNAME, getCallOptions()),
					request);
		}
	}

	private static final int METHODID_GET_REAL_NAME_BY_USERNAME = 0;

	private static final class MethodHandlers<Req, Resp> implements
			io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
			io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
			io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
			io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

		private final StudentServiceImplBase serviceImpl;
		private final int methodId;

		MethodHandlers(StudentServiceImplBase serviceImpl, int methodId) {
			this.serviceImpl = serviceImpl;
			this.methodId = methodId;
		}

		@Override
		@SuppressWarnings("unchecked")
		public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
			switch (methodId) {
				case METHODID_GET_REAL_NAME_BY_USERNAME:
					serviceImpl.getRealNameByUsername((MyRequest) request,
							(io.grpc.stub.StreamObserver<MyResponse>) responseObserver);
					break;
				default:
					throw new AssertionError();
			}
		}

		@Override
		@SuppressWarnings("unchecked")
		public io.grpc.stub.StreamObserver<Req> invoke(
				io.grpc.stub.StreamObserver<Resp> responseObserver) {
			switch (methodId) {
				default:
					throw new AssertionError();
			}
		}
	}

	private static final class StudentServiceDescriptorSupplier implements
			io.grpc.protobuf.ProtoFileDescriptorSupplier {

		@Override
		public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
			return StudentProto.getDescriptor();
		}
	}

	private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

	public static io.grpc.ServiceDescriptor getServiceDescriptor() {
		io.grpc.ServiceDescriptor result = serviceDescriptor;
		if (result == null) {
			synchronized (StudentServiceGrpc.class) {
				result = serviceDescriptor;
				if (result == null) {
					serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
							.setSchemaDescriptor(new StudentServiceDescriptorSupplier())
							.addMethod(METHOD_GET_REAL_NAME_BY_USERNAME)
							.build();
				}
			}
		}
		return result;
	}
}
