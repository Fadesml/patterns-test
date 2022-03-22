package ru.fadesml.patterns.factory_proxy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Developer implements IDeveloper{
    protected String name;
    protected String type;

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
