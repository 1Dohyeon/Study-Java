package genericCollection.list;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        // ���ڿ� LinkedList �÷��� ����
        LinkedList<String> ll = new LinkedList<String>();

        // ���ڿ��� LinkedList �� �ڿ� �߰�
        ll.add("���"); ll.add("�ٳ���");
        System.out.println(ll);

        // ���ڿ��� LinkedList �� �հ� �� �ڿ� �߰�
        ll.addFirst("��"); ll.addLast("���ξ���");
        System.out.println(ll);

        // ���ڿ��� LinkedList Ư�� �ε����� �߰�
        ll.add(2, "����");
        System.out.println(ll);

        // ��� ��� ����
        ll.clear();
        System.out.println(ll);

        // queueó�� �� �ڿ� ���ڿ� �߰�
        ll.offer("��");
        System.out.println(ll);
        ll.offer("�䳢");
        System.out.println(ll);
        ll.offer("�Ҵ�");
        System.out.println(ll);
        ll.offer("�����");
        System.out.println(ll);

        // queueó�� �� �տ��� ���ڿ� ����
        while( ! ll.isEmpty() ) {
            System.out.println(ll.poll());
            System.out.println(ll);
        }
    }
}
