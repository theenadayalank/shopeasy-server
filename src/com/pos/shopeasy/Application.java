package com.pos.shopeasy;

import org.glassfish.jersey.server.ResourceConfig;

public class Application extends ResourceConfig
{
	public Application() {
		packages("com.pos.shopeasy");
	}

	public static void main(String[] arg)
	{
		System.out.println("test!");
	}
}