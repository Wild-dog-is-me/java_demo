package org.dog.dataStructure;

import java.util.LinkedList;

/**
 * @Author Odin
 * @Date 2022/12/29 10:15
 * @Description:栈 遵循先入后出的原则，线性数据结构
 */
public class StackDemo {
  public static void main(String[] args)  {
    /* 初始化栈 */
// 在 Java 中，推荐将 LinkedList 当作栈来使用
    LinkedList<Integer> stack = new LinkedList<>();

    /* 元素入栈 */
    stack.addLast(1);
    stack.addLast(3);
    stack.addLast(2);
    stack.addLast(5);
    stack.addLast(4);

    /* 访问栈顶元素 */
    int peek = stack.peekLast();

    /* 元素出栈 */
    int pop = stack.removeLast();

    /* 获取栈的长度 */
    int size = stack.size();

    /* 判断是否为空 */
    boolean isEmpty = stack.isEmpty();

  }
}
