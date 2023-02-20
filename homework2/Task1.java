/*
 * В файле содержится строка с исходными данными в такой форме:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
 */

public class Task1{
   public static void main(String[] args) {
        String str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        str = str.substring(1, str.length()-1);
        String[] splt = str.split(", ");
        StringBuilder builder = new StringBuilder();
        builder.append("SELECT * FROM students WHERE ");
        for (String part : splt) {
            String[] keyValue = part.split(":");
            String key = keyValue[0];
            key = key.substring(1, key.length()-1);
            String value = keyValue[1];
            if(value.equals("\"null\"") ){
               continue;
            }
            else{
                builder.append(String.format("%s = %s", key, value));
            }
            if(key.equals("city")){
                continue;
            }
            else{
                builder.append(" AND ");
            }
        }
        System.out.println(builder.toString());
   } 
}