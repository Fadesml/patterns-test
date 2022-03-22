package ru.fadesml.patterns.observer;


import lombok.Getter;

import java.util.Optional;

@Getter
public class Event<T>{
    /**
     * Контент события
     */
    protected Optional<T> body;

    /**
     * Источник события
     */
    protected final String source;

    public Event(String source) {
        this.source = source;
    }

    public Event(T body, String source) {
        this.body = (body != null) ? Optional.of(body) : Optional.empty();
        this.source = source;
    }
}
