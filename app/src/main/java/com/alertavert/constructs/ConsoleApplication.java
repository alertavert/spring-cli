package com.alertavert.constructs;

import jakarta.annotation.PostConstruct;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;


/**
 * <h3>ConsoleApplication</h3>
 *
 * @author M. Massenzio, 2021-10-27
 */
@Component
@Log
public class ConsoleApplication {

  private final String dbUri;
  private final int clusterSize;

  public ConsoleApplication(String dbUri, int clusterSize) {
    this.dbUri = dbUri;
    this.clusterSize = clusterSize;
  }

  @PostConstruct
  public void execute() {
    log.info("🛠️ Connecting to: " + dbUri);
    log.info("⚙️Running size: " + clusterSize);
  }
}
