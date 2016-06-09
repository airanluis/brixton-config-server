package com.bbva.openplatform.configserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author BBVA OpenPlatform Developer Team
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer {
    protected ConfigServer() {
    }

    public static void main(String args[]) {
        new SpringApplicationBuilder(ConfigServer.class).web(true).run(args);
    }
}

