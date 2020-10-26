package array;

/**
 * 1) 单链表反转
 * 2) 链表中环的检测
 * 3) 两个有序的链表合并
 * 4) 删除链表倒数第n个结点
 * 5) 求链表的中间结点
 *
 * Author: Zheng
 */
public class LinkedList {

    public Node head = null;

    public void removeTail() {
        if (head == null) {
            return;
        }
        if (head.getNext() == null) {
            head = null;
            return;
        }
        Node p = head;
        Node temp = p;
        while (p.getNext() != null) {
            temp = p;
            p = p.getNext();
        }
        temp.setNext(null);
    }

    public void insertTail(int value) {
        Node newNode = new Node(value, null);
        if (head == null) {
            head = newNode;
            return;
        }
        Node tail = head;
        while (tail.getNext() != null) {
            tail = tail.getNext();
        }
        tail.setNext(newNode);
    }

    public void printAll() {
        Node tail = head;
        while (tail != null) {
            System.out.println(tail.getData());
            tail = tail.getNext();
        }
    }

    public Node find(int value) {

        Node p = head;
        while (p != null && p.getData() != value) {
            p = p.getNext();
        }
        return p;
    }

    public Node reverse(Node head){
//        if (head==null || head.getNext()==null){
//            return;
//        }
//        Node pre=null;
//        Node p=head;
//        Node n=p.next;
//        while(p!=null){
//            p.next=pre;
//            pre=p;
//            p=n;
//            if (p!=null){
//                n = p.next;
//            }
//        }
//        head=pre;

        //递归
        //1.第一个条件是判断递归开始，传入的参数的合法性。第二个是递归的终止条件
        if(head == null || head.next == null) return head;
        //2.开始进行递归
        Node newHead = reverse(head.next);
        //3.尾部4-5-null中，head=4,head.next=4-5 head.next.next=4-5-null,也就是5的后继指向4
        head.next.next = head;
        //4.断开之前4-5之间的连接，将4的后继指向null
        head.next = null;
        //5.返回已经反转的链表
        return newHead;

    }

    public static void main(String[] args) {
        LinkedList linked = new LinkedList();
        linked.insertTail(1);
        linked.insertTail(2);
        linked.insertTail(3);
        linked.insertTail(4);
        linked.printAll();
        linked.head=linked.reverse(linked.head);
        linked.printAll();
    }

    public static class Node {

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node() {
        }

        private int data;
        private Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
}
