package com.drobesh.platform.a2208ms.representation;

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

//	REST representation for a Links segment in other representations(Collection, Error, Response)
public class Links implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String self;
	
	public Links(String self) {
		super();
		setSelf(self);
	}

	public String getSelf() {
		return self;
	}
	@SuppressWarnings("unused")
	private void setSelf(String pSelf) {
		this.self = pSelf;
	}
	
	
	
}
