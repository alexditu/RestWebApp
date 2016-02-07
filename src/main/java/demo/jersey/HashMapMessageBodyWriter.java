package demo.jersey;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.WebApplicationException;
import java.io.IOException;
import java.io.InputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.HashMap;

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class HashMapMessageBodyWriter implements MessageBodyWriter<HashMap<String, Object>> {
	
	@Override
	public void writeTo(HashMap<String, Object> map,
						Class<?> type,
						Type genericType,
						Annotation[] annotations,
						MediaType mediaType,
						MultivaluedMap<String, Object> httpHeaders,
						OutputStream entityStream)
						throws IOException, WebApplicationException {
		for (String key : map.keySet()) {
			String val = (String) map.get(key);
			String elem = "\"" + key + "\":\"" + val + "\", ";
			entityStream.write(elem.getBytes());
		}
		
	}

	@Override
	public long getSize(HashMap<String, Object> arg0, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType arg4) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isWriteable(Class<?> type, Type arg1, Annotation[] arg2, MediaType arg3) {
		System.out.println("isWriteable called...");
		return type == HashMap.class;
	}}


