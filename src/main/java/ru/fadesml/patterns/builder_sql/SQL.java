package ru.fadesml.patterns.builder_sql;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SQL {
    private String request = "";

    public static Builder builder() {
        return new SQL().new Builder();
    }
    //TODO SQUASHING
    public class Builder {
        private Builder() {
            //private constructor
        }

        public Builder select(String ... columns) {
            String res;
            StringBuilder columnsAsSql = new StringBuilder();

            for (int i = 0; i < columns.length; i++) {
                if (i != 0) {
                    columnsAsSql.append(",");
                }
                columnsAsSql.append("`").append(columns[i]).append("`");
            }

            if (columnsAsSql.toString().contains("*")) {
                res = "*";
            } else {
                res = columnsAsSql.toString();
            }


            SQL.this.request = SQL.this.request.concat("SELECT " + res);

            return this;
        }

        public Builder from(String table) {
            SQL.this.request = SQL.this.request.concat(" FROM `" + table + "`");

            return this;
        }

        public Builder where(String column, SQLMatcher matcher, Object obj) {
            if (!SQL.this.request.contains("WHERE")) {
                SQL.this.request = SQL.this.request.concat(" WHERE " + "`" + column + "` " + matcher.getOriginal() + " " + obj.toString());
            } else {
                SQL.this.request = SQL.this.request.concat(" AND " + "`" + column + "` " + matcher.getOriginal() + " " + obj.toString());
            }

            return this;
        }

        public SQL build() {
            SQL.this.request = SQL.this.request.concat(";");
            return SQL.this;
        }
    }
}
