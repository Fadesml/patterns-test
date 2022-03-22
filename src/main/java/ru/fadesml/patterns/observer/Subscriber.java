package ru.fadesml.patterns.observer;

public interface Subscriber<T extends Event<?>> {
    void acceptEvent(T event);
}
