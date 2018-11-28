package com.cheng.xiangyuanmoshi;

/**
 * Created by niecheng on 2018/11/28.
 * <p>
 * 参与角色：
 * <p>
 * 抽象享元：所有具体享元类的父类，规定一些需要实现的公共接口，可接收外部状态。
 * <p>
 * 具体享元：抽象享元角色的具体实现类，并实现了抽象享元角色规定的方法并存储内部状态。
 * <p>
 * 享元工厂：负责创建和管理享元角色
 * <p>
 * 在本例中，后台管理系统其实都一样的，不需要重新构造对象，只用从工厂重新获取就行，减少了内存的开支
 */
public class Client {
    public static void main(String[] args) {

        WebSite ws1 = WebSiteFactory.getWebSite("后台管理系统");

        WebSite ws2 = WebSiteFactory.getWebSite("后台管理系统");

        System.out.println(ws1 == ws2);


        ws1.show(new User("A 公司"));
        ws2.show(new User("B 公司"));
    }
}
