package genericCollection.hashSet;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        // ���ڿ� HashSet �÷��� ����
        HashSet<String> set = new HashSet<String>();

        // HashSet�� animals �迭�� ��Ҹ� �߰�
        String animals[] = {"��", "�䳢", "�Ҵ�", "�����"};

        for(String s: animals) set.add(s);
        System.out.println(set);

        // �ߺ� ��� �߰�
        set.add("�����");
        set.add("��");
        set.remove("�Ҵ�");

        for(String s: set)
            System.out.print(s + " / ");
    }
}
