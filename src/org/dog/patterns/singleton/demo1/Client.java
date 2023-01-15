package org.dog.patterns.singleton.demo1;

/**
 * @Author: Odin
 * @Date: 2023/1/15 21:14
 * @Description:
 */
public class Client {

  public static void main(String[] args) {

    // 创建对象
    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();

    // 判断获取到的两个是否是同一个对象
    System.out.println(instance1 == instance2); // true

  }
}
