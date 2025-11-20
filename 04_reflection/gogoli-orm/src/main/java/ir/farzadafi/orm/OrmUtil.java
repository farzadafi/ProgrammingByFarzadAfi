package ir.farzadafi.orm;

public class OrmUtil {

    public static String convertCamelCaseToSnakeCase(String columnName) {
        StringBuilder column = new StringBuilder();
        for (int i = 0; i < columnName.length(); i++) {
            char c = columnName.charAt(i);
            if (Character.isLowerCase(c))
                column.append(c);
            else
                column.append("_")
                        .append(Character.toLowerCase(c));
        }
        return column.toString();
    }
}
