package ru.fadesml.patterns.factory_prototype.indoor;

public class RoseIndoorPlant extends IndoorPlant{
    public RoseIndoorPlant(String name, Integer size) {
        super(name, size);
    }

    public RoseIndoorPlant(IndoorPlant prototype) {
        super(prototype.getName(), prototype.getSize());
    }

    @Override
    public void showIndoor() {
        System.out.println(this);
    }
}
