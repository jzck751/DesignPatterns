package cn.jackse;

/**
 * @author Jack
 * @version 1.0
 * @description: CharDisplay是AbstractDisplay的子类
 * @date 2021/9/29 16:02
 */
public class CharDisplay extends AbstractDisplay {

    /***
     *需要显示的字符
     */
    private char ch;

    /***
     * 构造函数中接受的字符被保存在字段中
     */
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
