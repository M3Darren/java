package com.java_learn.alllist_.set_;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary  HashSet源码
 */
public class HashSet_ReadCode {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add("aa");
        /*
        源码剖析
        1.构造器
        public HashSet() {
        map = new HashMap<>();
    }
        2.add方法
         public boolean add(E e) {
        return map.put(e, PRESENT)==null;//static final PRESENT=new Object()占位作用
    }
        3.put方法
        public V put(K key, V value) {
        return putVal(hash(key), key, value, false, true);
    }
    hash()算法，返回在table中对应的索引
        static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
        //通过计算后的哈希值（并不是真正的哈希值）
    }
        4.putVal方法
        final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
                   //1.创建存放链表的数组tab，和指针p
                   2.判断表tab是否为空或者长度为0
                   2.1成立则执行resize进行扩容
                   2.1.1resize进行默认处理，数组大小为16，当到达临界值（当前的0.75倍）就进行2倍扩容
                   2.2若不成立，则执行判断i索引是否有值;没有则插入该位置
                   2.2.1若有值则判断hash是否相等；若相等则不插入·，若不等则在尾部插入
        Node<K,V>[] tab; Node<K,V> p; int n, i;
        if ((tab = table) == null || (n = tab.length) == 0)
            n = (tab = resize()).length;
        if ((p = tab[i = (n - 1) & hash]) == null)
            tab[i] = newNode(hash, key, value, null);
        else {
            Node<K,V> e; K k;
            if (p.hash == hash &&
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {
                for (int binCount = 0; ; ++binCount) {
                    if ((e = p.next) == null) {
                        p.next = newNode(hash, key, value, null);
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        if (++size > threshold)
            resize();
        afterNodeInsertion(evict);
        return null;
    }
         */
    }
}
