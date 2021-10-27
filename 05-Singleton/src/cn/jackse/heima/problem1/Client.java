package cn.jackse.heima.problem1;

import java.io.*;

/**
 * @author Jack
 * @version 1.0
 * @description: 使用序列化和反序列化模拟破坏单例模式
 * @date 2021/10/27 20:34
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //writeToFile();
        readObjectFromFile();
        readObjectFromFile();
    }

    /**
     * 从文件中读取数据(对象)
     */
    public static void readObjectFromFile() throws Exception {
        //1.创建输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\test.txt"));

        //2.读取对象
        Singleton instance = (Singleton) ois.readObject();
        System.out.println(instance);

        //3.释放资源
        ois.close();
    }

    /**
     * 向文件中写入数据(对象)
     */
    public static void writeToFile() throws Exception {
        //1.获取Singleton对象
        Singleton instance = Singleton.getInstance();

        //2.创建输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\test.txt"));

        //3.写对象
        oos.writeObject(instance);

        //4.释放资源
        oos.close();
    }
}
