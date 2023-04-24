package com.drobesh.platform.a2208ms.resource;

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

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.drobesh.platform.a2208ms.model.TheModelUser;
import com.drobesh.platform.a2208ms.model.swagger.UserResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api("user")
@Path("/users")
@Produces({MediaType.APPLICATION_JSON})
public interface UserResource {
	// CRUD: Create/Post	Read/Get	Update/Put	Delete/Delete
	
	@GET
	@Path("/{userId}")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	@ApiOperation(
			value = "Get usre Resource",
			notes = "For the given user id returns useer resource",
			response = UserResponse.class)
	@ApiResponses(
			value = {
					@ApiResponse(code = 200, message = "Ok"),
					@ApiResponse(code = 404, message = "Not Found")
					})
	public Response getUser(
			@ApiParam(value = "Id of User", required=true)
			@PathParam("userId")
			String pUserId);
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	@ApiOperation(
			value = "Get usre Resource",
			notes = "For the given user id returns user resource",
			response = UserResponse.class)
	@ApiResponses(
			value = {
					@ApiResponse(code = 201, message = "Created"),
					@ApiResponse(code = 409, message = "Conflict")
					})
	public Response createUser(
			@ApiParam(value = "Id of User", required=true)
			TheModelUser user,
			@Context UriInfo uriInfo);
	
	
}
