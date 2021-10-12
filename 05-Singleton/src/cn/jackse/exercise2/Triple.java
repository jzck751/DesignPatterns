package cn.jackse.exercise2;

/**
 * @author Jack
 * @version 1.0
 * @description: TODO
 * @date 2021/10/12 17:15
 */
public class Triple {
    private static Triple[] triple = new Triple[]{
            new Triple(0),
            new Triple(1),
            new Triple(2)
    };

    private int id;

    public Triple(int id) {
        System.out.println("The instance" + id + "is created");
        this.id = id;
    }

    public static Triple getInstance(int id) {
        return triple[id];
    }

    @Override
    public String toString() {
        return "[Triple id = " + id + "]";
    }
}
