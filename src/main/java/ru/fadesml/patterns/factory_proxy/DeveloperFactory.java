package ru.fadesml.patterns.factory_proxy;

public class DeveloperFactory {
    public IDeveloper createJavaDeveloper() {
        return DeveloperProxy.of(new JavaDeveloper("Сергей"));
    }

    public IDeveloper createPhpDeveloper() {
        return DeveloperProxy.of(new PhpDeveloper("Максим"));
    }
}
