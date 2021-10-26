package cn.jackse.demo5;


/**
 * @author Jack
 * @version 1.0
 * @description: 测试类
 * @date 2021/10/26 21:59
 */
public class Client {

    public static void main(String[] args) {
        /**
         * 创建经纪人类
         */
        Agent agent = new Agent();

        /**
         * 创建明星对象
         */
        Star star = new Star("张三");
        agent.setStar(star);
        /**
         * 创建公司对象
         */
        Company company = new Company("黑马");
        agent.setCompany(company);

        /**
         * 创建粉丝对象
         */
        Fans fans = new Fans("粉丝李四");
        agent.setFans(fans);

        agent.meeting();
        agent.business();
    }

}
