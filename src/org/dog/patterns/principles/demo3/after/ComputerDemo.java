package org.dog.patterns.principles.demo3.after;

/**
 * @Author: Odin
 * @Date: 2023/1/10 20:41
 * @Description:
 */
public class ComputerDemo {
  public static void main(String[] args) {

    HardDisk hardDisk = new XiJieHardDisk();
    Cpu cpu = new IntelCpu();
    Memory memory = new KingstonMemory();
    Computer computer = new Computer();

    computer.setCpu(cpu);
    computer.setMemory(memory);
    computer.setHardDisk(hardDisk);

    computer.run();

  }
}
