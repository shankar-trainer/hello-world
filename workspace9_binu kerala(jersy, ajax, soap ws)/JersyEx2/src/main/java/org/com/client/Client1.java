package org.com.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

import com.fasterxml.jackson.core.base.GeneratorBase;

public class Client1 {

	public static void main(String[] args) {
		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target1 = client.target("http://localhost:9090/JersyEx2/rest/hello/result1");

 target2 = client.target("http://localhost:9090/JersyEx2/");

		/*String response1 = target1.request().accept(MediaType.TEXT_HTML).get(Response.class).toString();
		String response2 = target2.path("rest").path("hello").path("result1").request().accept(MediaType.TEXT_PLAIN)
				.get(Response.class).toString();

		System.out.println(response1);
		System.out.println(response2);*/

		String htmlAnswer = target1.request().accept(MediaType.TEXT_HTML)
				.get(String.class);
		System.out.println(htmlAnswer);

		
		 htmlAnswer = target2.path("rest").path("hello").path("result1").request().accept(MediaType.TEXT_HTML)
				.get(String.class);
		System.out.println(htmlAnswer);

		
		String xmlAnswer = target2.path("rest").path("hello").path("result2").request().accept(MediaType.APPLICATION_XML).get(String.class);
		System.out.println(xmlAnswer);

		String jsonAnswer = target2.path("rest").path("hello").path("result3").request().accept(MediaType.APPLICATION_JSON).get(String.class);
		System.out.println(jsonAnswer);
	}
}
