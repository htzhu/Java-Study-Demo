// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide.proto

package com.htzhu.protobuf.routeguice;

public interface RouteNoteOrBuilder extends
		// @@protoc_insertion_point(interface_extends:com.htzhu.protobuf.routeguice.RouteNote)
		com.google.protobuf.MessageOrBuilder {

	/**
	 * <pre>
	 * The location from which the message is sent.
	 * </pre>
	 *
	 * <code>.com.htzhu.protobuf.routeguice.Point location = 1;</code>
	 */
	boolean hasLocation();

	/**
	 * <pre>
	 * The location from which the message is sent.
	 * </pre>
	 *
	 * <code>.com.htzhu.protobuf.routeguice.Point location = 1;</code>
	 */
	com.htzhu.protobuf.routeguice.Point getLocation();

	/**
	 * <pre>
	 * The location from which the message is sent.
	 * </pre>
	 *
	 * <code>.com.htzhu.protobuf.routeguice.Point location = 1;</code>
	 */
	com.htzhu.protobuf.routeguice.PointOrBuilder getLocationOrBuilder();

	/**
	 * <pre>
	 * The message to be sent.
	 * </pre>
	 *
	 * <code>string message = 2;</code>
	 */
	java.lang.String getMessage();

	/**
	 * <pre>
	 * The message to be sent.
	 * </pre>
	 *
	 * <code>string message = 2;</code>
	 */
	com.google.protobuf.ByteString
	getMessageBytes();
}
