package Lb5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    private File file;
    public FileRead(StringBuilder a) throws FileNotFoundException {

        file = new File("src/main/resourses/info.txt");
        getClass().getResource("/info.txt");
        Scanner hemp = new Scanner(file);
        while (hemp.hasNextLine()) {

            a.append(hemp.nextLine() + "\n");

        }
    }
}
