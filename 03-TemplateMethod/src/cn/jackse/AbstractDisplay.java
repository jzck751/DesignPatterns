package cn.jackse;

/**
 * @description: 抽象类AbstractDisplay
 * @author Jack
 * @date 2021/9/29 15:57
 * @version 1.0
 */
public abstract class AbstractDisplay {
    /**
     * @description: 交给子类去处理的open方法
     * @author Jack
     * @date 2021/9/29 15:58
     * @version 1.0
     */
    public abstract void open();

    /**
     * @description: 交给子类去处理的print方法
     * @author Jack
     * @date 2021/9/29 15:58
     * @version 1.0
     */
    public abstract void print();

    /**
     * @description: 交给子类去处理的抽象方法close
     * @author Jack
     * @date 2021/9/29 15:59
     * @version 1.0
     */
    public abstract void close();

    public final void display(){
        //首先打开
        open();

        //循环调用5次print
        for (int i = 0; i < 5; i++) {
            print();
        }

        //调用关闭方法
        close();
    }

}
