package com.upmce.samplesource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration (value = "SourceConfig")
public class Source {

  @Bean
  public RestTemplate targetRestTemplate () {
    return new RestTemplate();
  }
}
