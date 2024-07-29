package com.granossalis.backend.configuration.pdf;

import com.granossalis.backend.configuration.environment.Variable;
import org.romainlavabre.environment.Environment;
import org.romainlavabre.pdf.PdfConfigurer;
import org.springframework.stereotype.Service;

@Service
public class ConfigurePdf {
    protected final Environment environment;


    public ConfigurePdf( Environment environment ) {
        this.environment = environment;
        configure();
    }


    private void configure() {
        PdfConfigurer
                .init()
                .setPdfTmpDirectory( environment.getEnv( Variable.PDF_TMP_DIRECTORY ) )
                .build();
    }
}
