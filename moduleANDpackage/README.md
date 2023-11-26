### ��Ű��(package)

- ������ �̸��� Ŭ������ ������ ��� ������ �߻��� �� ����. ���� ��Ű���� ���� �ʿ䰡 ����.
- ���� ���õ� Ŭ������ �������̽��� ������ �� Ŭ���� ���ϵ��� �ϳ��� ���丮�� ���� ���� ��
- ��Ű�� ���� ������ ��θ��� ��(.)���� ����
>Project.FileIO ��Ű�� > Project.FileIO.Tools.class

**import���� ����Ͽ� ��Ű�� �̿�**
```
import java.util.Scanner;
import java.util.*
```
- `*` �� `util`�� ���� ��� Ŭ�������� �����Ѵ�.
- import�� ������� �ʴ� ���� **��ü ��θ�**�� ���־�� ��.

**����Ʈ ��Ű���� ��Ű���� Ư¡**
- ����Ʈ ��Ű�� : ���� ���丮��, package ���� ���� ������� Ŭ������ ��Ű��.
- ��Ű���� ����ȭ �Ͽ� ���� ������.
- ��Ű�� ���� **���� ����** ����
- ���� �ٸ� ��Ű���� ���� �̸��� Ŭ������ �������̽� ���� ����

**�ֿ� ��Ű��**
>java.lang
>java.util
>java.io
>java.awt
>java.swing

**Object class( in java.lang)**
- ��� Ŭ������ ���� Ŭ������
- ��� ��ü�� �������� ������ ��ü�� �Ӽ��� ��Ÿ���� �޼��� ����
> **�ֿ� �޼���**
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
		System.out.println( obj.getClass().getName() ); // Ŭ���� �̸� 
		System.out.println( obj.hashCode() ); // �ؽ� �ڵ� �� 
		System.out.println( obj.toString() ); // ��ü�� ���ڿ��� ����� ��� 
		System.out.println( obj ); // ��ü ��� 
	} 
	public static void main(String [] args) { 
		Point p = new Point(2,3); 
		print(p); 
	} 
}

--- ���� ��� ---
Point 
366712642 
Point@15db9742 
Point@15db9742
```


---
### ���(module)

- ���� ��Ű���� �̹��� ���� �ڿ��� ��� ���� �����̳�(JDK 9���� ����)
  - �ڹ� api�� ���� ���(99��)�� �����Ͽ� ���� ���α׷��� ���࿡ ������ ���θ� ���� ȯ���� �����ϱ� ���ؼ�
  - �޸𸮰� ������ ���� ��⿡�� �������α׷� ���� ����
- ��� ����(.jmod)�� ����
- �������� rt.jar�� ����ü�� API�� ��Ű������ ��� ��Ҿ��� -> ������ ������ API�� 99���� ��� ���Ϸ� ����
- ��ũ ��뷮�� ���� �ð� �޸� ���ҵ�

---
### ��ü�� �޼���

**toString()**
��ü�� ���ڿ��� ��ȯ
```
@Override
public String toString() { 
	return getClass().getName() +"@" + Integer.toHexString(hashCode()); 
}
```
Object Ŭ������ ������ toString()�� ��ȯ�ϴ� ���ڿ�

**��ü �񱳿� equals()**
���ڿ��� ` == ` ���� `.equals()` �� �̿��Ͽ� ����.
��ü�� ���� ���� �̿�

---
### Wrapper Ŭ����

**Wrapper Ŭ����**�� Ŭ������ �ƴ϶� �ڹ��� �⺻ Ÿ���� Ŭ����ȭ �� 8�� Ŭ�����̴�.
> Byte, Short, Integer, Long, Character, Float, Double, Boolean
- �⺻ Ÿ���� ���� ��ü�� �ٷ� �� �ְ� �Ѵ�.

**�⺻ Ÿ���� ������ Wrapper ��ü ����**
```
Integer i = Integer.valueOf(10); 
Character c = Character.valueOf(��c��); 
Double f = Double.valueOf(3.14); 
Boolean b = Boolean.valueOf(true);
```

- `.intValue()` : ��ü�κ��� �⺻ Ÿ�� ���� �˾Ƴ� �� ����
- `int i = Integer.parseInt("123");` : ���ڿ��� �⺻ ������ Ÿ������ ��ȯ
- `String s1 = Integer.toString(123);` : ���� 123�� ���ڿ��� ��ȯ

**Wrapper Ŭ���� Ȱ��**
```
public class WrapperEx { 
	public static void main(String[] args) { 
		System.out.println( Character.toLowerCase('A') ); // 'A'�� �ҹ��ڷ� ��ȯ 
		char c1='4', c2='F'; 
		
		if( Character.isDigit(c1) ) // ���� c1�� �����̸� true 
			System.out.println(c1 + "�� ����"); 
		if( Character.isAlphabetic(c2) ) // ���� c2�� �������̸� true 
			System.out.println(c2 + "�� ������"); 
			
		System.out.println( Integer.parseInt("-123") ); // "-123"�� 10������ ��ȯ 
		System.out.println( Integer.toHexString(28) ); // ���� 28�� 16���� ���ڿ��� ��ȯ 
		System.out.println( Integer.toBinaryString(28) ); // 28�� 2���� ���ڿ��� ��ȯ 
		System.out.println( Integer.bitCount(28) ); // 28�� ���� 2������ 1�� ���� 
		
		Double d = Double.valueOf(3.14); 
		System.out.println( d.toString() ); // Double�� ���ڿ� "3.14"�� ��ȯ 
		System.out.println( Double.parseDouble("3.14") ); // ���ڿ��� �Ǽ� 3.14�� ��ȯ 
		
		boolean b = (4>3); // b�� true 
		System.out.println( Boolean.toString(b) ); // true�� ���ڿ� "true"�� ��ȯ 
		System.out.println( Boolean.parseBoolean("false") ); // ���ڿ��� false�� ��ȯ 
	} 
}

