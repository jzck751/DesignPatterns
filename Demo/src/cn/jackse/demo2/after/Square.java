package cn.jackse.demo2.after;

/**
 * @author Jack
 * @version 1.0
 * @description: 正方形
 * @date 2021/10/26 20:38
 */
public class Square implements Quadrilateral{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
