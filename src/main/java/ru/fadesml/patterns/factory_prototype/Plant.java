package ru.fadesml.patterns.factory_prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Plant {
    protected String name;
    protected Integer size;

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
