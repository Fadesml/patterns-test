package ru.fadesml.patterns.observer.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        User andrew = new User("Andrew");
        User harry = new User("Harry");

        System.out.println("USERS: {");
        System.out.println(andrew);
        System.out.println(harry);
        System.out.println("}");
        
        PostPublisher postPublisher = new PostPublisher(List.of(andrew, harry));

        Post first = new Post("1", "Первая новость");
        Post second = null;

        postPublisher.publish(new PostEvent(first, Main.class.getName()), new PostEvent(second, Main.class.getName()));

        System.out.println("USERS: {");
        System.out.println(andrew);
        System.out.println(harry);
        System.out.println("}");
    }
}
