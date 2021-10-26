package cn.jackse.demo2.before;

/**
 * @author Jack
 * @version 1.0
 * @description: 测试类
 * @date 2021/10/26 20:22
 *
 * 在resize方法中，Rectangle类型的参数是不能被Square类型的参数所代替，如果进行了替换就得不到预期结果。
 * 因此，Square类和Rectangle类之间的继承关系违反了里氏代换原则，它们之间的继承关系不成立，正方形不是长方形。
 */
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20.0);
        rectangle.setWidth(10.0);

        resize(rectangle);
        printLengthAndWidth(rectangle);
        System.out.println("============华丽风分割线===============");

        //创建正方形对象
        Square square = new Square();
        square.setLength(10);
        resize(square);
        printLengthAndWidth(square);
    }

    /**
     * 扩宽方法
     */
    public static void resize(Rectangle rectangle) {
        //判断如果宽比长小，则进行扩宽操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    /**
     * 打印方法
     */
    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println("length=" + rectangle.getLength());
        System.out.println("width=" + rectangle.getWidth());
    }
}
