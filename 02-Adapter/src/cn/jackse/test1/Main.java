package cn.jackse.test1;

/**
 * @Description:
 * @author: Jack
 * @date: 2021年09月28日 22:40
 */
public class Main {
    public static void main(String[] args) {
        PrintBanner printBanner = new PrintBanner("Hello");
        printBanner.printWeak();
        printBanner.printStrong();
    }
}
