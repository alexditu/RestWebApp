package demo.jersey;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.json.stream.JsonGenerator;
import javax.ws.rs.core.Application;

//import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;
import org.glassfish.jersey.jackson.JacksonFeature;
//import org.glassfish.jersey.moxy.json.MoxyJsonFeature;
//import org.glassfish.jersey.jettison.JettisonFeature;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

//import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

public class RestAppConfig extends Application {
	@Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> s = new HashSet<Class<?>>();
        s.add(RestResource.class);
//        s.add(MoxyJsonFeature.class);
        s.add(JacksonFeature.class);
//        s.add(MOXyJsonProvider.class);
//        s.add(HashMapMessageBodyWriter.class);
//        s.add(JsonMoxyConfigurationContextResolver.class);
//        s.add(JettisonFeature.class);
        return s;
    }
//	
//	@Override
//	public Map<String, Object> getProperties() {
////		Map<String, Object> p = super.getProperties();
//		Map<String, Object> p = new HashMap<>();
//		p.put(JsonGenerator.PRETTY_PRINTING, true);
//		return p;
//	}
	
	@Override
	public Set<Object> getSingletons() {
	    final Set<Object> instances = new HashSet<Object>();

	    instances.add(new JacksonJsonProvider()); //<--------- IMPORTANT
	    return instances;
	}
	
//	@Override
//    public Set<Object> getSingletons() {
//        MOXyJsonProvider moxyJsonProvider = new MOXyJsonProvider();
// 
//        moxyJsonProvider.setAttributePrefix("@");
//        moxyJsonProvider.setFormattedOutput(true);
//        moxyJsonProvider.setIncludeRoot(true);
//        moxyJsonProvider.setMarshalEmptyCollections(false);
//        moxyJsonProvider.setValueWrapper("$");
// 
//        Map<String, String> namespacePrefixMapper = new HashMap<String, String>(1);
//        namespacePrefixMapper.put("http://www.example.org/customer", "cust");
//        moxyJsonProvider.setNamespacePrefixMapper(namespacePrefixMapper);
//        moxyJsonProvider.setNamespaceSeparator(':');
// 
//        HashSet<Object> set = new HashSet<Object>(1);
//        set.add(moxyJsonProvider);
//        return set;
//    }
}
