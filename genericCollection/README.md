### Collection 개념 & Generic 개념

**Collection**이란 요소(element) 객체들의 저장소이다. 따라서 객체들의 컨테이너라고도 불린다.?
- **크기 자동 조절** 가능(고정 크기의 배열을 다루는 어려움 해소)
- 삭제, 삽입에 따른 요소의 **위치 자동 이동**(다양한 객체들의 삽입, 삭제, 검색 등의 관리 용이)

**Generic Collection**은 int, boolean, char 등의 기본 타입으로 데이터를 저장하는 것이 아니라, 제너릭 타입 매개변수를 이용하여 여러 종류의 타입을 다룰 수 있는 collection이다.
> Generic Type : \<E\>, \<T\>, \<K\>, \<V\>
- 위 예시처럼 제너릭(Generic)은 특정 타입만 다루지 않고, 여러 종류의 타입으로 변신할 수 있도록 클래스나 메서드를 일반화시키는 기법이다.

---
### Generic Collection

**Stack\<E\> :**  동적배열, 연결리스트로 구현 가능. 데이터가 들어오면 가장 마지막에 위치하게 되고, 가장 마지막 데이터를 제거할 수 있다.
- [Stack\<String\> 활용](https://github.com/1Dohyeon/Study-Java/blob/main/genericCollection/stack/StringStack.java)

**Vector\<E\> :** 자동으로 길이를 조절하여 배열의 길이 제한을 극복하는 컨테이너 클래스. 맨뒤나 중간에 데이터 삽입가능. 중간에 삽입할 경우 데이터는 뒤로 밀림.
- [Vector\<Integer\> 활용](https://github.com/1Dohyeon/Study-Java/blob/main/genericCollection/vector/VectorInteger.java)
- [Vector<Point(= class)> 활용](https://github.com/1Dohyeon/Study-Java/blob/main/genericCollection/vector/VectorPoint.java)

**List\<E\> :** [자료구조-리스트-설명]
- ArrayList\<E\> : [자료구조-ArrayList-코드](https://github.com/1Dohyeon/Study-DataStructure/blob/master/01_Lists_with_py/01_DynamicArray.py)
  - [ArrayList 활용]()
- LinkedList\<E\> : [자료구조-LinkedList-코드](https://github.com/1Dohyeon/Study-DataStructure/blob/master/01_Lists_with_py/02_SinglyLinkedList.py)
  - [LinkedList 활용]()

**HashSet\<E\> :**
- [HashSet 활용]()

**Iterator\<E\> :**
- [Iterator 이용(Vector의 모든 요소를 출력하고 합 구하기)](https://github.com/1Dohyeon/Study-Java/tree/main/genericCollection#)
- [Iterator 이용(HashSet의 음수 값 제거 & 합 구하기)](https://github.com/1Dohyeon/Study-Java/tree/main/genericCollection#)

**HashMap\<E\> :**
- [HashMap<String, String> 활용(객체 저장, 학생 정보 관리)](https://github.com/1Dohyeon/Study-Java/tree/main/genericCollection#)