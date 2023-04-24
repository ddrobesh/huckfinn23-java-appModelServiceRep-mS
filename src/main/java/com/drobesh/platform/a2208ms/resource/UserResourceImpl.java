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

import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.springframework.stereotype.Controller;

import com.drobesh.platform.a2208ms.model.TheModelUser;
import com.drobesh.platform.a2208ms.representation.Resource;

// Layer 1-of-3 (URL --> Resource->Service->Repository
@Controller
public class UserResourceImpl implements UserResource {

	private static String baseUrl = "v1/users";
	
	//@Autowired
	//private UserService userService;
	
	@Override
	public Response getUser(String pUserId) {
System.out.println("GET Youre inside! " + pUserId);
		TheModelUser idpUser = null; //todo userService.getUser(pUserId);
		
		//TheUserService userService = userService.getTheUserModel(pUserId);
		
		//TODO: optional/remove hardcoded link builder. Don't need this.
		Link link = Link
					.fromUri(baseUrl)
					.rel("self").build(pUserId);
		
		Resource<TheModelUser> resource = new Resource<TheModelUser>(idpUser);
		return Response.ok(resource).links(link).build();
	}

	@Override
	public Response createUser(TheModelUser user, UriInfo uriInfo) {
// https://gist.github.com/subfuzion/08c5d85437d5d4f00e58
// curl --url http://127.0.0.1:8091/msapi/test2208DemoMs/v1/users/ -H "Content-Type: application/json"  -X POST {"dd3152","David01"}
//		-d @data.txt		-d @data.json
System.out.println("POST You are inside! " + user);

		//validation
		TheModelUser created = null; // userService.createUser
				
		UriBuilder builder = uriInfo.getRequestUriBuilder();
if ( created!=null ) {
		builder.path(created.getId());
} else {
		builder.path("id007");
}
		return Response.created(builder.build()).build();
	}

}
