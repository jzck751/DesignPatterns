package cn.jackse.exercise1;

/**
 * @author Jack
 * @version 1.0
 * @description: TODO
 * @date 2021/10/12 16:31
 */
public class TicketMaker {
/*    private int ticket = 1000;
    public int getTicketNumber(){
        return ticket++;
    }*/

    private int ticket = 1000;
    private static TicketMaker singleton = new TicketMaker();

    public TicketMaker() {
    }

    public static TicketMaker getInstance(){
        return singleton;
    }

    public synchronized int getNextTicketNumber(){
        return ticket++;
    }
}
