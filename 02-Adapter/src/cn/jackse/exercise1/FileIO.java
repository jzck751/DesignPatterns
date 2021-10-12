package cn.jackse.exercise1;

import java.io.IOException;

/**
 * @Description:
 * @author: Jack
 * @date: 2021年09月28日 23:01
 */
public interface FileIO {
    public void readFromFile(String filename) throws IOException;

    public void writeToFile(String filename) throws IOException;

    public void setValue(String key, String value);

    public String getValue(String key);

    public void printFromFile(String newFilePath);
}
