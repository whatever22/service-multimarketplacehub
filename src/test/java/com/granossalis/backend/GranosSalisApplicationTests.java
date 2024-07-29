package com.granossalis.backend;

import ch.vorburger.exec.ManagedProcessException;
import com.granossalis.backend.database.DatabaseProvider;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles( { "test" } )
@DirtiesContext( classMode = DirtiesContext.ClassMode.AFTER_CLASS )
class GranosSalisApplicationTests {

    @BeforeAll
    public static void initDB() throws ManagedProcessException {
        DatabaseProvider.initDB();
    }


    @AfterAll
    public static void cleanup() {
    }


    @Test
    void contextLoads() {
    }

}
