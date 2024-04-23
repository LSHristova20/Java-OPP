package Classwork.DvadesetITretiApril;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        String pathString = "C:\\Users\\lshristova20\\IdeaProjects\\Java-OOP\\Classwork\\DvadesetITretiApril\\input.txt";
        String output = "C:\\Users\\lshristova20\\IdeaProjects\\Java-OOP\\Classwork\\DvadesetITretiApril\\empty.txt";
        Path paths = Paths.get(pathString);
        Path outputPath = Paths.get(output);
        try {
            String path = null;
            FileInputStream fileStream = new FileInputStream(path);

            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileStream);
           byte[] myByte = bufferedInputStream.readAllBytes();

            System.out.println("Byte : ");
            for (int i = 0; i < myByte.length; i++) {
                System.out.print(Character.toChars(myByte[i]));
            }
            System.out.println("Character :");
            List<String> lines = Files.readAllLines(paths);
            Files.write(outputPath, lines);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
