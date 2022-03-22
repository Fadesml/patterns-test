package ru.fadesml.patterns.factory_prototype.indoor;

public class IndoorFactory {
    public IndoorPlant createAloe() {
        return new AloeIndoorPlant("aloe", 10);
    }

    public IndoorPlant createAloe(IndoorPlant prototype) {
        return new AloeIndoorPlant(prototype);
    }

    public IndoorPlant createRose() {
        return new RoseIndoorPlant("rose", 20);
    }

    public IndoorPlant createRose(IndoorPlant prototype) {
        return new RoseIndoorPlant(prototype);
    }
}
