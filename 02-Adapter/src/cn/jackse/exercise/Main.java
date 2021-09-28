package cn.jackse.exercise;

import java.io.IOException;

/**
 * @Description:
 * @author: Jack
 * @date: 2021年09月28日 23:04
 */
public class Main {
    public static void main(String[] args) {
        FileProperties fileProperties = new FileProperties();
        String filePath = Main.class.getResource("file.txt").getPath();
        String newFilePath = Main.class.getResource("").getPath() + "newfile.txt";
        try {
            fileProperties.readFromFile(filePath);
            fileProperties.setValue("year","2004");
            fileProperties.setValue("month","4");
            fileProperties.writeToFile(newFilePath);
            fileProperties.printFromFile(newFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
