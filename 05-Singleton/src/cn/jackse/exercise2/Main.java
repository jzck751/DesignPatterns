package cn.jackse.exercise2;

/**
 * @author Jack
 * @version 1.0
 * @description: TODO
 * @date 2021/10/12 17:22
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start...");
        for (int i = 0; i < 9; i++) {
            Triple triple = Triple.getInstance(i % 3);
            System.out.println(i + ":" + triple);
        }

        System.out.println("End...");
    }
}
