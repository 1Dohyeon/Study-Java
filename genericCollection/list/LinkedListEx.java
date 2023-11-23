package genericCollection.list;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        // 문자열 LinkedList 컬렉션 생성
        LinkedList<String> ll = new LinkedList<String>();

        // 문자열을 LinkedList 맨 뒤에 추가
        ll.add("사과"); ll.add("바나나");
        System.out.println(ll);

        // 문자열을 LinkedList 맨 앞과 맨 뒤에 추가
        ll.addFirst("배"); ll.addLast("파인애플");
        System.out.println(ll);

        // 문자열을 LinkedList 특정 인덱스에 추가
        ll.add(2, "망고");
        System.out.println(ll);

        // 모든 요소 제거
        ll.clear();
        System.out.println(ll);

        // queue처럼 맨 뒤에 문자열 추가
        ll.offer("개");
        System.out.println(ll);
        ll.offer("토끼");
        System.out.println(ll);
        ll.offer("팬더");
        System.out.println(ll);
        ll.offer("고양이");
        System.out.println(ll);

        // queue처럼 맨 앞에서 문자열 제거
        while( ! ll.isEmpty() ) {
            System.out.println(ll.poll());
            System.out.println(ll);
        }
    }
}
