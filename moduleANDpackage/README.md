### 패키지(package)

- 동일한 이름의 클래스가 존재할 경우 오류가 발생할 수 있음. 따라서 패키지로 나눌 필요가 있음.
- 서로 관련된 클래스와 인터페이스의 컴파일 된 클래스 파일들을 하나의 디렉토리에 묶어 놓은 것
- 패키지 명을 포함한 경로명을 점(.)으로 연결
>Project.FileIO 패키지 > Project.FileIO.Tools.class

**import문을 사용하여 패키지 이용**
```
import java.util.Scanner;
import java.util.*
```
- `*` 는 `util`의 하위 모든 클래스들을 포함한다.
- import를 사용하지 않는 경우는 **전체 경로명**을 써주어야 함.

**디폴트 패키지와 패키지의 특징**
- 디폴트 패키지 : 현재 디렉토리임, package 선언문 없이 만들어진 클래스의 패키지.
- 패키지로 계층화 하여 관리 용이함.
- 패키지 별로 **접근 권한** 가능
- 서로 다른 패키지에 같은 이름의 클래스와 인터페이스 존재 가능

**주요 패키지**
>java.lang
>java.util
>java.io
>java.awt
>java.swing

**Object class( in java.lang)**
- 모든 클래스의 수퍼 클래스임
- 모든 객체가 공통으로 가지는 객체의 속석을 나타내는 메서드 보유
> **주요 메서드**
> boolean.equals(Object obj)
> Class getClass()
> int hashCode()
> String toString()
> void notify()
> void notifyAll()
> void wait()

>EX
```
class Point { 
	private int x, y; 
	public Point(int x, int y) { 
		this.x = x; 
		this.y = y; 
	} 
} 

public class ObjectPropertyEx { 
	public static void print( Object obj ) { 
		System.out.println( obj.getClass().getName() ); // 클래스 이름 
		System.out.println( obj.hashCode() ); // 해시 코드 값 
		System.out.println( obj.toString() ); // 객체를 문자열로 만들어 출력 
		System.out.println( obj ); // 객체 출력 
	} 
	public static void main(String [] args) { 
		Point p = new Point(2,3); 
		print(p); 
	} 
}

--- 실행 결과 ---
Point 
366712642 
Point@15db9742 
Point@15db9742
```


---
### 모듈(module)

- 여러 패키지와 이미지 등의 자원을 모아 놓은 컨테이너(JDK 9부터 생김)
  - 자바 api를 여러 모듈(99개)로 분할하여 응용 프로그램의 실행에 적합한 모듈로만 실행 환경을 구축하기 위해서
  - 메모리가 열악한 소형 기기에도 응용프로그램 실행 가능
- 모듈 파일(.jmod)로 저장
- 기존에는 rt.jar의 단일체에 API의 패키지들을 모두 담았었음 -> 파일을 버리고 API를 99개의 모듈 파일로 나눔
- 디스크 사용량과 실행 시간 메모리 감소됨

---
### 객체의 메서드

**toString()**
객체를 문자열로 반환
```
@Override
public String toString() { 
	return getClass().getName() +"@" + Integer.toHexString(hashCode()); 
}
```
Object 클래스에 구현된 toString()이 반환하는 문자열

**객체 비교와 equals()**
문자열은 ` == ` 보다 `.equals()` 를 이용하여 비교함.
객체를 비교할 때도 이용

---
### Wrapper 클래스

**Wrapper 클래스**는 클래스가 아니라 자바의 기본 타입을 클래스화 한 8개 클래스이다.
> Byte, Short, Integer, Long, Character, Float, Double, Boolean
- 기본 타입의 값을 객체로 다룰 수 있게 한다.

**기본 타입의 값으로 Wrapper 객체 생성**
```
Integer i = Integer.valueOf(10); 
Character c = Character.valueOf(‘c’); 
Double f = Double.valueOf(3.14); 
Boolean b = Boolean.valueOf(true);
```

- `.intValue()` : 객체로부터 기본 타입 값을 알아낼 수 있음
- `int i = Integer.parseInt("123");` : 문자열을 기본 데이터 타입으로 변환
- `String s1 = Integer.toString(123);` : 정수 123을 문자열로 변환

