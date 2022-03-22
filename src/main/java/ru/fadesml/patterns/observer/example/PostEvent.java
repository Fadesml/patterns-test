package ru.fadesml.patterns.observer.example;

import lombok.Getter;
import ru.fadesml.patterns.observer.Event;

@Getter
public class PostEvent extends Event<Post> {
    public PostEvent(String source) {
        super(source);
    }

    public PostEvent(Post body, String source) {
        super(body, source);
    }
}
