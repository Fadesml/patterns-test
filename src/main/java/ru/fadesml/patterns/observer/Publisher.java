package ru.fadesml.patterns.observer;

import java.util.List;

public interface Publisher<BODY, T extends Event<BODY>> {
    List<Subscriber<BODY, T>> getSubscribers();
    void publish(T ... events);
}
