package cn.jackse.exercise1;

/**
 * @author Jack
 * @version 1.0
 * @description: TODO
 * @date 2021/10/12 16:35
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start...");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
        }
        System.out.println("End...");
    }
}