**Wrapper 클래스 활용**
```
public class WrapperEx { 
	public static void main(String[] args) { 
		System.out.println( Character.toLowerCase('A') ); // 'A'를 소문자로 변환 
		char c1='4', c2='F'; 
		
		if( Character.isDigit(c1) ) // 문자 c1이 숫자이면 true 
			System.out.println(c1 + "는 숫자"); 
		if( Character.isAlphabetic(c2) ) // 문자 c2가 영문자이면 true 
			System.out.println(c2 + "는 영문자"); 
			
		System.out.println( Integer.parseInt("-123") ); // "-123"을 10진수로 변환 
		System.out.println( Integer.toHexString(28) ); // 정수 28을 16진수 문자열로 변환 
		System.out.println( Integer.toBinaryString(28) ); // 28을 2진수 문자열로 변환 
		System.out.println( Integer.bitCount(28) ); // 28에 대한 2진수의 1의 개수 
		
		Double d = Double.valueOf(3.14); 
		System.out.println( d.toString() ); // Double을 문자열 "3.14"로 변환 
		System.out.println( Double.parseDouble("3.14") ); // 문자열을 실수 3.14로 변환 
		
		boolean b = (4>3); // b는 true 
		System.out.println( Boolean.toString(b) ); // true를 문자열 "true"로 변환 
		System.out.println( Boolean.parseBoolean("false") ); // 문자열을 false로 변환 
	} 
}

--- 실행 결과 ---
a 
4는 숫자 
F는 영문자 
-123 
1c 
11100 
3 
3.14 
3.14 
true 
false
```

---
### 박싱과 언박싱

**박싱(boxing)**
- 기본 타입의 값을 Wrapper 객체로 변환

**언박싱(unboxing)**
- Wrapper 객체에 들어 있는 기본 타입의 값을 빼내는 것

```
public class AutoBoxingUnBoxingEx { 
	public static void main(String[] args) { 
		int n = 10; 
		Integer intObject = n; // auto boxing 
		System.out.println("intObject = " + intObject); 
		
		int m = intObject + 10; // auto unboxing 
		System.out.println("m = " + m); 
	} 
}

--- 실행 결과 ---
intObject = 10 
m = 20
```

---
### String

> EX
```
1) 
String a = "Hello";
String b = "Hello"; 
```

```
2)
String a = new String("Hello");
String b = new String("Hello");
```

- `1)` 에서 `a` 와 `b` 는 같은 리터럴 테이블을 가리키지만, `2)` 에서는 서로 다른 힙 메모리를 가리킨다.

**주요 메서드**
![[Pasted image 20231109195420.png]]
- `String.charAt(i)` 는 `char` 타입으로 i번째 인덱스의 문자 값을 리턴한다.
- `+` 말고 `.concat()` 으로 문자열을 연결할 수 있다. 이때 **새로운 문자열을 생성하는 것**이다.
- `trim()` 은 문자열 앞 뒤 공백 문자를 제거한 문자열을 리턴한다.
- `char charAt(int index)` 는 문자열의 문자에 접근한다.

**compareTo() 문자열 비교**
- 같으면 0 리턴
```
String java= "Java"; 
String cpp = "C++"; 
int res = java.compareTo(cpp)
```

**String 클래스 메서드 활용**
```
public class StringEx { 
	public static void main(String[] args) { 
		String a = new String(" C#"); 
		String b = new String(",C++ "); 
		System.out.println( a + "의 길이는 " + a.length() ); // 문자열의 길이(문자 개수) 
		System.out.println( a.contains("#") ); // 문자열의 포함 관계 
		
		a = a.concat(b); // 문자열 연결 
		System.out.println(a); a = a.trim(); // 문자열 앞 뒤의 공백 제거 
		System.out.println(a); a = a.replace("C#","Java"); // 문자열 대치 
		System.out.println(a); String s[ ] = a.split(","); // 문자열 분리 
		
		for (int i=0; i<s.length; i++) 
			System.out.println("분리된 문자열" + i + ": " + s[i]); 
		
		a = a.substring(5); // 인덱스 5부터 끝까지 서브 스트링 리턴 
		System.out.println(a); 
		
		char c = a.charAt(2); // 인덱스 2의 문자 리턴 
		System.out.println(c); 
	} 
}

--- 실행 결과 ---
C#의 길이는 3 
true 
C#,C++ 
C#,C++ 
Java,C++ 
분리된 문자열0: Java 
분리된 문자열1: C++ 
C++ 
+
```

---
### StringBuffer/ StringTokenizer 클래스

