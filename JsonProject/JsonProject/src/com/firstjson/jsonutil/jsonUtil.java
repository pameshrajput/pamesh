package com.firstjson.jsonutil;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class jsonUtil {

	private static ObjectMapper mapper;
	static {
		mapper = new ObjectMapper();//   object mapper present inside a jackson jar file
	}
   public static String ConvertJavaToJson(Object object)
   {
	   String jsonResult="";
	     
	    	 try {
				jsonResult = mapper.writeValueAsString(object);
			} 
	    	  catch(JsonGenerationException  e)
		     {
		    	 System.out.println("exception while converting java object into json "+e.getMessage());
		     }
	    	 catch (JsonMappingException e) {
	    		 System.out.println("exception while converting java object into json "+e.getMessage());
			} catch (IOException e) {
				System.out.println("exception while converting java object into json "+e.getMessage());
			}
	        
	   return jsonResult;
   }
   
   public static <T> T ConvertJsonToJava(String jsonString, Class<T>cls) {
	   T result =null;
	   try {
		result = mapper.readValue(jsonString, cls);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("exception while converting java object into json "+e.getMessage());
	}
	return result;
	   
   }
}
