package com.granossalis.backend.configuration.history;

import org.romainlavabre.history.HistoryDataProvider;
import org.romainlavabre.request.Request;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Romain Lavabre <romainlavabre98@gmail.com>
 */
@Service
public class HistoryConfigurerImpl implements HistoryDataProvider {

    protected final Request request;


    public HistoryConfigurerImpl( Request request ) {
        this.request = request;
    }


    @Override
    public Optional< Integer > getAuthorId() {
        return Optional.empty();
    }


    @Override
    public Optional< String > getAuthorName() {
        return Optional.empty();
    }


    @Override
    public Optional< String > getAuthorIp() {
        return Optional.empty();
    }
}
