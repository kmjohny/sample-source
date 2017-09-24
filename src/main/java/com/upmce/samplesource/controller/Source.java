package com.upmce.samplesource.controller;

import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController(value = "SourceController")
@RequestMapping(value="/source")
public class Source {

  @Autowired
  private RestTemplate targetRestTemplate;

  @Value("${sample.target.URI}")
  private URI targetUrl;

  @RequestMapping(value="/hello", method=RequestMethod.GET)
  public String hello () {
    return getHostName() + " -> " + targetRestTemplate.getForObject(targetUrl, String.class);
  }

  private String getHostName() {
    String output = "";
    try {
      InetAddress myHost = InetAddress.getLocalHost();
      output = myHost.getHostName();
    } catch (UnknownHostException ex) {
      ex.printStackTrace();
    }
    return output;
  }
}
