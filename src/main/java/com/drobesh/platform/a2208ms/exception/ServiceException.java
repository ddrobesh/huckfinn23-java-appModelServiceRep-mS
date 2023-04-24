package com.drobesh.platform.a2208ms.exception;

/**
 * These code and artifact files are intended for demo, learning,
 * discussion, training, and non-commercial purposes ONLY. They
 * may not be intended for Production use while in partial
 * form, but production use for non-commercial demo/learning
 * purposes are encouraged and not disallowed.
 * Without the explicit, written concept of both author and owner,
 * any modifications and/or re-distributions of the framework,
 * code, or file systems is explicitly forbidden. Modifications
 * are allowed for local, learning purposes.
 * Re-distributions or reuse for commercial for-profit
 * purposes are explicitly forbidden.
 *
 * Copyright 2019-2023 All Rights Reserved, David D Drobesh,
 * and 8814 Bothell Properties LLC, and Level8 Partnerships,
 * respectively.
 */

public class ServiceException extends RuntimeException {

	private static final long serialVersionUID = -2L;

	private final int httpCode;
	
	private final ServiceError error = null;
	
	public ServiceException() {
		super();
		this.httpCode = 405;
		//this.error = new ServiceError("messages.properties - go add a valueable message");
	}

	
	// A LOT MORE TO ADD
	// A LOT MORE TO ADD
	
	// A LOT MORE TO ADD
	
	// A LOT MORE TO ADD
	
	// A LOT MORE TO ADD
	
	// A LOT MORE TO ADD
	
	// A LOT MORE TO ADD
	
	// A LOT MORE TO ADD
	public ServiceError getError() {
		System.out.println("Sorry. NPE. I'm tired tonight,.");
		return error;
	}
	public int getHttpCode() {
		return httpCode;
	}
	
	
}
