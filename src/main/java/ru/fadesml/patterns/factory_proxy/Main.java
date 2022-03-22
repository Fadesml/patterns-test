package ru.fadesml.patterns.factory_proxy;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        System.out.println(developerFactory.createJavaDeveloper());
        System.out.println(developerFactory.createPhpDeveloper());
    }
}
