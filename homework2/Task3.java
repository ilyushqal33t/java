/*
 * В файле содержится строка с данными:
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */
public class Task3 {
    public static void main(String[] args) {
        String str = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        str = cut(str);
        String[] splt = str.split(", ");
        String name = "", grade = "", subj = "";
        for (String students : splt) {
            students = cut(students);
            String[] keyValues = students.split(",");
            for (String keyValue : keyValues) {
                String[] keyValuesPart = keyValue.split(":");
                String key = cut(keyValuesPart[0]);
                String value = cut(keyValuesPart[1]);
                if (key.equals("фамилия")) {
                    name = value;
                } else if (key.equals("оценка")) {
                    grade = value;
                } else if (key.equals("предмет")) {
                    subj = value;
                }
            }
            System.out.printf("Студент %s получил %s по предмету %s\n", name, grade, subj);
        }
    }

    private static String cut(String str) {
        return str.substring(1, str.length() - 1);
    }
}