**StringBuffer 클래스**
- 가변 크기의 문자열 저장 클래스
- 생성 : `StringBuffer sb = new StringBuffer("java");`
- 주요 메서드
  - `StringBuffer.append(String str)` 는 버퍼 뒤에 str을 붙임.
  - `capacity()` 는 `int`타입으로 리턴되며 버퍼의 크기를 반환.
  - `delete(int start, int end)` 는 `start`에서 `end` 앞까지의 문자열 삭제.
  - `insert(int offset, String str)` 는 `str`을 `offset`위치에 삽입.
  - `replace(int start, int end, String str)` `start`~`end`앞까지 str로 대체.

**StringBuffer 클래스 메서드 활용**
```
public class StringBufferEx { 
	public static void main(String[] args) { 
		StringBuffer sb = new StringBuffer("This"); 
		sb.append(" is pencil"); // 문자열 덧붙이기 
		System.out.println(sb); 
		
		sb.insert(7, " my"); // "my" 문자열 삽입 
		System.out.println(sb); 
		
		sb.replace(8, 10, "your"); // "my"를 "your"로 변경 
		System.out.println(sb); 
		
		sb.delete(8, 13); // "your " 삭제 
		System.out.println(sb); 
		
		sb.setLength(4); // 스트링 버퍼 내 문자열 길이 수정 
		System.out.println(sb); 
	} 
}

--- 실행 결과 ---
This is pencil 
This is my pencil 
This is your pencil 
This is pencil 
This
```

**StringTokenizer 클래스**
- 하나의 문자열을 여러 문자열로 토큰으로 분리
- 생성
```
String query = "name=kitae&addr=seoul&age=21"; 
StringTokenizer st = new StringTokenizer(query, "&");
```

**생성자와 주요 메서드**
- `StringTokenizer(String str)` : 구분 문자(`" "`)로 분리.
- `StringTokenizer(String str, "/")` : `"/"` 로 `str`을 분리하여 토큰화.
- `StringTokenizer(String str, "/", boolean b)` : `b=true`이면 분리한 문자도 토큰에 포함.
- `int countTokens()`
- `boolean hasMoreTokens()` : 다음 토큰이 있으면 true
- `String nextToken()` : 다음 토큰 리턴

**StringTokenizer 클래스 메소드 활용**
```
import java.util.StringTokenizer; 

public class StringTokenizerEx { 
	public static void main(String[] args) { 
		StringTokenizer st = 
			new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/"); 
		while ( st.hasMoreTokens() ) 
			System.out.println( st.nextToken() ); 
	} 
}

--- 실행 결과 ---
홍길동 
장화 
홍련 
쥐 
팥쥐

+ 아래처럼 countTokens 를 이용하여 출력 가능
int n = st.countTokens(); 
for(int i=0; i<n; i++) 
	System.out.println(st.nextToken())
```

---
### 그 외의 여러 클래스들

**Math**
![[Pasted image 20231109204115.png]]
- 난수 발생
```
for(int x=0; x<10; x++) { 
	int n = (int)(Math.random()*100 + 1); // n은 [1~100] 사이 랜덤 정수 
	System.out.println(n); 
}
```

- 활용 예제
```
public class MathEx { 
	public static void main(String[] args) { 
		double a = Math.PI ; 
		System.out.println(a); // 원주율 상수 출력 
		
		System.out.println( Math.ceil(a) ); // ceil(올림) 
		System.out.println( Math.floor(a) ); // floor(내림) 
		System.out.println( Math.sqrt(9) ); // 제곱근 
		System.out.println( Math.exp(2) ); // e의 2승 
		System.out.println( Math.round(3.14) ); // 반올림 
		
		// [1, 45] 사이의 정수형 난수 5개 발생 
		System.out.print("이번주 행운의 번호는 "); 
		for(int i=0; i<5; i++) 
			System.out.print((int)( Math.random() *45 + 1) + " "); 
	} 
}

--- 실행 결과 --
3.141592653589793 
4.0 
3.0 
3.0 
7.38905609893065 
3 
이번주 행운의 번호는 15 31 9 7 5
```

**Calendar 클래스**
![[Pasted image 20231109210220.png]]
- 활용 예제
```
public static void main(String[] args) { 
	Calendar now = Calendar.getInstance(); 
	printCalendar("현재 ", now); 
	
	Calendar firstDate = Calendar.getInstance(); 
	firstDate.clear(); // 2016년 12월 25일. 12월을 표현하기 위해 month에 11로 설정 
	firstDate.set(2016, 11, 25); 
	firstDate.set(Calendar.HOUR_OF_DAY, 20); // 저녁 8시 
	firstDate.set(Calendar.MINUTE, 30); // 30분 
	printCalendar("처음 데이트한 날은 ", firstDate); 
} 
```