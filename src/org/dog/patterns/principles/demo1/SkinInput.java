package org.dog.patterns.principles.demo1;

/**
 * @Author: Odin
 * @Date: 2023/1/7 23:31
 * @Description:
 */
public class SkinInput {

  private AbstractSkin skin;

  public void setSkin(AbstractSkin skin) {
    this.skin = skin;
  }

  public void display() {
    skin.display();
  }
}
