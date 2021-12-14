/*
 * import java.net.URI;
 * 
 * import javax.ws.rs.client.Client; import javax.ws.rs.client.ClientBuilder;
 * import javax.ws.rs.client.WebTarget; import javax.ws.rs.core.MediaType;
 * import javax.ws.rs.core.Response; import javax.ws.rs.core.UriBuilder;
 * 
 * import org.glassfish.jersey.client.ClientConfig;
 * 
 * public class Client1 {
 * 
 * public static void main(String[] args) { ClientConfig clientConfig=new
 * ClientConfig();
 * 
 * Client client=ClientBuilder.newClient(clientConfig);
 * 
 * String weburi="http://localhost:9090/RestApp1-0.0.1-SNAPSHOT/rest/hello"; URI
 * uri=UriBuilder.fromUri(weburi).build();
 * 
 * WebTarget target=client.target(uri);
 * 
 * System.out.println(target.path("rest").path("hello").request().accept(
 * MediaType.TEXT_PLAIN). get(Response.class).toString()); } }
 */