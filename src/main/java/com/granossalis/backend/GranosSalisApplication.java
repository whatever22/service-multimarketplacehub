package com.granossalis.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication( scanBasePackages = { "com.granossalis", "org.romainlavabre", "com.fairfairpackage" } )
@EntityScan( { "com.granossalis", "org.romainlavabre", "com.fairfairpackage" } )
@EnableJpaRepositories( { "com.granossalis", "org.romainlavabre", "com.fairfairpackage" } )
public class GranosSalisApplication {

    public static void main( final String[] args ) {
        SpringApplication.run( GranosSalisApplication.class, args );
    }


    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings( final CorsRegistry registry ) {
                final String pattern = "/**";

                registry.addMapping( pattern )
                        .allowedMethods( "GET", "POST", "PUT", "DELETE", "PATCH" )
                        .allowedOrigins( "*" )
                        .exposedHeaders( "Location", "Authorization" );
            }
        };
    }
}
