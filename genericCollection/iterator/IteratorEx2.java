package genericCollection.iterator;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorEx2 {
    public static void main(String[] args) {
        HashSet<Integer> iset = new HashSet<Integer>();
        iset.add(5); iset.add(4); iset.add(-1);
        iset.add(9); iset.add(-7);
        System.out.println(iset);

        // Iterator를 이용한 음의 정수 제거하기
        // Iterator 객체 얻기
        Iterator<Integer> it = iset.iterator();

        while( it.hasNext() ) {
            if ( it.next() < 0) it.remove();
        }
        System.out.println(iset);

        // Iterator를 이용하여 모든 정수 더하기
        int sum = 0; it = iset.iterator(); // Iterator 객체 다시 얻기
        while( it.hasNext() ) {
            int n = it.next();
            sum += n;
        }
        System.out.println("집합에 있는 양의 정수 합 : " + sum); }
    }
}
