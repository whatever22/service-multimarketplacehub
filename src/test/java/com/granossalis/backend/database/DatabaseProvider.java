package com.granossalis.backend.database;

import ch.vorburger.exec.ManagedProcessException;
import ch.vorburger.mariadb4j.springframework.MariaDB4jSpringService;

public class DatabaseProvider {
    private static MariaDB4jSpringService DB;


    public static void initDB() throws ManagedProcessException {
        if ( DB == null || !DB.isRunning() ) {
            DB = new MariaDB4jSpringService();
            DB.getConfiguration()
                    .addArg( "--user=root" )
                    .addArg( "--character-set-server=utf8mb4" )
                    .addArg( "--collation-server=utf8mb4_general_ci" )
                    .addArg( "--max-connections=20000" );
            DB.setDefaultPort( 3305 );
            DB.start();
            DB.getDB().createDB( "granos-salis" );
            return;
        }

        DB.getDB().run( "DROP DATABASE IF EXISTS `granos-salis`;" );
        DB.getDB().createDB( "granos-salis" );

    }
}
