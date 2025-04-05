package com.vaghani.SecurityApp.SpringSecurityApp.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }

}
