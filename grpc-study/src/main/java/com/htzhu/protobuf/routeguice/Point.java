// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide.proto

package com.htzhu.protobuf.routeguice;

/**
 * <pre>
 * Points are represented as latitude-longitude pairs in the E7 representation
 * (degrees multiplied by 10**7 and rounded to the nearest integer).
 * Latitudes should be in the range +/- 90 degrees and longitude should be in
 * the range +/- 180 degrees (inclusive).
 * </pre>
 *
 * Protobuf type {@code com.htzhu.protobuf.routeguice.Point}
 */
public final class Point extends
		com.google.protobuf.GeneratedMessageV3 implements
		// @@protoc_insertion_point(message_implements:com.htzhu.protobuf.routeguice.Point)
		PointOrBuilder {

	private static final long serialVersionUID = 0L;

	// Use Point.newBuilder() to construct.
	private Point(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	private Point() {
		latitude_ = 0;
		longitude_ = 0;
	}

	@java.lang.Override
	public final com.google.protobuf.UnknownFieldSet
	getUnknownFields() {
		return this.unknownFields;
	}

	private Point(
			com.google.protobuf.CodedInputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		this();
		if (extensionRegistry == null) {
			throw new java.lang.NullPointerException();
		}
		int mutable_bitField0_ = 0;
		com.google.protobuf.UnknownFieldSet.Builder unknownFields =
				com.google.protobuf.UnknownFieldSet.newBuilder();
		try {
			boolean done = false;
			while (!done) {
				int tag = input.readTag();
				switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownFieldProto3(
								input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 8: {

						latitude_ = input.readInt32();
						break;
					}
					case 16: {

						longitude_ = input.readInt32();
						break;
					}
				}
			}
		} catch (com.google.protobuf.InvalidProtocolBufferException e) {
			throw e.setUnfinishedMessage(this);
		} catch (java.io.IOException e) {
			throw new com.google.protobuf.InvalidProtocolBufferException(
					e).setUnfinishedMessage(this);
		} finally {
			this.unknownFields = unknownFields.build();
			makeExtensionsImmutable();
		}
	}

	public static final com.google.protobuf.Descriptors.Descriptor
	getDescriptor() {
		return com.htzhu.protobuf.routeguice.RouteGuideProto.internal_static_com_htzhu_protobuf_routeguice_Point_descriptor;
	}

	protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
	internalGetFieldAccessorTable() {
		return com.htzhu.protobuf.routeguice.RouteGuideProto.internal_static_com_htzhu_protobuf_routeguice_Point_fieldAccessorTable
				.ensureFieldAccessorsInitialized(
						com.htzhu.protobuf.routeguice.Point.class,
						com.htzhu.protobuf.routeguice.Point.Builder.class);
	}

	public static final int LATITUDE_FIELD_NUMBER = 1;
	private int latitude_;

	/**
	 * <code>int32 latitude = 1;</code>
	 */
	public int getLatitude() {
		return latitude_;
	}

	public static final int LONGITUDE_FIELD_NUMBER = 2;
	private int longitude_;

	/**
	 * <code>int32 longitude = 2;</code>
	 */
	public int getLongitude() {
		return longitude_;
	}

	private byte memoizedIsInitialized = -1;

	public final boolean isInitialized() {
		byte isInitialized = memoizedIsInitialized;
		if (isInitialized == 1) {
			return true;
		}
		if (isInitialized == 0) {
			return false;
		}

		memoizedIsInitialized = 1;
		return true;
	}

	public void writeTo(com.google.protobuf.CodedOutputStream output)
			throws java.io.IOException {
		if (latitude_ != 0) {
			output.writeInt32(1, latitude_);
		}
		if (longitude_ != 0) {
			output.writeInt32(2, longitude_);
		}
		unknownFields.writeTo(output);
	}

	public int getSerializedSize() {
		int size = memoizedSize;
		if (size != -1) {
			return size;
		}

		size = 0;
		if (latitude_ != 0) {
			size += com.google.protobuf.CodedOutputStream
					.computeInt32Size(1, latitude_);
		}
		if (longitude_ != 0) {
			size += com.google.protobuf.CodedOutputStream
					.computeInt32Size(2, longitude_);
		}
		size += unknownFields.getSerializedSize();
		memoizedSize = size;
		return size;
	}

	@java.lang.Override
	public boolean equals(final java.lang.Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof com.htzhu.protobuf.routeguice.Point)) {
			return super.equals(obj);
		}
		com.htzhu.protobuf.routeguice.Point other = (com.htzhu.protobuf.routeguice.Point) obj;

		boolean result = true;
		result = result && (getLatitude()
				== other.getLatitude());
		result = result && (getLongitude()
				== other.getLongitude());
		result = result && unknownFields.equals(other.unknownFields);
		return result;
	}

	@java.lang.Override
	public int hashCode() {
		if (memoizedHashCode != 0) {
			return memoizedHashCode;
		}
		int hash = 41;
		hash = (19 * hash) + getDescriptor().hashCode();
		hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
		hash = (53 * hash) + getLatitude();
		hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
		hash = (53 * hash) + getLongitude();
		hash = (29 * hash) + unknownFields.hashCode();
		memoizedHashCode = hash;
		return hash;
	}

	public static com.htzhu.protobuf.routeguice.Point parseFrom(
			java.nio.ByteBuffer data)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static com.htzhu.protobuf.routeguice.Point parseFrom(
			java.nio.ByteBuffer data,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static com.htzhu.protobuf.routeguice.Point parseFrom(
			com.google.protobuf.ByteString data)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static com.htzhu.protobuf.routeguice.Point parseFrom(
			com.google.protobuf.ByteString data,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static com.htzhu.protobuf.routeguice.Point parseFrom(byte[] data)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static com.htzhu.protobuf.routeguice.Point parseFrom(
			byte[] data,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static com.htzhu.protobuf.routeguice.Point parseFrom(java.io.InputStream input)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3
				.parseWithIOException(PARSER, input);
	}

	public static com.htzhu.protobuf.routeguice.Point parseFrom(
			java.io.InputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3
				.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static com.htzhu.protobuf.routeguice.Point parseDelimitedFrom(java.io.InputStream input)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3
				.parseDelimitedWithIOException(PARSER, input);
	}

	public static com.htzhu.protobuf.routeguice.Point parseDelimitedFrom(
			java.io.InputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3
				.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static com.htzhu.protobuf.routeguice.Point parseFrom(
			com.google.protobuf.CodedInputStream input)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3
				.parseWithIOException(PARSER, input);
	}

	public static com.htzhu.protobuf.routeguice.Point parseFrom(
			com.google.protobuf.CodedInputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3
				.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public Builder newBuilderForType() {
		return newBuilder();
	}

	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder(com.htzhu.protobuf.routeguice.Point prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

	public Builder toBuilder() {
		return this == DEFAULT_INSTANCE
				? new Builder() : new Builder().mergeFrom(this);
	}

	@java.lang.Override
	protected Builder newBuilderForType(
			com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
		Builder builder = new Builder(parent);
		return builder;
	}

	/**
	 * <pre>
	 * Points are represented as latitude-longitude pairs in the E7 representation
	 * (degrees multiplied by 10**7 and rounded to the nearest integer).
	 * Latitudes should be in the range +/- 90 degrees and longitude should be in
	 * the range +/- 180 degrees (inclusive).
	 * </pre>
	 *
	 * Protobuf type {@code com.htzhu.protobuf.routeguice.Point}
	 */
	public static final class Builder extends
			com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
			// @@protoc_insertion_point(builder_implements:com.htzhu.protobuf.routeguice.Point)
			com.htzhu.protobuf.routeguice.PointOrBuilder {

		public static final com.google.protobuf.Descriptors.Descriptor
		getDescriptor() {
			return com.htzhu.protobuf.routeguice.RouteGuideProto.internal_static_com_htzhu_protobuf_routeguice_Point_descriptor;
		}

		protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
		internalGetFieldAccessorTable() {
			return com.htzhu.protobuf.routeguice.RouteGuideProto.internal_static_com_htzhu_protobuf_routeguice_Point_fieldAccessorTable
					.ensureFieldAccessorsInitialized(
							com.htzhu.protobuf.routeguice.Point.class,
							com.htzhu.protobuf.routeguice.Point.Builder.class);
		}

		// Construct using com.htzhu.protobuf.routeguice.Point.newBuilder()
		private Builder() {
			maybeForceBuilderInitialization();
		}

		private Builder(
				com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
			super(parent);
			maybeForceBuilderInitialization();
		}

		private void maybeForceBuilderInitialization() {
			if (com.google.protobuf.GeneratedMessageV3
					.alwaysUseFieldBuilders) {
			}
		}

		public Builder clear() {
			super.clear();
			latitude_ = 0;

			longitude_ = 0;

			return this;
		}

		public com.google.protobuf.Descriptors.Descriptor
		getDescriptorForType() {
			return com.htzhu.protobuf.routeguice.RouteGuideProto.internal_static_com_htzhu_protobuf_routeguice_Point_descriptor;
		}

		public com.htzhu.protobuf.routeguice.Point getDefaultInstanceForType() {
			return com.htzhu.protobuf.routeguice.Point.getDefaultInstance();
		}

		public com.htzhu.protobuf.routeguice.Point build() {
			com.htzhu.protobuf.routeguice.Point result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		public com.htzhu.protobuf.routeguice.Point buildPartial() {
			com.htzhu.protobuf.routeguice.Point result = new com.htzhu.protobuf.routeguice.Point(
					this);
			result.latitude_ = latitude_;
			result.longitude_ = longitude_;
			onBuilt();
			return result;
		}

		public Builder clone() {
			return (Builder) super.clone();
		}

		public Builder setField(
				com.google.protobuf.Descriptors.FieldDescriptor field,
				java.lang.Object value) {
			return (Builder) super.setField(field, value);
		}

		public Builder clearField(
				com.google.protobuf.Descriptors.FieldDescriptor field) {
			return (Builder) super.clearField(field);
		}

		public Builder clearOneof(
				com.google.protobuf.Descriptors.OneofDescriptor oneof) {
			return (Builder) super.clearOneof(oneof);
		}

		public Builder setRepeatedField(
				com.google.protobuf.Descriptors.FieldDescriptor field,
				int index, java.lang.Object value) {
			return (Builder) super.setRepeatedField(field, index, value);
		}

		public Builder addRepeatedField(
				com.google.protobuf.Descriptors.FieldDescriptor field,
				java.lang.Object value) {
			return (Builder) super.addRepeatedField(field, value);
		}

		public Builder mergeFrom(com.google.protobuf.Message other) {
			if (other instanceof com.htzhu.protobuf.routeguice.Point) {
				return mergeFrom((com.htzhu.protobuf.routeguice.Point) other);
			} else {
				super.mergeFrom(other);
				return this;
			}
		}

		public Builder mergeFrom(com.htzhu.protobuf.routeguice.Point other) {
			if (other == com.htzhu.protobuf.routeguice.Point.getDefaultInstance()) {
				return this;
			}
			if (other.getLatitude() != 0) {
				setLatitude(other.getLatitude());
			}
			if (other.getLongitude() != 0) {
				setLongitude(other.getLongitude());
			}
			this.mergeUnknownFields(other.unknownFields);
			onChanged();
			return this;
		}

		public final boolean isInitialized() {
			return true;
		}

		public Builder mergeFrom(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			com.htzhu.protobuf.routeguice.Point parsedMessage = null;
			try {
				parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				parsedMessage = (com.htzhu.protobuf.routeguice.Point) e.getUnfinishedMessage();
				throw e.unwrapIOException();
			} finally {
				if (parsedMessage != null) {
					mergeFrom(parsedMessage);
				}
			}
			return this;
		}

		private int latitude_;

		/**
		 * <code>int32 latitude = 1;</code>
		 */
		public int getLatitude() {
			return latitude_;
		}

		/**
		 * <code>int32 latitude = 1;</code>
		 */
		public Builder setLatitude(int value) {

			latitude_ = value;
			onChanged();
			return this;
		}

		/**
		 * <code>int32 latitude = 1;</code>
		 */
		public Builder clearLatitude() {

			latitude_ = 0;
			onChanged();
			return this;
		}

		private int longitude_;

		/**
		 * <code>int32 longitude = 2;</code>
		 */
		public int getLongitude() {
			return longitude_;
		}

		/**
		 * <code>int32 longitude = 2;</code>
		 */
		public Builder setLongitude(int value) {

			longitude_ = value;
			onChanged();
			return this;
		}

		/**
		 * <code>int32 longitude = 2;</code>
		 */
		public Builder clearLongitude() {

			longitude_ = 0;
			onChanged();
			return this;
		}

		public final Builder setUnknownFields(
				final com.google.protobuf.UnknownFieldSet unknownFields) {
			return super.setUnknownFieldsProto3(unknownFields);
		}

		public final Builder mergeUnknownFields(
				final com.google.protobuf.UnknownFieldSet unknownFields) {
			return super.mergeUnknownFields(unknownFields);
		}

		// @@protoc_insertion_point(builder_scope:com.htzhu.protobuf.routeguice.Point)
	}

	// @@protoc_insertion_point(class_scope:com.htzhu.protobuf.routeguice.Point)
	private static final com.htzhu.protobuf.routeguice.Point DEFAULT_INSTANCE;

	static {
		DEFAULT_INSTANCE = new com.htzhu.protobuf.routeguice.Point();
	}

	public static com.htzhu.protobuf.routeguice.Point getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	private static final com.google.protobuf.Parser<Point>
			PARSER = new com.google.protobuf.AbstractParser<Point>() {
		public Point parsePartialFrom(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return new Point(input, extensionRegistry);
		}
	};

	public static com.google.protobuf.Parser<Point> parser() {
		return PARSER;
	}

	@java.lang.Override
	public com.google.protobuf.Parser<Point> getParserForType() {
		return PARSER;
	}

	public com.htzhu.protobuf.routeguice.Point getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}

}

