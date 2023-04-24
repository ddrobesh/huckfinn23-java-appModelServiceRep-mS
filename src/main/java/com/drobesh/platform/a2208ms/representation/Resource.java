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

public class Resource<T> {

	private Links links;
	
	private T content;
	
	public Resource(T content) {
		super();
		setContent(content);
	}

	public T getContent() {
		return content;
	}
	@SuppressWarnings("unused")
	private void setContent(T pContent) {
		this.content = pContent;
	}
	
	public Links getLinks() {
		return links;
	}

	public void setLinks(Links links) {
		this.links = links;
	}
	
}