--- ���� ��� ---
a 
4�� ���� 
F�� ������ 
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
### �ڽ̰� ��ڽ�

**�ڽ�(boxing)**
- �⺻ Ÿ���� ���� Wrapper ��ü�� ��ȯ

**��ڽ�(unboxing)**
- Wrapper ��ü�� ��� �ִ� �⺻ Ÿ���� ���� ������ ��

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

--- ���� ��� ---
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

- `1)` ���� `a` �� `b` �� ���� ���ͷ� ���̺��� ����Ű����, `2)` ������ ���� �ٸ� �� �޸𸮸� ����Ų��.

**�ֿ� �޼���**
![[Pasted image 20231109195420.png]]
- `String.charAt(i)` �� `char` Ÿ������ i��° �ε����� ���� ���� �����Ѵ�.
- `+` ���� `.concat()` ���� ���ڿ��� ������ �� �ִ�. �̶� **���ο� ���ڿ��� �����ϴ� ��**�̴�.
- `trim()` �� ���ڿ� �� �� ���� ���ڸ� ������ ���ڿ��� �����Ѵ�.
- `char charAt(int index)` �� ���ڿ��� ���ڿ� �����Ѵ�.

**compareTo() ���ڿ� ��**
- ������ 0 ����
```
String java= "Java"; 
String cpp = "C++"; 
int res = java.compareTo(cpp)
```

**String Ŭ���� �޼��� Ȱ��**
```
public class StringEx { 
	public static void main(String[] args) { 
		String a = new String(" C#"); 
		String b = new String(",C++ "); 
		System.out.println( a + "�� ���̴� " + a.length() ); // ���ڿ��� ����(���� ����) 
		System.out.println( a.contains("#") ); // ���ڿ��� ���� ���� 
		
		a = a.concat(b); // ���ڿ� ���� 
		System.out.println(a); a = a.trim(); // ���ڿ� �� ���� ���� ���� 
		System.out.println(a); a = a.replace("C#","Java"); // ���ڿ� ��ġ 
		System.out.println(a); String s[ ] = a.split(","); // ���ڿ� �и� 
		
		for (int i=0; i<s.length; i++) 
			System.out.println("�и��� ���ڿ�" + i + ": " + s[i]); 
		
		a = a.substring(5); // �ε��� 5���� ������ ���� ��Ʈ�� ���� 
		System.out.println(a); 
		
		char c = a.charAt(2); // �ε��� 2�� ���� ���� 
		System.out.println(c); 
	} 
}

--- ���� ��� ---
C#�� ���̴� 3 
true 
C#,C++ 
C#,C++ 
Java,C++ 
�и��� ���ڿ�0: Java 
�и��� ���ڿ�1: C++ 
C++ 
+
```

---
### StringBuffer/ StringTokenizer Ŭ����

**StringBuffer Ŭ����**
- ���� ũ���� ���ڿ� ���� Ŭ����
- ���� : `StringBuffer sb = new StringBuffer("java");`
- �ֿ� �޼���
  - `StringBuffer.append(String str)` �� ���� �ڿ� str�� ����.
  - `capacity()` �� `int`Ÿ������ ���ϵǸ� ������ ũ�⸦ ��ȯ.
  - `delete(int start, int end)` �� `start`���� `end` �ձ����� ���ڿ� ����.
  - `insert(int offset, String str)` �� `str`�� `offset`��ġ�� ����.
  - `replace(int start, int end, String str)` `start`~`end`�ձ��� str�� ��ü.

