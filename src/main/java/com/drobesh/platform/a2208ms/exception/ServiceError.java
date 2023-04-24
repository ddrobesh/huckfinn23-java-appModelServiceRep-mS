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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * POJO: Error Exception JSON REST reponse
 * See also: /src/resources/messages.properties
 * 
 * Error "Model" POJO
 * 
 * Format:
 * {
 * 		"errorId" : "",
 * 		"message" : "",
 * 		"details" : [
 * 			{
 * 				"code" : "",
 * 				"message" : ""
 * 			}
 * 		]
 * }
 * 
 * @author drobeshfamily
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceError {

	ServiceError() { } // constructor - protected
	
	private static final long serialVersionUID = 1L;
	
	private String errorId;
	
	private String message;
	
	private List<Error> details;
	
	//** Constructor
	public ServiceError(String pErrorId, String pMessage) {
		super();
		setErrorId(pErrorId);
		setMessage(pMessage);
	}
	
	void setErrorId(String pErrorId) {
		this.errorId = errorId;
	}
	
	void setMessage(String pMessage) {
		this.message = pMessage;
	}
	
	@SuppressWarnings("unused")
	void setDetails(List<Error> pDetails) {
		this.details = pDetails;
	}
//
	public static long getSerializationUid( ) {
		return serialVersionUID;
	}

	public String getErrorId() {
		return errorId;
	}
	
	public String getMessage() {
		return message;
	}
	
	public List<Error> getDetails() {
		return details;
	}
	
	void addDetail(Error pError) {
		if (this.details == null) {
			this.details = new ArrayList<>();
		}
		this.details.add(pError);
	}
	//void addDetail(ResolvableErrorEnum detail, String... args) {	//com.idp.i18n	
	//}

	// ***************** Release your Inner Class
	static class Error implements Serializable {
		Error() {}
		
		private static final long serialVersionUID = 1L;
		
		private String code;
		private String message;
		
		public Error(String code, String message) {
			super();
			setCode(code);
			setMessage(message);
		}

		void setCode(String code2) {
			this.code = code2;
		}
		void setMessage(String msg2) {
			this.message = msg2;
		}
		
		public String getCode() {
			return code;
		}
		public String getMessage() {
			return message;
		}

	}
}
