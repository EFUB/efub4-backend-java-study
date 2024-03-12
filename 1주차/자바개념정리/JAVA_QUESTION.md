
# 자바 핵심 개념 정리 1
<details>
<summary>Java에서 제공하는 원시 타입들에 무엇이 있고, 각각 몇 바이트를 차지하나요?</summary>
<div markdown="1">
자바에서 제공하는 원시 타입은 정수형, 실수형, 문자형, 논리형이 있다. 
정수형 타입에는 byte, short, int, long이 있고 각각 byte는 1바이트, short는 2바이트, int는 4바이트, long은 8바이트를 차지한다. 
실수형 타입에는 float과 double이 있고 float은 4바이트, double은 8바이트이다. 
문자형 타입에는 2바이트를 차지하는 char가 있다. 논리형 타입에는 1바이트를 차지하는 boolean이 있다.
</div>
</details>
<br>

<details>
<summary>오버라이딩(OverRiding)과 오버로딩(OverLoading)에 대해 설명해주세요.</summary>
<div markdown="1">
오버라이딩과 오버로딩은 자바에서 다형성을 구현하는 방식이다.
오버라이딩(OverRiding)은 상위 클래스의 메서드를 하위 클래스에서 재정의하여 사용하는 것이다.
오버로딩(OverLoading)은 이름이 같은 메서드를 매개변수의 타입과 갯수에 따라 여러 개를 정의하는 것이다. 메서드를 호출할 때의 매개변수에 따라 맞는 메서드가 호출되는 방식이다.
</div>
</details>
<br>

<details>
<summary>객체지향 프로그래밍(OOP)에 대해 설명해주세요</summary>
<div markdown="1">
객체지향 프로그래밍은 현실 세계를 모델링하여 상태와 행동으로 구성된 객체를 만들어서 그 고유한 객체들간의 상호작용으로 프로그램을 만드는 접근법이다.

객체지향 프로그래밍의 핵심특징은 추상화(Abstraction),상속(Inheritance), 다형성(Polymorphism), 캡슐화(Encapsulation)이다.
(1)추상화
  핵심적인 부분만을 표현하기 위해 클래스들의 공통적인 특성(변수, 메서드)들을 묶어서 표현하는 것
(2)상속
  부모 클래스에 정의된 변수 및 메서드를 자식 클래스에서 상속받아 사용하는 것
(3)다형성
  클래스의 메서드 등을 다양한 형태로 표현하는 것
(4)캡슐화
  데이터와 코드를 외부에서는 알 수 없게 은닉하고, 메서드를 통해서만 사용이 가능하게 하는 것

객체지향 프로그래밍의 장점은 코드의 재사용이 용이하고 유지,보수가 쉽다는 점이다.
</div>
</details>
<br>

<details>
<summary>추상 클래스와 인터페이스에 대해 설명해주시고, 차이에 대해 설명해주세요.</summary>
<div markdown="1">
// 내용 입력
</div>
</details>
<br>

<details>
<summary>가비지 컬렉션(gc)란 무엇일까요?</summary>
<div markdown="1">
가비지 컬렉션은 Heap 영역에서 동적으로 할당된 메모리 중에서 사용되지 않는 메모리 객체를 찾아내서 제거하는 과정을 말한다. 이 과정은 프로그래머가 명시적으로 메모리를 해제하는 것이 아니라, 프로그램 실행 도중에 JVM에 의해 자동으로 수행된다.

Mark And Sweep 알고리즘은 가비지 컬렉션이 동작하는 원리이다. 가비지 컬렉션에서는 해당 객체에 접근 가능한지에 대한 여부(참조되고 있는지 여부)를 메모리 해제의 기준으로 삼고 있어 아무데서도 참조되지 않는 객체를 가비지(gabage)로 판단하여 제거한다.
Mark And Sweep은 ‘Mark-Sweep-Compact’ 단계로 나뉜다.
    -Mark 단계는 메모리 영역을 스캔하면서 어떤 객체들을 살려둘지 식별하는 단계이다.
    -Sweep 단계는 참조되지 않는 객체들을 제거하고 살아있는 객체들만 메모리를 점유하고 있도록 하는 단계이다.
    -Compact 단계에서는 Sweep 후에 분산된 객체들을 Heap의 시작 주소로 모아 메모리가 할당된 부분과 그렇지 않은 부분으로 압축한다.
</div>
</details>
<br>

<details>
<summary>JVM의 동작 방식에 대해 설명해 주세요.</summary>
<div markdown="1">
// 내용 입력
</div>
</details>
<br>

<details>
<summary>불변 객체란 무엇이고, final은 무엇일까요? 사용하는 이유와 함께 설명해주세요.</summary>
<div markdown="1">
// 내용 입력
</div>
</details>
<br>

<details>
<summary>자바의 메모리 영역에 대해 설명해주세요.</summary>
<div markdown="1">
자바 프로그램이 실행되면 JVM(자바 가상 머신)은 OS로부터 메모리를 할당받고, 그 메모리를 용도에 따라서 여러 영역으로 나누어 관리한다.
자바의 메모리 공간은 크게 Method(Static) 영역, Stack 영역, Heap 영역으로 구분되고, 데이터 타입에 따라 각 영역에 할당된다.

Method(Static) 영역 : 멤버 변수(필드), 클래스 변수(Static 변수), 상수(final), 생성자(constructor)와 메소드(method)등을 저장하는 공간.
     - Method 영역에 있는 것은 어느 곳에서나 접근이 가능하다.
     - Method 영역은 프로그램의 시작부터 종료까지 메모리에 남아있다.

Stack 영역 : 메소드 내에서 정의하는 기본 자료형에 해당되는 지역변수와 매개변수 데이터 값이 저장되는 공간.
     - 메소드가 호출될 때 메모리에 할당되고 종료되면 메모리가 해제된다. 
     - LIFO(Last In First Out) 구조를 갖고 변수에 새로운 데이터가 할당되면 이전 데이터는 지워진다.

Heap 영역 : new 키워드로 생성되는 객체(인스턴스), 배열 등이 저장되는 공간으로 프로그램 상에서 데이터를 저장하기 위해 동적으로 할당하여 
     사용하는 영역.
     - Stack 영역과 다르게 보관되는 메모리가 호출이 끝나더라도 삭제 되지 않고 유지된다.
</div>
</details>
<br>

<details>
<summary>new String()과 리터럴(" ")의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
new String()과 리터럴(" ") 두 가지 모두 String 객체를 생성하지만 저장되는 메모리 구조에 차이가 있다.

new String()은 new 키워드로 인스턴스를 생성하기 때문에 Heap 메모리 영역에 저장된다. new String()으로 같은 String 값을 가지는 객체를 여러 개 생성할 경우, Heap 영역에는 생성한 객체의 수만큼의 String값이 저장된다.

반면, 리터럴(" ")은 Heap 안에 있는 String Pool 영역에 저장된다. 리터럴로 생성된 같은 String 값을 가지는 객체들은 같은 주소값을 참조한다. 즉, 리터럴(" ")로 같은 String 값을 가지는 객체를 여러 개 생성할 경우, String Pool 영역의 한개의 String값을 여러 객체가 참조하는 것이다.
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
