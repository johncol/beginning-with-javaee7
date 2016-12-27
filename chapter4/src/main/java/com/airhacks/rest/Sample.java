package com.airhacks.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("sample")
public class Sample {
	
	@GET
	public String sample() {
		return "nice!";
	}

}
