package ru.fadesml.patterns.builder_sql;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SQLMatcher {
    EQUAL("="),
    MORE(">"),
    LESS("<"),
    NOT_EQUAL("!=");

    private final String original;
}
