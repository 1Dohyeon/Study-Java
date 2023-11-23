package genericCollection.hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
    public static void main(String[] args) {
        System.out.println("< ���� #7-2 ������/60202464 >");
        HashMap<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("������", "�ĸ�");   hashMap.put("�̱�", "������");
        hashMap.put("�Ϻ�", "����");   hashMap.put("����", "����");
        hashMap.put("���ѹα�", "����");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("���� �̸��� �Է��Ͻÿ�: ");
            String country = scanner.nextLine();
            if(country.equals("�𸨴ϴ�")) break;

            for (String key : hashMap.keySet()) {
                if (key.equals(country)) {
                    System.out.println(key + "�� ����: " + hashMap.get(key));
                    break;
                }
            }
        }

        scanner.close();
    }
}
