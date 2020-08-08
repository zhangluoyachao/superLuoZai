package day12;

import org.junit.Test;

import java.util.LinkedList;

public class TestLinkedList {
    @Test
    public void test() {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addLast(3);
        System.out.println(linkedList);
    }
}
