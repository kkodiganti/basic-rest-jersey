package com.example.basic.rest.jersey.config;


import com.example.basic.rest.jersey.rest.UserResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig()
    {
        register(UserResource.class);
    }
}
