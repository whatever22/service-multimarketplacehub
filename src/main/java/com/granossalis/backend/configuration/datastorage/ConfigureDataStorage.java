package com.granossalis.backend.configuration.datastorage;

import com.granossalis.backend.configuration.event.Event;
import org.romainlavabre.database.DataStorageConfigurer;
import org.springframework.stereotype.Service;

@Service
public class ConfigureDataStorage {

    public ConfigureDataStorage() {
        configure();
    }


    private void configure() {
        DataStorageConfigurer
                .init()
                .setTransactionSuccessEvent( Event.TRANSACTION_SUCCESS )
                .build();
    }
}
