package org.dog.patterns.singleton.demo2;

/**
 * @Author: Odin
 * @Date: 2023/1/15 21:37
 * @Description:
 */
/**
 * 懒汉式
 *  线程不安全
 */
public class Singleton {
  //私有构造方法
  private Singleton() {}

  //在成员位置创建该类的对象
  private static Singleton instance;

  //对外提供静态方法获取该对象 （加锁后线程安全）
  public static synchronized Singleton getInstance() {

    if(instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}
