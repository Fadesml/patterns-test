package ru.fadesml.patterns.factory_prototype.indoor;

public class AloeIndoorPlant extends IndoorPlant{
    public AloeIndoorPlant(String name, Integer size) {
        super(name, size);
    }

    public AloeIndoorPlant(IndoorPlant prototype) {
        super(prototype.getName(), prototype.getSize());
    }

    @Override
    public void showIndoor() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "AloeIndoorPlant{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}
