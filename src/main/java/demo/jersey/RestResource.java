package demo.jersey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Path("rest")
public class RestResource {
	private static final Logger log = LogManager.getLogger(RestResource.class);
	
	@GET
    @Path("test1")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonArray test(@QueryParam("p") String param) {
    	log.debug("Got param: " + param);

    	HashMap<String, String> m = new HashMap<>();
    	m.put("key1", "value1");
    	
    	ArrayList<String> list = new ArrayList<>();
    	list.add("a");
    	list.add("b");
    	list.add("c");
    	
    	
    	
    	JsonArray a = Json.createArrayBuilder().add("a").add("b").build();
    	return a;
    }
	
	@GET
    @Path("test2")
    @Produces(MediaType.APPLICATION_JSON)
	public Person getP() {
		Person p = new Person(20, "Alex", "Ditu");
		ArrayList<String> l = new ArrayList<String>();
		l.add("x");
		l.add("x");
		l.add("x");
		p.setL(l);
		
		HashMap<String, String> m = new HashMap<>();
		m.put("adsad", "sdasda");
		p.setM(m);
		return p;
	}
	
	@GET
    @Path("test3")
    @Produces(MediaType.APPLICATION_JSON)
	public HashMap<String, String> test3() {
		HashMap<String, String> m = new HashMap<>();
    	m.put("key1", "value1");
		return m;
	}
	
	@GET
    @Path("test4")
    @Produces(MediaType.APPLICATION_JSON)
	public String test4() {
		HashMap<String, String> m = new HashMap<>();
    	m.put("key1", "value1");
		return "ana";
	}

}
