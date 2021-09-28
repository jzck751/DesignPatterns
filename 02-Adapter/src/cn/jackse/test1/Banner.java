package cn.jackse.test1;

/**
 * @Description:
 * @author: Jack
 * @date: 2021年09月28日 22:34
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("("+string+")");
    }

    public void showWithAster(){
        System.out.println("*"+string+"*");
    }
}
