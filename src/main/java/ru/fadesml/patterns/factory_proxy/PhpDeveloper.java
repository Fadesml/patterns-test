package ru.fadesml.patterns.factory_proxy;

public class PhpDeveloper extends Developer{
    public PhpDeveloper(String name) {
        super(name, "php");
    }

    @Override
    public String toString() {
        return "PhpDeveloper{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
