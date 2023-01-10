package org.dog.patterns.principles.demo2;

/**
 * @Author: Odin
 * @Date: 2023/1/10 16:54
 * @Description:
 */

public class Square implements Quadrilateral {

  private double side;

  public double getSide() {
    return side;
  }

  public void setSide(double side) {
    this.side = side;
  }

  @Override
  public double getLength() {
    return side;
  }

  @Override
  public double getWidth() {
    return side;
  }
}
