package ru.fadesml.patterns.factory_prototype.outdoor;

public class RoseOutdoorPlant extends OutdoorPlant{
    public RoseOutdoorPlant(String name, Integer size) {
        super(name, size);
    }

    public RoseOutdoorPlant(OutdoorPlant prototype) {
        super(prototype.getName(), prototype.getSize());
    }

    @Override
    public void showOutdoor() {
        System.out.println(this);
    }
}