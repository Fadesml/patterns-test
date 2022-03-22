package ru.fadesml.patterns.builder_sql;

public class Main {
    public static void main(String[] args) {
        SQL sql = SQL.builder()
                .select("*")
                .from("users")
                .where("age", SQLMatcher.MORE, 5)
                .build();
    }
}
