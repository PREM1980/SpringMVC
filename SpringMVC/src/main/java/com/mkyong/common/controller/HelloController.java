package com.mkyong.common.controller;

import java.io.BufferedReader;

import javax.xml.bind.DatatypeConverter;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriBuilder;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.wallet.online.jwt.JwtResponse;
import com.google.wallet.online.jwt.util.JWTGenerator;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.core.util.MultivaluedMapImpl;



class Global{
	public static String GOOGLE_CLIENT_ID = "594955281886-bqr0dbmdrabqaonmheiqk0skddf5alk5.apps.googleusercontent.com";
	public static String GOOGLE_REDIRECT_URL =  "http://localhost:8080/SpringMVC/oauth2callback";
	public static String GOOGLE_SECRET = "r6L67Y8KFCaOn4xUaJF-k6Gq";
}

@Controller
@RequestMapping("/welcome")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";

	}

}

@Controller
class OAuthController extends HttpServlet{
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Prem Initialized");
	//	 super.init(config); 
		 }
	
	@RequestMapping(value = "/googlelogin", method = RequestMethod.POST)
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		//System.out.println("Google login");
		//ServletContext context = getServletContext();
		System.out.println("Google login-1");
		//String GOOGLE_CLIENT_ID = context.getInitParameter("GOOGLE_CLIENT_ID");
		//String GOOGLE_REDIRECT_URL = context.getInitParameter("GOOGLE_REDIRECT_URL");
		
		String url = "https://accounts.google.com/o/oauth2/auth?client_id=" + Global.GOOGLE_CLIENT_ID + "&response_type=code&scope=openid%20email&redirect_uri="+Global.GOOGLE_REDIRECT_URL;
		url = new String(url);
		response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
	    response.setHeader("Location", url);
		response.sendRedirect(url);
		
	}
	
	
}

@Controller
class CallBack {
	@RequestMapping(value = "/oauth2callback", method = RequestMethod.GET)
	public void addStudent(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws IOException, ServletException, ClientHandlerException, UniformInterfaceException, JSONException {
		System.out.println("Prem= " + request.getParameter("code"));
		////http://www.javacodegeeks.com/2012/09/simple-rest-client-in-java.html
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource webResource = client.resource(UriBuilder.fromUri("https://accounts.google.com/o/oauth2/token").build());
		MultivaluedMap formData = new MultivaluedMapImpl();
		formData.add("code", request.getParameter("code"));
		formData.add("client_id", Global.GOOGLE_CLIENT_ID);
		formData.add("redirect_uri", Global.GOOGLE_REDIRECT_URL);
		formData.add("client_secret", Global.GOOGLE_SECRET);
		formData.add("grant_type", "authorization_code");
		ClientResponse response1 = webResource.type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).post(ClientResponse.class, formData);
		JSONObject jobject = new JSONObject(response1.getEntity(String.class));
		String token_id = jobject.getString("id_token");
		String[] base64EncodedSegments = token_id.split("\\.");
		System.out.println(Arrays.toString(base64EncodedSegments));
		String base64EncodedHeader = base64EncodedSegments[0];
		String base64EncodedClaims = base64EncodedSegments[1];
		JsonParser parser = new JsonParser();
        JsonElement payload = parser.parse(StringUtils.newStringUtf8(Base64.decodeBase64(base64EncodedClaims)));
        JSONObject emailobject = new JSONObject(payload.toString());
		String emailid = emailobject.getString("email");
		
		//ClientResponse response1 = webResource.type(MediaType).post(ClientResponse.class, formData);
		//System.out.println(response1.getEntity(String.class));
		//System.out.println(response1.getEntity(String.class).getClass().getName());
		//System.out.println(response1.getClass().getName());

		//byte[] claims = DatatypeConverter.parseBase64Binary(base64EncodedClaims);
		//JSONObject emailobject = new JSONObject(new String(claims));
		//String emailid = emailobject.getString("email");
		//System.out.println(emailid);
		
		
		//JSONObject jsonOutput = (JSONObject) JSONSerializer.toJSON( response.getEntity(String.class));
		//((HttpServletResponse) response1).sendRedirect("http://localhost:8080/SpringMVC/startpage");
		response.sendRedirect("http://localhost:8080/SpringMVC/startpage");
	}
}

@Controller
class StartPage {
	@RequestMapping(value = "/startpage", method = RequestMethod.GET)
	public String addStudent(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws IOException {
		model.addAttribute("message",
				"Spring 3 MVC Hello World!!!!");
		return "hello";
	}
}

@Controller
class dummyPage {
	@RequestMapping(value = "/dummypage", method = RequestMethod.GET)
	public String addStudent(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws IOException {
		model.addAttribute("message",
				"Spring 3 MVC Hello World");
		return "hello";
	}
}
