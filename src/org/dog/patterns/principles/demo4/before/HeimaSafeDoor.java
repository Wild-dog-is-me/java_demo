package org.dog.patterns.principles.demo4.before;

/**
 * @Author: Odin
 * @Date: 2023/1/15 19:30
 * @Description:
 */
public class HeimaSafeDoor implements SateDoor {

  @Override
  public void antiTheft() {
    System.out.println("防盗");
  }

  @Override
  public void fireProof() {
    System.out.println("防火");
  }

  @Override
  public void waterProof() {
    System.out.println("防水");
  }
}
