package ru.fadesml.patterns.factory_prototype.outdoor;

import lombok.Getter;
import lombok.Setter;
import ru.fadesml.patterns.factory_prototype.Plant;

@Getter
@Setter
public abstract class OutdoorPlant extends Plant {
    protected final String type = "outdoor";
    public OutdoorPlant(String name, Integer size) {
        super(name, size);
    }

    public abstract void showOutdoor();

    @Override
    public String toString() {
        return "OutdoorPlant{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}
