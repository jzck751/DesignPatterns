package cn.jackse.demo2.before;

/**
 * @author Jack
 * @version 1.0
 * @description: 正方形类
 * @date 2021/10/26 20:17
 */
public class Square extends Rectangle {

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
