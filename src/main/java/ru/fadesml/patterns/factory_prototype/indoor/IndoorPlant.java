package ru.fadesml.patterns.factory_prototype.indoor;

import lombok.Getter;
import lombok.Setter;
import ru.fadesml.patterns.factory_prototype.Plant;

@Getter
@Setter
public abstract class IndoorPlant extends Plant {
    protected final String type = "outdoor";
    public IndoorPlant(String name, Integer size) {
        super(name, size);
    }

    public abstract void showIndoor();

    @Override
    public String toString() {
        return "IndoorPlant{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}
