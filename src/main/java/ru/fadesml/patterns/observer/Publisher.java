package ru.fadesml.patterns.observer;

import java.util.List;

public interface Publisher<T extends Event<?>> {
    List<Subscriber<T>> getSubscribers();
    void publish(T ... events);
}
