package genericCollection.stack;

import java.util.Stack;

public class StringStack {
    public static void main(String[] args) {
        // stack 생성
        Stack<String> s = new Stack<String>();
        
        // stack에 요소 삽입
        s.push("봄");
        System.out.println(s);
        s.push("여름");
        System.out.println(s);
        s.push("가을");
        System.out.println(s);
        s.push("겨울");
        System.out.println(s);
        System.out.println();

        // stack의 마지막 요소 출력
        System.out.println(s.peek());
        // stack 전체 출력
        System.out.println(s);
        System.out.println();

        while (!s.empty()) {
            System.out.print("pop은 가장 마지막에 들어온 요소 삭제: " + s.pop() + ": ");
            System.out.println(s);
        }
        
    }
}
