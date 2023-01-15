package org.dog.patterns.singleton.demo1;/**
 * @Author: Odin
 * @Date: 2023/1/15 21:13
 * @Description:
 */

/**
 * 饿汉式
 *      静态变量创建类的对象
 */
public class Singleton {
  //私有构造方法
  private Singleton() {}

  //在成员位置创建该类的对象
  private static Singleton instance = new Singleton();

  //对外提供静态方法获取该对象
  public static Singleton getInstance() {
    return instance;
  }
}
