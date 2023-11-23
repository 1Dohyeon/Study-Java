**Collection**이란 요소(element) 객체들의 저장소이다. 
따라서 객체들의 컨테이너라고도 불린다.
**Generic Collection**은 int, boolean, char 등의 기본 타입으로 데이터를 저장하는 것이 아니라, 
제너릭 타입 매개변수를 이용하여 여러 종류의 타입을 다룰 수 있는 collection이다.
<br/>
> Generic Type : \<E\>, \<T\>, \<K\>, \<V\>

<br/>
<br/>

### LIST
- Stack\<E\> : <a href="https://github.com/1Dohyeon/Study-DataStructure/tree/master/02_stack_and_queue_with_java">자료구조-스택</a>
  - <a>Stack\<String\> 활용</a>
  - <a>Stack<\Integer\> 활용</a>
- Vector\<E\>
  - Vector\<Integer\> 활용
  - Vector\<Point(= class 객체)\> 활용
- List :  <a href="https://github.com/1Dohyeon/Study-DataStructure/tree/master/01_Lists_with_py">자료구조-리스트</a>
  - ArrayList\<E\> : <a href="https://github.com/1Dohyeon/Study-DataStructure/blob/master/01_Lists_with_py/01_DynamicArray.py">자료구조-동적Array-코드</a>
    - ArrayList<String> 활용
  - LinkedList\<E\> : <a href="https://github.com/1Dohyeon/Study-DataStructure/blob/master/01_Lists_with_py/02_SinglyLinkedList.py">자료구조-단일연결리스트-코드</a>
    - LinkedList<String> 활용 - Queue
- HashSet\<E\>
  - HashSet 활용
- Iterator\<E\>
  - Iterator 이용(Vector의 모든 요소를 출력하고 합 구하기)
  - Iterator 이용(HashSet의 음수 값 제거 & 합 구하기)
- HashMap\<K, V\>(Collection이 아니라 Map임)
  - HashMap\<String, String\> 활용(객체 저장, 학생 정보 관리)

