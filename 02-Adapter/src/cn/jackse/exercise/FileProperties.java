package cn.jackse.exercise;

import java.io.*;
import java.util.Properties;

/**
 * @Description:
 * @author: Jack
 * @date: 2021年09月28日 23:05
 */
public class FileProperties extends Properties implements FileIO {
    @Override
    public void readFromFile(String filename) throws IOException {
        load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        store(new FileOutputStream(filename), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key, "");
    }

    @Override
    public void printFromFile(String newFilePath) {
        StringBuilder result = new StringBuilder();
        //构造一个BufferReader来读取文件
        try {
            BufferedReader bufferReader = new BufferedReader(new FileReader(newFilePath));
            String s = null;
            //使用Read Line方法，一次读一行
            while ((s = bufferReader.readLine())!=null){
                result.append(System.lineSeparator()+s);
            }
            bufferReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result.toString());

    }
}
