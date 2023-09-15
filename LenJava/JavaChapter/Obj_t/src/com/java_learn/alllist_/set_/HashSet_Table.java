package com.java_learn.alllist_.set_;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary HashSet的核心table结构
 */
public class HashSet_Table {
    public static void main(String[] args) {

        //模拟HashMap（数组+链表）
    Node[] table=new Node[4];
    table[1]=new Node("jack",new Node("luck",new Node("marry",null)));

    }
}
class Node{
    public Object item;
    public Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
