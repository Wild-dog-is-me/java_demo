package org.dog.patterns.principles.demo2;

/**
 * @Author: Odin
 * @Date: 2023/1/10 16:54
 * @Description:
 */
public class Rectangle implements Quadrilateral {

  private double length;
  private double width;

  public void setLength(double length) {
    this.length = length;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  @Override
  public double getLength() {
    return length;
  }

  @Override
  public double getWidth() {
    return width;
  }
}
