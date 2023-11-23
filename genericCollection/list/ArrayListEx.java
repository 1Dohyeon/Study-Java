package genericCollection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<4; i++) {
            System.out.print("�̸��� �Է��ϼ���>>");
            String s = scanner.next(); // �̸� �Է�
            arr.add(s); // ArrayList �÷��ǿ� ����
        }

        // ArrayList�� ��� �ִ� ��� �̸� ���
        for(int i=0; i<arr.size(); i++) {
            // ArrayList�� i ��° ���ڿ� ������
            String name = arr.get(i);
            System.out.print(name + " ");
        }

        // ���� �� �̸� ���
        int longestIndex = 0;
        for(int i=1; i<arr.size(); i++) {
            if(arr.get(longestIndex).length() < arr.get(i).length()) longestIndex = i;
        }
        System.out.println("\n���� �� �̸��� : " + arr.get(longestIndex));
        scanner.close();
    }
}
