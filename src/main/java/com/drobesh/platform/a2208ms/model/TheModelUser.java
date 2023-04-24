package com.drobesh.platform.a2208ms.model;

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

//@ApiModel - swagger
public class TheModelUser implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	




	private String name;
	
	// Default Constructor
	public TheModelUser() {
		super();
	}
	
	public TheModelUser(String pId) {
		super();
		this.id = pId;
	}
	
	public TheModelUser(String pId, String pName) {
		super();
		this.id = pId;
		this.name = pName;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "{id:" + id + ", name=" + name + "}";
	}
	
	@Override
	public int hashCode() {
//System.out.println(".... 2 ");		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id   == null) ? 0 :   id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
//System.out.println(".... 3 ");				
		return result;
	}

	@Override
	// Two ways to be TRUE: null or all-conditions met.
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;		}
		
		// Not this.object
		if (obj == null) {
			return false;		}
		if (getClass() != obj.getClass()) {
			return false;		}
		TheModelUser other = (TheModelUser) obj;
		if (id == null) {
			if (other.id != null) {
				return false;			
			}
		} else if ( !id.equals(other.id)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if ( !name.equals(other.name) ) {
			return false;
		}
		
		return true;
	}
}
