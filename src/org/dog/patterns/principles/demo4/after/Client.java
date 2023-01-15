package org.dog.patterns.principles.demo4.after;


/**
 * @Author: Odin
 * @Date: 2023/1/15 20:01
 * @Description:
 */
public class Client {

  public static void main(String[] args) {
    HeimaSafeDoor heimaSafeDoor = new HeimaSafeDoor();
    heimaSafeDoor.antiTheft();
    heimaSafeDoor.fireProof();
    heimaSafeDoor.waterProof();

    ItcastDoor itcastDoor = new ItcastDoor();
    itcastDoor.antiTheft();

  }
}
