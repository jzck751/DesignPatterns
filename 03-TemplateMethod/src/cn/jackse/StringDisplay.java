package cn.jackse;

/**
 * @author Jack
 * @version 1.0
 * @description: TODO
 * @date 2021/9/29 16:09
 */
public class StringDisplay extends AbstractDisplay {

    /***
     * 需要显示的字符串
     */
    private String string;

    /***
     * 以字节为单位计算出字符长度
     */
    private int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void open() {
        //调用该类的printLine()方法画线
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }
}
