package com.cheng.yuanxingmoshi;

import java.io.*;
import java.util.Date;

/**
 * Created by niecheng on 2018/11/26.
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

        Date date = new Date(1365215478956L);

        Sheep sheep = new Sheep("456",new Date());
        sheep.setName("多利");
        sheep.setBirthday(date);

//        Sheep clone = (Sheep) sheep.clone();

        //通过序列化和反序列化进行克隆
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(sheep);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep clone = (Sheep) ois.readObject();

        System.out.println("克隆羊名字：" + clone.getName());
        System.out.println("克隆羊生日：" + clone.getBirthday());

        System.out.println("--------------------------------");
        // 修改本体羊生日
        date.setTime(3246584261356L);
        System.out.println("本体羊生日：" + sheep.getBirthday());
        System.out.println("克隆羊生日：" + clone.getBirthday());

        System.out.println("--------------------------------");
        System.out.println("--------------测试性能-----------");
        int num = 1000;

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            Sheep tmp = new Sheep("123",new Date());
        }
        System.out.println("new 方式耗时：" + (System.currentTimeMillis() - t1) + "ms");

        long t2 = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            Sheep tmp = (Sheep) sheep.clone();
        }
        System.out.println("克隆方式耗时：" + (System.currentTimeMillis() - t2) + "ms");
    }
}
