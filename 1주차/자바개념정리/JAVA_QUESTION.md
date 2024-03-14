
# 자바 핵심 개념 정리 1
<details>
<summary>Java에서 제공하는 원시 타입들에 무엇이 있고, 각각 몇 바이트를 차지하나요?</summary>
<div markdown="1">
  <br>
  * 논리형: boolean(1Byte)
  <br>
  * 문자형: char(2Byte)
  <br>
  * 정수형: byte(1Byte), short(2Byte), int(4Byte), long(8Byte)
  <br>
  * 실수형: float(4Byte), double(8Byte)
  <br>
  > 원시 타입: 정수, 실수, 문자, 불린 등 실제 데이터 값을 저장하는 타입
  <br>
  > 참조 타입: 문자열, 배열, 열거, 클래스, 인터페이스
  <br>
</div>
</details>
<br>

<details>
<summary>오버라이딩(OverRiding)과 오버로딩(OverLoading)에 대해 설명해주세요.</summary>
<div markdown="1">
  <br>
  * 오버라이딩: 부모 클래스에서 상속받은 메서드를 자식 클래스에서 재정의하여 다르게 구현하는 것.
  <br>
  * 오버로딩: 한 클래스 내에 이름이 같고 매개변수의 자료형이나 개수가 다른 메서드를 여러 개 선언하는 것. 리턴 타입은 오버로딩과 관련 없다.
  <br>
</div>
</details>
<br>

<details>
<summary>객체지향 프로그래밍(OOP)에 대해 설명해주세요</summary>
<div markdown="1">
  <br>
  * 객체지향 프로그래밍: 프로그래밍에서 필요한 데이터를 추상화시켜 상태와 행위를 가진 객체로 만들고, 객체들간의 상호작용을 통해 로직을 구성하는 프로그래밍 기법. 객체지향 프로그래밍의 4가지 특징은 추상화, 상속, 다형성, 캡슐화이다.
  <br>
</div>
</details>
<br>

<details>
<summary>추상 클래스와 인터페이스에 대해 설명해주시고, 차이에 대해 설명해주세요.</summary>
<div markdown="1">
  <br>
  * 추상 클래스: 실체 클래스를 생성하기 위한 목적이 아닌, 상속용/참조용 클래스. abstract 키워드로 선언한다. 실체 클래스들에서 공통되는 필드와 메소드를 정의하는 클래스이다.
  <br>
  * 추상 클래스의 구성: 추상 메서드와 일반 메서드 모두 포함한다. 상수, 변수 필드 모두 포함한다.
  <br> <br>
  * 인터페이스: 클래스가 구현해야 할 메서드들만 선언되는 추상형 클래스로 객체의 기능을 명시한다. interface 키워드로 선언한다. 인터페이스를 상속받는 자식 클래스가 그 목적에 따라 인터페이스의 모든 추상 메서드를 구현하도록 하는 목적이 있다.
  <br>
  * 인터페이스의 구성: 변수 필드는 포함하지 않는다. 상수, 추상 메서드, default 메서드, private 메서드, static 메서드를 모두 포함한다.
  <br> <br>
  * 추상 클래스와 인터페이스의 비교
  <br>
  * 공통점: 인스턴스화 할 수 없다(객체 생성 x, 상속 및 상위참조용으로만 사용). 설계와 구현을 분리할 수 있다. 다형성을 실현한다. 둘 다 추상 메서드가 선언될 수 있는데, 추상 메서드가 있다면 자식 클래스에서 반드시 오버라이딩해 구현해야 한다. // *추상 메서드: body는 없고 prototype만 있는 메서드 
  <br>
  * 차이점: 추상 클래스는 다중 상속이 불가능하고, 인터페이스는 다중 상속이 가능하다. 추상 클래스에서만 변수 필드를 선언할 수 있다. 
  <br>
</div>
</details>
<br>

<details>
<summary>가비지 컬렉션(gc)란 무엇일까요?</summary>
<div markdown="1">
  * 가비지 컬렉션은 자바의 메모리 관리 방법 중의 하나로 JVM의 Heap 영역에서 동적으로 할당했던 메모리 중 더 이상 쓰이지 않는 영역을 자동으로 찾아내어 해제하는 기능이다.
  <br>
</div>
</details>
<br>

<details>
<summary>JVM의 동작 방식에 대해 설명해 주세요.</summary>
<div markdown="1">
  * JVM의 동작 방식
  <br>
  1. 자바 프로그램을 실행하면 JVM은 OS로부터 메모리를 할당받는다.
  <br>
  2. 자바 컴파일러(javac)가 자바 소스코드 (.java)를 자바 바이트 코드(.class)로 컴파일 한다.
  <br>
  3. Class Loader는 동적 로딩을 통해 필요한 클래스들을 로딩 및 링크하여 Runtime Data Area(실질적인 메모리를 할당 받아 관리하는 영역)에 올린다.
  <br>
  4. Runtime Data Area에 로딜 된 바이트 코드는 Execution Engine을 통해 해석된다.
  <br>
  5. 이 과정에서 Execution Engine에 의해 Garbage Collector의 작동과 Thread 동기화가 이루어진다.
  <br>
</div>
</details>
<br>

<details>
<summary>불변 객체란 무엇이고, final은 무엇일까요? 사용하는 이유와 함께 설명해주세요.</summary>
<div markdown="1">
  * 불변 객체(immutable object): 생성 이후 그 상태를 바꿀 수 없는 객체. 한번 객체에 값이 할당되면 내부 데이터를 변경할 수 없고, 다른 참조값을 재할당하는 것은 가능하다. 불변 객체는 Read-Only 메소드만 제공하며, 내부 상태를 제공하는 메서드를 제공하지 않거나 방어적 복사를 통해 제공한다. (String, Integer, Boolean 등)
  <br>
  * final: 초기화 이후 수정할 수 없는 변수. (final 클래스-상속 불가능, final 메소드-오버라이드가 제한됨, final변수-값으로 초기화했다면 값을 바꿀 수 없고 인스턴스를 할당했다면 인스턴스를 바꿀 수 없다.)
  <br>
  * 불변 객체와 final을 사용하는 이유: Thread-Safe하여 멀티스레드 환경에서 동기화를 고려하지 않아도 된다. 실패 원자적인(Failure Atomic) 메소드를 만들 수 있다. 다른 사람이 작성한 함수를 예측가능하며 안전하게 사용할 수 있다.
  <br>
</div>
</details>
<br>

<details>
<summary>자바의 메모리 영역에 대해 설명해주세요.</summary>
<div markdown="1">
  * Heap 영역, Stack 영역, Static 영역
  <br>
  1. Heap 영역: 
  <br>
  2. Stack 영역:
  <br>
  3. Static 영역:
  <br>
</div>
</details>
<br>

<details>
<summary>new String()과 리터럴(" ")의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
  * new String(): ..
  * 리터럴: 
  * 차이: 
  <br>
</div>
</details>
<br>

<details>
<summary>⭐️ 추가 과제: 람다(lambda)에 대해 알아볼까요?</summary>
<div markdown="1">
// 내용 입력
</div>
</details>
<br>

<details>
<summary>⭐️ 추가 과제: 스트림(stream)에 대해 알아볼까요?</summary>
<div markdown="1">
// 내용 입력
</div>
</details>
<br>
