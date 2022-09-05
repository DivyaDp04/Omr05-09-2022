package com.base;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClassAPI {

	RequestSpecification reqSpec;
	 Response response;

	public void addHeader(String key, String value) {

		reqSpec = RestAssured.given().header(key,value);
	}
	public void addHeaders(Headers headers) {

//		List<Header> header = new ArrayList<Header>();
//		Header h1 =new Header("", "");
//		Header h2 =new Header("", "");
//		Header h3 =new Header("", "");
//		
//		header.add(h1);
//		header.add(h2);
//		header.add(h3);
//		
//		Headers headers = new Headers(header);
		RestAssured.given().headers(headers);
	}
	public void queryParam(String key, String value) {

		reqSpec = reqSpec.queryParam(key, value);
	}
	public void pathParam(String key, String value) {

		reqSpec = reqSpec.queryParam(key, value);
	}
	public void addBody(Object body) {

		reqSpec = reqSpec.body(body);
	}
	public Response requestType(String type,String endPoint) {

		switch (type) {
		case "GET":
			response = reqSpec.get(endPoint);
			break;
		case "POST":
			response = reqSpec.post(endPoint);
			break;
		case "PUT":
			response = reqSpec.put(endPoint);
			break;
		case "DELETE":
			response = reqSpec.delete(endPoint);
			break;

		default:
			break;
		}
		return response;
	}
	
 	public int getStatusCode(Response response) {

 		int statusCode = response.getStatusCode();
 		return statusCode;
 		
	}
 	public String getResBodyAsString(Response response) {

 		String asString = response.asString();
 		return asString;
	}
 	
 	public String resBodyAsPrettyString(Response response) {

 		String asPrettyString = response.asPrettyString();
 		return asPrettyString;
	}
 	
 	
 	public void basicAuthLogin(String username,String password) {
 		reqSpec = reqSpec.auth().preemptive().basic(username, password);

	}

}
