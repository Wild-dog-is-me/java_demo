package org.dog.patterns.principles.demo2;

/**
 * @Author: Odin
 * @Date: 2023/1/10 19:01
 * @Description:
 */
public class RectangleDemo {

  public static void resize(Rectangle rectangle) {
    while (rectangle.getWidth() <= rectangle.getLength()) {
      rectangle.setWidth(rectangle.getWidth() + 1);
    }
  }

  //打印长方形的长和宽
  public static void printLengthAndWidth(Quadrilateral quadrilateral) {
    System.out.println(quadrilateral.getLength());
    System.out.println(quadrilateral.getWidth());
  }

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    rectangle.setLength(20);
    rectangle.setWidth(10);
    resize(rectangle);
    printLengthAndWidth(rectangle);

    System.out.println("============");




  }
}
