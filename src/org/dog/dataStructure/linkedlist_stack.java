package org.dog.dataStructure;


import org.dog.dataStructure.include.ListNode;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @Author Odin
 * @Date 2022/12/29 10:22
 * @Description:栈基于链表的实现
 */
class LinkedListStack {
  private ListNode stackPeek;  // 将头结点作为栈顶
  private int stkSize = 0;   // 栈的长度

  public LinkedListStack() {
    stackPeek = null;
  }

  /* 获取栈的长度 */
  public int size() {
    return stkSize;
  }

  /* 判断栈是否为空 */
  public boolean isEmpty() {
    return size() == 0;
  }

  /* 入栈 */
  public void push(int num) {
    ListNode node = new ListNode(num);
    node.next = stackPeek;
    stackPeek = node;
    stkSize++;
  }

  /* 出栈 */
  public int pop() {
    int num = peek();
    stackPeek = stackPeek.next;
    stkSize--;
    return num;
  }

  /* 访问栈顶元素 */
  public int peek() {
    if (size() == 0)
      throw new EmptyStackException();
    return stackPeek.val;
  }

  /* 将 List 转化为 Array 并返回 */
  public int[] toArray() {
    ListNode node = stackPeek;
    int[] res = new int[size()];
    for (int i = res.length - 1; i >= 0; i--) {
      res[i] = node.val;
      node = node.next;
    }
    return res;
  }
}

public class linkedlist_stack {
  public static void main(String[] args) {
    /* 初始化栈 */
    LinkedListStack stack = new LinkedListStack();

    /* 元素入栈 */
    stack.push(1);
    stack.push(3);
    stack.push(2);
    stack.push(5);
    stack.push(4);
    System.out.println("栈 stack = " + Arrays.toString(stack.toArray()));

    /* 访问栈顶元素 */
    int peek = stack.peek();
    System.out.println("栈顶元素 peek = " + peek);

    /* 元素出栈 */
    int pop = stack.pop();
    System.out.println("出栈元素 pop = " + pop + "，出栈后 stack = " + Arrays.toString(stack.toArray()));

    /* 获取栈的长度 */
    int size = stack.size();
    System.out.println("栈的长度 size = " + size);

    /* 判断是否为空 */
    boolean isEmpty = stack.isEmpty();
    System.out.println("栈是否为空 = " + isEmpty);
  }
}
