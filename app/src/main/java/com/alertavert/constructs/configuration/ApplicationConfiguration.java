package com.alertavert.constructs.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <h3>ApplicationConfiguration</h3>
 *
 * @author M. Massenzio, 2021-10-27
 */
@Configuration
public class ApplicationConfiguration {
  private final ApplicationProperties properties;

  @Value("${cluster.size}")
  int clusterSize;

  public ApplicationConfiguration(ApplicationProperties properties) {
    this.properties = properties;
  }

  @Bean
  public int clusters() {
    return clusterSize;
  }

  @Bean
  public String dbUri() {
    return String.format("mongodb://%s:%d/%s", properties.host,
        properties.port, properties.databaseName);
  }
}
