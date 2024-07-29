package com.granossalis.backend.configuration.history;

import com.granossalis.backend.configuration.event.Event;
import org.romainlavabre.history.HistoryConfigurer;
import org.romainlavabre.history.HistoryDataProvider;
import org.springframework.stereotype.Service;

@Service
public class ConfigureHistory {

    protected final HistoryDataProvider historyDataProvider;


    public ConfigureHistory( HistoryDataProvider historyDataProvider ) {
        this.historyDataProvider = historyDataProvider;
        configure();
    }


    private void configure() {
        HistoryConfigurer
                .init()
                .setHistoryDataProvider( historyDataProvider )
                .setOnTransactionSuccessEvent( Event.TRANSACTION_SUCCESS )
                .build();
    }
}
