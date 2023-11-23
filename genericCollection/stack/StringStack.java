package genericCollection.stack;

import java.util.Stack;

public class StringStack {
    public static void main(String[] args) {
        // stack ����
        Stack<String> s = new Stack<String>();
        
        // stack�� ��� ����
        s.push("��");
        System.out.println(s);
        s.push("����");
        System.out.println(s);
        s.push("����");
        System.out.println(s);
        s.push("�ܿ�");
        System.out.println(s);
        System.out.println();

        // stack�� ������ ��� ���
        System.out.println(s.peek());
        // stack ��ü ���
        System.out.println(s);
        System.out.println();

        while (!s.empty()) {
            System.out.print("pop�� ���� �������� ���� ��� ����: " + s.pop() + ": ");
            System.out.println(s);
        }
        
    }
}
