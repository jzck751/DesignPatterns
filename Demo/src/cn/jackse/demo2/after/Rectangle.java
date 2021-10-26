package cn.jackse.demo2.after;

/**
 * @author Jack
 * @version 1.0
 * @description: 长方形类
 * @date 2021/10/26 20:40
 */
public class Rectangle implements Quadrilateral{

    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
