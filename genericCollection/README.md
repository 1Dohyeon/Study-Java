### Collection 개념 & Generic 개념

**Collection**이란 요소(element) 객체들의 저장소이다. 따라서 객체들의 컨테이너라고도 불린다.?
- **크기 자동 조절** 가능(고정 크기의 배열을 다루는 어려움 해소)
- 삭제, 삽입에 따른 요소의 **위치 자동 이동**(다양한 객체들의 삽입, 삭제, 검색 등의 관리 용이)

**Generic Collection**은 int, boolean, char 등의 기본 타입으로 데이터를 저장하는 것이 아니라, 제너릭 타입 매개변수를 이용하여 여러 종류의 타입을 다룰 수 있는 collection이다.
> Generic Type : \<E\>, \<T\>, \<K\>, \<V\>
- 위 예시처럼 제너릭(Generic)은 특정 타입만 다루지 않고, 여러 종류의 타입으로 변신할 수 있도록 클래스나 메서드를 일반화시키는 기법이다.

---
### Generic Collection

- **Stack\<E\> :**  동적배열, 연결리스트로 구현 가능. 데이터가 들어오면 가장 마지막에 위치하게 되고, 가장 마지막 데이터를 제거할 수 있다.
  - [Stack\<String\> 활용](https://github.com/1Dohyeon/Study-Java/blob/main/genericCollection/stack/StringStack.java)

- **Vector\<E\> :** 자동으로 길이를 조절하여 배열의 길이 제한을 극복하는 컨테이너 클래스. 맨뒤나 중간에 데이터 삽입가능. 중간에 삽입할 경우 데이터는 뒤로 밀림.
  - [Vector\<Integer\> 활용](https://github.com/1Dohyeon/Study-Java/blob/main/genericCollection/vector/VectorInteger.java)
  - [Vector<Point(= class)> 활용](https://github.com/1Dohyeon/Study-Java/blob/main/genericCollection/vector/VectorPoint.java)

- **List\<E\> :** [자료구조-리스트-설명]
  - ArrayList\<E\> : [자료구조-ArrayList-코드](https://github.com/1Dohyeon/Study-DataStructure/blob/master/01_Lists_with_py/01_DynamicArray.py)
    - [ArrayList 활용](https://github.com/1Dohyeon/Study-Java/blob/main/genericCollection/list/ArrayListEx.java)
  - LinkedList\<E\> : [자료구조-LinkedList-코드](https://github.com/1Dohyeon/Study-DataStructure/blob/master/01_Lists_with_py/02_SinglyLinkedList.py)
    - [LinkedList 활용](https://github.com/1Dohyeon/Study-Java/blob/main/genericCollection/list/LinkedListEx.java)

- **HashSet\<E\> :** 데이터의 순서가 없으며 데이터의 중복을 허용하지 않는다.
  - [HashSet 활용]()

- **Iterator\<E\> :** `Iterator<데이터타입> iterator명 = 컬렉션.iterator();` 형태로 사용한다.  `list.get(값);` 으로 원하는 값을 가져올 수 있는데 Iterator를 사용하는 이유는 **모든 컬렉션 프레임워크에 공통으로 사용 가능**하기 때문이다. 컬렉션 프레임워크에서 쉽게 값을 가져오고 제거할 수 있다. 따라서 **3개의 메소드만 알면 되어서 사용하기 매우 쉽다.**
  - `Iterator.hasNext()` : Iterator 안에 다음 값이 들어있는지 확인. 들었으면 true, 안들었음 false
  - `Iterator.next()` : Iterator의 다음 값 가져오기
  - `Iterator.remove()` : iterator에서 next() 시에 가져왔던 값을 컬렉션(List, Set, Map) 등에서 삭제. 반드시 next() 후에 사용해야 함.

  그리고 당연히 단점도 있다. 처음부터 끝까지의 단방향 반복만 가능하고, 값을 변경하거나 추가가 불가능하고, 대량의 데이터를 제어할 때 속도가 느리다.

  - **Iterator\<E\>  활용**
    - [Iterator 이용(Vector의 모든 요소를 출력하고 합 구하기)](https://github.com/1Dohyeon/Study-Java/tree/main/genericCollection#)
    - [Iterator 이용(HashSet의 음수 값 제거 & 합 구하기)](https://github.com/1Dohyeon/Study-Java/tree/main/genericCollection#)

- **HashMap\<K, V\> :** Key와 Value의 쌍으로 구성되는 요소를 다루는 컬렉션. Key는 중복되면 안되고, 삽입-삭제-검색이 빠르다.
  - [HashMap<String, String> 활용(객체 저장, 학생 정보 관리)](https://github.com/1Dohyeon/Study-Java/tree/main/genericCollection#)