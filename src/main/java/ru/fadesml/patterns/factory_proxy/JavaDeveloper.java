package ru.fadesml.patterns.factory_proxy;

public class JavaDeveloper extends Developer{
    public JavaDeveloper(String name) {
        super(name, "java");
    }

    @Override
    public String toString() {
        return "JavaDeveloper{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
