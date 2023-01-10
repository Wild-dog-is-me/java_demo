package org.dog.patterns.principles.demo3.after;

/**
 * @Author: Odin
 * @Date: 2023/1/10 20:55
 * @Description:
 */
public class Computer {

  private HardDisk hardDisk;
  private Cpu cpu;
  private Memory memory;

  public HardDisk getHardDisk() {
    return hardDisk;
  }

  public void setHardDisk(HardDisk hardDisk) {
    this.hardDisk = hardDisk;
  }

  public Cpu getCpu() {
    return cpu;
  }

  public void setCpu(Cpu cpu) {
    this.cpu = cpu;
  }

  public Memory getMemory() {
    return memory;
  }

  public void setMemory(Memory memory) {
    this.memory = memory;
  }

  public void run() {
    System.out.println("计算机工作");
    cpu.run();
    memory.save();
    String data = hardDisk.get();
    System.out.println("从硬盘中获取的数据为：" + data);
  }
}
