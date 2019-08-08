package com.pos.shopeasy;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("user")
public class UsersList {
	@GET
	@Path ("/list")
	public static String userList() throws Exception
	{
		return "Something";
	}
}