package ru.fadesml.patterns.observer.example;

import ru.fadesml.patterns.observer.Publisher;
import ru.fadesml.patterns.observer.Subscriber;

import java.util.List;

public class PostPublisher implements Publisher<Post, PostEvent> {
    private final List<Subscriber<Post, PostEvent>> subscribers;

    public PostPublisher(List<Subscriber<Post, PostEvent>> subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public List<Subscriber<Post, PostEvent>> getSubscribers() {
        return this.subscribers;
    }

    @Override
    public void publish(PostEvent ... events) {
        for (Subscriber<Post, PostEvent> subscriber : this.subscribers) {
            for (PostEvent event : events) {
                subscriber.acceptEvent(event);
            }
        }
    }
}
