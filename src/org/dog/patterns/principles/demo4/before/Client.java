package org.dog.patterns.principles.demo4.before;

/**
 * @Author: Odin
 * @Date: 2023/1/15 19:35
 * @Description:
 */
public class Client {

  public static void main(String[] args) {
    HeimaSafeDoor heimaSafeDoor = new HeimaSafeDoor();
    heimaSafeDoor.antiTheft();
    heimaSafeDoor.fireProof();
    heimaSafeDoor.waterProof();
  }
}
