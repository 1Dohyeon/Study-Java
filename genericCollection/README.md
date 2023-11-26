### Collection ���� & Generic ����

**Collection**�̶� ���(element) ��ü���� ������̴�. ���� ��ü���� �����̳ʶ�� �Ҹ���.?
- **ũ�� �ڵ� ����** ����(���� ũ���� �迭�� �ٷ�� ����� �ؼ�)
- ����, ���Կ� ���� ����� **��ġ �ڵ� �̵�**(�پ��� ��ü���� ����, ����, �˻� ���� ���� ����)

**Generic Collection**�� int, boolean, char ���� �⺻ Ÿ������ �����͸� �����ϴ� ���� �ƴ϶�, ���ʸ� Ÿ�� �Ű������� �̿��Ͽ� ���� ������ Ÿ���� �ٷ� �� �ִ� collection�̴�.
> Generic Type : \<E\>, \<T\>, \<K\>, \<V\>
- �� ����ó�� ���ʸ�(Generic)�� Ư�� Ÿ�Ը� �ٷ��� �ʰ�, ���� ������ Ÿ������ ������ �� �ֵ��� Ŭ������ �޼��带 �Ϲ�ȭ��Ű�� ����̴�.

---
### Generic Collection

- **Stack\<E\> :**  �����迭, ���Ḯ��Ʈ�� ���� ����. �����Ͱ� ������ ���� �������� ��ġ�ϰ� �ǰ�, ���� ������ �����͸� ������ �� �ִ�.
  - [Stack\<String\> Ȱ��](https://github.com/1Dohyeon/Study-Java/blob/main/genericCollection/stack/StringStack.java)
    - [ push(v) : v ���� / peek() : ���� �� ���� ���� / pop() : ���� �� ���� ���� ]  

- **Vector\<E\> :** �ڵ����� ���̸� �����Ͽ� �迭�� ���� ������ �غ��ϴ� �����̳� Ŭ����. �ǵڳ� �߰��� ������ ���԰���. �߰��� ������ ��� �����ʹ� �ڷ� �и�.
  - [Vector\<Integer\> Ȱ��](https://github.com/1Dohyeon/Study-Java/blob/main/genericCollection/vector/VectorInteger.java)
    - [ add(v) : ���� v ���� / add(i, v) : i��°�� v ���� / get(i) : i��° ���Ҹ� Object���·� ���� / elementAt(i) : i��° ������ ��ü�� ��ȯ ]
  - [Vector<Point(= class)> Ȱ��](https://github.com/1Dohyeon/Study-Java/blob/main/genericCollection/vector/VectorPoint.java)

- **List\<E\> :** [�ڷᱸ��-����Ʈ-����]
  - ArrayList\<E\> : [�ڷᱸ��-ArrayList-�ڵ�](https://github.com/1Dohyeon/Study-DataStructure/blob/master/01_Lists_with_py/01_DynamicArray.py)
    - [ArrayList Ȱ��](https://github.com/1Dohyeon/Study-Java/blob/main/genericCollection/list/ArrayListEx.java)
      - [ add(v) : ���� v ���� / get(i) : i��° ���Ҹ� �� ]
  - LinkedList\<E\> : [�ڷᱸ��-LinkedList-�ڵ�](https://github.com/1Dohyeon/Study-DataStructure/blob/master/01_Lists_with_py/02_SinglyLinkedList.py)
    - [LinkedList Ȱ��](https://github.com/1Dohyeon/Study-Java/blob/main/genericCollection/list/LinkedListEx.java)
      - [ add(v) : ���� v ���� / addFirst(v) : ù��°�� v ���� / clear(v) : ��� ��� ����/ offer : ťó�� �� v �߰� ]

- **HashSet\<E\> :** �������� ������ ������ �������� �ߺ��� ������� �ʴ´�.
  - [HashSet Ȱ��](https://github.com/1Dohyeon/Study-Java/blob/main/genericCollection/hashSet/HashSetEx.java)
    - [ add(v) : v ���� / remove(v) : v ������ ����(index �ƴ�) ]

- **Iterator\<E\> :** `Iterator<������Ÿ��> iterator�� = �÷���.iterator();` ���·� ����Ѵ�.  `list.get(��);` ���� ���ϴ� ���� ������ �� �ִµ� Iterator�� ����ϴ� ������ **��� �÷��� �����ӿ�ũ�� �������� ��� ����**�ϱ� �����̴�. �÷��� �����ӿ�ũ���� ���� ���� �������� ������ �� �ִ�. ���� **3���� �޼ҵ常 �˸� �Ǿ ����ϱ� �ſ� ����.**
  - `Iterator.hasNext()` : Iterator �ȿ� ���� ���� ����ִ��� Ȯ��. ������� true, �ȵ���� false
  - `Iterator.next()` : Iterator�� ���� �� ��������
  - `Iterator.remove()` : iterator���� next() �ÿ� �����Դ� ���� �÷���(List, Set, Map) ��� ����. �ݵ�� next() �Ŀ� ����ؾ� ��.

  �׸��� �翬�� ������ �ִ�. ó������ �������� �ܹ��� �ݺ��� �����ϰ�, ���� �����ϰų� �߰��� �Ұ����ϰ�, �뷮�� �����͸� ������ �� �ӵ��� ������.

  - **Iterator\<E\>  Ȱ��**
    - [Iterator �̿�(Vector�� ��� ��Ҹ� ����ϰ� �� ���ϱ�)](https://github.com/1Dohyeon/Study-Java/blob/main/genericCollection/iterator/IteratorEx.java)
      - [ add(v) : ���� v ���� / add(i, v) : i��°�� v ���� ]
    - [Iterator �̿�(HashSet�� ���� �� ���� & �� ���ϱ�)](https://github.com/1Dohyeon/Study-Java/blob/main/genericCollection/iterator/IteratorEx2.java)
      - [ remove() : ���� ������ ���� ���� ]
      
- **HashMap\<K, V\> :** Key�� Value�� ������ �����Ǵ� ��Ҹ� �ٷ�� �÷���. Key�� �ߺ��Ǹ� �ȵǰ�, ����-����-�˻��� ������.
  - [HashMap<String, String> Ȱ��(��ü ����, �л� ���� ����)](https://github.com/1Dohyeon/Study-Java/blob/main/genericCollection/hashMap/HashMapEx.java)
    - [ put(k, v) : k�� v ���� / keySet() : key�� ��ȯ / get(k) : k(Ű)�� v�� ��ȯ ]