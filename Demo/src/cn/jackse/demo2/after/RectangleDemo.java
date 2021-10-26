package cn.jackse.demo2.after;

/**
 * @author Jack
 * @version 1.0
 * @description: 测试类
 * @date 2021/10/26 20:43
 */
public class RectangleDemo {
    public static void main(String[] args) {
        //创建长方形对象
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20.0);
        rectangle.setWidth(10.0);
        //调用resize方法进行扩宽操作
        resize(rectangle);
        printLengthAndWidth(rectangle);

        System.out.println("======华丽分割线========");
    }

    /**
     * 扩宽的方法
     */
    public static void resize(Rectangle rectangle) {
        //判断如果宽比长小，则进行扩宽操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    /**
     * 打印长和宽方法
     */
    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println("length=" + quadrilateral.getLength());
        System.out.println("width=" + quadrilateral.getWidth());
    }
}
