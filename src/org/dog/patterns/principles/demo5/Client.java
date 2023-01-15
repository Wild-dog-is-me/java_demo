package org.dog.patterns.principles.demo5;

/**
 * @Author: Odin
 * @Date: 2023/1/15 20:24
 * @Description:
 */
public class Client {

  public static void main(String[] args) {
    Agent agent = new Agent();
    Star star = new Star("Odin");
    Company company = new Company("Dog");
    Fans fans = new Fans("Ice");

    agent.setCompany(company);
    agent.setFans(fans);
    agent.setStar(star);

    agent.meeting();
    agent.business();
  }
}
