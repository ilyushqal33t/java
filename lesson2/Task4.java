import java.io.File;

public class Task4 {
    public static void main(String[] args) {
        File dir = new File(".");
        showExtansion(dir.list());
    }

    private static void showExtansion(String[] fileNames) {
        for (int i = 0; i < fileNames.length; i++) {
            int pos = fileNames[i].lastIndexOf('.');
            if (pos == -1) {
                System.out.println();
                continue;
            }
            System.out.println(fileNames[i].substring(pos + 1));
        }
    }
}