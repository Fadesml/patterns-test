package ru.fadesml.patterns.factory_prototype.outdoor;

public class AloeOutdoorPlant extends OutdoorPlant{
    public AloeOutdoorPlant(String name, Integer size) {
        super(name, size);
    }

    public AloeOutdoorPlant(OutdoorPlant prototype) {
        super(prototype.getName(), prototype.getSize());
    }

    @Override
    public void showOutdoor() {
        System.out.println(this);
    }
}
