package cn.jackse.demo1;

/**
 * @author Jack
 * @version 1.0
 * @description: 搜狗输入法
 * @date 2021/10/26 20:02
 */
public class SouGouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display(){
        skin.display();
    }
}
