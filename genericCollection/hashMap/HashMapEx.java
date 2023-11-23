package genericCollection.hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
    public static void main(String[] args) {
        System.out.println("< 과제 #7-2 원도현/60202464 >");
        HashMap<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("프랑스", "파리");   hashMap.put("미국", "워싱턴");
        hashMap.put("일본", "도쿄");   hashMap.put("영국", "런던");
        hashMap.put("대한민국", "서울");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("국가 이름을 입력하시오: ");
            String country = scanner.nextLine();
            if(country.equals("모릅니다")) break;

            for (String key : hashMap.keySet()) {
                if (key.equals(country)) {
                    System.out.println(key + "의 수도: " + hashMap.get(key));
                    break;
                }
            }
        }

        scanner.close();
    }
}