**StringBuffer Ŭ���� �޼��� Ȱ��**
```
public class StringBufferEx { 
	public static void main(String[] args) { 
		StringBuffer sb = new StringBuffer("This"); 
		sb.append(" is pencil"); // ���ڿ� �����̱� 
		System.out.println(sb); 
		
		sb.insert(7, " my"); // "my" ���ڿ� ���� 
		System.out.println(sb); 
		
		sb.replace(8, 10, "your"); // "my"�� "your"�� ���� 
		System.out.println(sb); 
		
		sb.delete(8, 13); // "your " ���� 
		System.out.println(sb); 
		
		sb.setLength(4); // ��Ʈ�� ���� �� ���ڿ� ���� ���� 
		System.out.println(sb); 
	} 
}

--- ���� ��� ---
This is pencil 
This is my pencil 
This is your pencil 
This is pencil 
This
```

**StringTokenizer Ŭ����**
- �ϳ��� ���ڿ��� ���� ���ڿ��� ��ū���� �и�
- ����
```
String query = "name=kitae&addr=seoul&age=21"; 
StringTokenizer st = new StringTokenizer(query, "&");
```

**�����ڿ� �ֿ� �޼���**
- `StringTokenizer(String str)` : ���� ����(`" "`)�� �и�.
- `StringTokenizer(String str, "/")` : `"/"` �� `str`�� �и��Ͽ� ��ūȭ.
- `StringTokenizer(String str, "/", boolean b)` : `b=true`�̸� �и��� ���ڵ� ��ū�� ����.
- `int countTokens()`
- `boolean hasMoreTokens()` : ���� ��ū�� ������ true
- `String nextToken()` : ���� ��ū ����

**StringTokenizer Ŭ���� �޼ҵ� Ȱ��**
```
import java.util.StringTokenizer; 

public class StringTokenizerEx { 
	public static void main(String[] args) { 
		StringTokenizer st = 
			new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����", "/"); 
		while ( st.hasMoreTokens() ) 
			System.out.println( st.nextToken() ); 
	} 
}

--- ���� ��� ---
ȫ�浿 
��ȭ 
ȫ�� 
�� 
����

+ �Ʒ�ó�� countTokens �� �̿��Ͽ� ��� ����
int n = st.countTokens(); 
for(int i=0; i<n; i++) 
	System.out.println(st.nextToken())
```

---
### �� ���� ���� Ŭ������

**Math**
![[Pasted image 20231109204115.png]]
- ���� �߻�
```
for(int x=0; x<10; x++) { 
	int n = (int)(Math.random()*100 + 1); // n�� [1~100] ���� ���� ���� 
	System.out.println(n); 
}
```

- Ȱ�� ����
```
public class MathEx { 
	public static void main(String[] args) { 
		double a = Math.PI ; 
		System.out.println(a); // ������ ��� ��� 
		
		System.out.println( Math.ceil(a) ); // ceil(�ø�) 
		System.out.println( Math.floor(a) ); // floor(����) 
		System.out.println( Math.sqrt(9) ); // ������ 
		System.out.println( Math.exp(2) ); // e�� 2�� 
		System.out.println( Math.round(3.14) ); // �ݿø� 
		
		// [1, 45] ������ ������ ���� 5�� �߻� 
		System.out.print("�̹��� ����� ��ȣ�� "); 
		for(int i=0; i<5; i++) 
			System.out.print((int)( Math.random() *45 + 1) + " "); 
	} 
}

--- ���� ��� --
3.141592653589793 
4.0 
3.0 
3.0 
7.38905609893065 
3 
�̹��� ����� ��ȣ�� 15 31 9 7 5
```

**Calendar Ŭ����**
![[Pasted image 20231109210220.png]]
- Ȱ�� ����
```
public static void main(String[] args) { 
	Calendar now = Calendar.getInstance(); 
	printCalendar("���� ", now); 
	
	Calendar firstDate = Calendar.getInstance(); 
	firstDate.clear(); // 2016�� 12�� 25��. 12���� ǥ���ϱ� ���� month�� 11�� ���� 
	firstDate.set(2016, 11, 25); 
	firstDate.set(Calendar.HOUR_OF_DAY, 20); // ���� 8�� 
	firstDate.set(Calendar.MINUTE, 30); // 30�� 
	printCalendar("ó�� ����Ʈ�� ���� ", firstDate); 
} 
```