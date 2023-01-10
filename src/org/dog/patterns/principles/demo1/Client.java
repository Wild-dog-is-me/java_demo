package org.dog.patterns.principles.demo1;

/**
 * @Author: Odin
 * @Date: 2023/1/7 23:32
 * @Description:
 */
public class Client {
  public static void main(String[] args) {
    SkinInput skinInput = new SkinInput();

    DefaultSkin defaultSkin = new DefaultSkin();
    skinInput.setSkin(defaultSkin);
    skinInput.display();

  }
}
