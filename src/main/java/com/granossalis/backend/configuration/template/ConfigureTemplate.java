package com.granossalis.backend.configuration.template;

import com.granossalis.backend.configuration.environment.Variable;
import org.romainlavabre.environment.Environment;
import org.romainlavabre.template.TemplateConfigurer;
import org.springframework.stereotype.Service;

@Service
public class ConfigureTemplate {
    protected final Environment environment;


    public ConfigureTemplate( Environment environment ) {
        this.environment = environment;
        configure();
    }


    private void configure() {
        TemplateConfigurer
                .init()
                .setBaseTemplatePath( environment.getEnv( Variable.BASE_TEMPLATE_PATH ) )
                .build();
    }
}
