package com.knowarth.hackathon.kyb;

import static spark.Spark.get;

import javax.ws.rs.WebApplicationException;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class SparkExample {
    public static final String TR_API_URL = "https://api.twitter.com/1.1/search/tweets.json";
    public static final String TR_API_KEY = "TlN1SOAKvfVMNlryjCFLKA";
    public static final String TR_API_PASSWORD = "SlAseJKhrxErNuZkkR988axG5irMNrGnhiVNxkpTTao";

    public static void main(String[] args) {
        get("/hello", (req, res) -> {
                // Create Jersey client
//                ClientConfig clientConfig = new DefaultClientConfig();
//                clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
//                Client client = Client.create(clientConfig);
//                
//                WebResource webResourceGet = client.resource(TR_API_URL).queryParam("q", "knowarth");
//                ClientResponse response = webResourceGet.get(ClientResponse.class);
//
//                if (response.getStatus() != 200) {
//                    throw new WebApplicationException();
//                }
//
//                return response.toString();
                return "Hello World";
            });
        
        get("/helloWorld", (req, res) -> {
            // Create Jersey client
//            ClientConfig clientConfig = new DefaultClientConfig();
//            clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
//            Client client = Client.create(clientConfig);
//            
//            WebResource webResourceGet = client.resource(TR_API_URL).queryParam("q", "knowarth");
//            ClientResponse response = webResourceGet.get(ClientResponse.class);
//
//            if (response.getStatus() != 200) {
//                throw new WebApplicationException();
//            }
//
//            return response.toString();
            return "Hello World";
        });
    }

}
