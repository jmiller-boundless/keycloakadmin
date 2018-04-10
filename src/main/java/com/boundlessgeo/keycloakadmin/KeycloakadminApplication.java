package com.boundlessgeo.keycloakadmin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;

@SpringBootApplication
public class KeycloakadminApplication {

    private static final Logger LOG = LoggerFactory.getLogger(KeycloakadminApplication.class);

    @Value("${spring.profiles.active}")
    protected String springProfilesActive;


    public void onApplicationEvent(ContextRefreshedEvent event) {
        LOG.info("=======================================");
        LOG.info("App running with active profiles: {}", springProfilesActive);
        LOG.info("=======================================");
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(KeycloakadminApplication.class, args);
    }
}
