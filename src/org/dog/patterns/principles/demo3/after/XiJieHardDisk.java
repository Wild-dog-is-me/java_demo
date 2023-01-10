package org.dog.patterns.principles.demo3.after;

/**
 * @Author: Odin
 * @Date: 2023/1/10 20:37
 * @Description:
 */
public class XiJieHardDisk implements HardDisk{

  public void save(String data) {
    System.out.println("使用希捷硬盘存储数据" + data);
  }

  public String get() {
    System.out.println("使用希捷希捷硬盘取数据");
    return "数据";
  }

}
