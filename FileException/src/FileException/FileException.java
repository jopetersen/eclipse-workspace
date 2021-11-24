package FileException;
import java.io.*;
import java.util.Scanner;
public class FileException {
public static void main(String[] args) {
Scanner scnr = new Scanner(System.in);
try {
File file = new File("test.txt");
Scanner scanFile = new Scanner(file);
System.out.println("File found.");
}
catch (FileNotFoundException e) {
System.out.println("File not found.");
}
finally {
scnr.close();
}
System.out.println("Done.");
}
}