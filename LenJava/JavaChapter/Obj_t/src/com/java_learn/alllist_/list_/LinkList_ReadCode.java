package com.java_learn.alllist_.list_;

import java.util.LinkedList;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 双向链表实现
 */
public class LinkList_ReadCode {
    public static void main(String[] args) {
        Node j1=new Node("j1");
        Node j2=new Node("j2");
        Node j3=new Node("j3");
        Node first=j1;
        j1.next=j2;
        j2.next=j3;
        Node last=j3;
        j3.prev=j2;
        j2.prev=j1;
        while (true){
            if(first==null){
                break;
            }
            System.out.println(first);
            first=first.next;
        }
        System.out.println("==========反向输出：");
        while (true){
            if(last==null){
                break;
            }
            System.out.println(last);
            last=last.prev;
        }
        //LinkList的CRUD
        System.out.println("===========Code=======");
        LinkedList linkedList=new LinkedList();
        linkedList.add(1);
        /*
        源码解读
        1.进入构造器初始化
        public boolean add(E e) {
        linkLast(e);
        return true;
    }
            void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }
         */

    }
}
//链表类
class Node{
    public Object item;
    public Node prev;
    public Node next;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }
}
