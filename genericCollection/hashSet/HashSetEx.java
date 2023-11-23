package genericCollection.hashSet;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        // 문자열 HashSet 컬렉션 생성
        HashSet<String> set = new HashSet<String>();

        // HashSet에 animals 배열의 요소를 추가
        String animals[] = {"개", "토끼", "팬더", "고양이"};

        for(String s: animals) set.add(s);
        System.out.println(set);

        // 중복 요소 추가
        set.add("고양이");
        set.add("개");
        set.remove("팬더");

        for(String s: set)
            System.out.print(s + " / ");
    }
}
