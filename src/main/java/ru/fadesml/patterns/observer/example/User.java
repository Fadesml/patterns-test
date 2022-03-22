package ru.fadesml.patterns.observer.example;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.fadesml.patterns.observer.Subscriber;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class User implements Subscriber<PostEvent> {
    private final String name;
    private List<Post> acceptedPosts = new ArrayList<>();

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", acceptedPosts=" + acceptedPosts +
                '}';
    }

    @Override
    public void acceptEvent(PostEvent event) {
        System.out.println("Пользователь: " + this.name + " поймал событие от: " + event.getSource());
        if (event.getBody().isPresent()) {
            System.out.println("Пользователь: " + this.name + " поймал пост " + event.getBody().get().getName());
            this.acceptedPosts.add(event.getBody().get());
        } else {
            System.out.println("Пользователь: " + this.name + " поймал null пост!");
        }
    }
}
