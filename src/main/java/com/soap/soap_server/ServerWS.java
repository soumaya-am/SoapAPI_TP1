package com.soap.soap_server;

import jakarta.xml.ws.Endpoint;

public class ServerWS {
    public static void main(String[] args) {
        String url="http://localhost:8081/ ";
        Endpoint.publish(url,new ProductWebService());
        System.out.println(url + " deployed");
    }
}
