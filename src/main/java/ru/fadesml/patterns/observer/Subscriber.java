package ru.fadesml.patterns.observer;

public interface Subscriber<BODY, T extends Event<BODY>> {
    void acceptEvent(T event);
}
