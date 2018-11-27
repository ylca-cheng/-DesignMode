package com.cheng.zuhemoshi;

import java.util.List;

/**
 * Created by niecheng on 2018/11/27.
 * <p>
 * 组合模式：通过递归手段来构造树形的对象结构以表示“部分-整体”的层次结构，并可以通过一个对象来访问整个对象树。
 * <p>
 * 参与角色：
 * <p>
 * Component：为组合中的对象声明接口。在适当的情况下，实现所有类共有接口的缺省行为。
 * <p>
 * Leaf：在组合中表示子部件，定义子部件对象的行为，该部件没有子部件。
 * <p>
 * Composite：实现 Component 接口中与子部件有关的操作。
 * <p>
 * 当前角色：抽象类（Component）：可以看作公司发布的招聘岗位
 */
public abstract class Employee {
    protected List<Employee> employeeList;

    public abstract void add(Employee employee);

    public abstract void delete(Employee employee);

    public abstract void report();
}
