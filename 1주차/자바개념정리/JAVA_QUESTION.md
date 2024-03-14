
# 자바 핵심 개념 정리 1
<details>
<summary>Java에서 제공하는 원시 타입들에 무엇이 있고, 각각 몇 바이트를 차지하나요?</summary>
<div markdown="1">
<ul>
<li>논리형	boolean 1 / 문자형	char 2 / 정수형	byte 1 / 정수형	short 2 / 정수형	int 4 / 정수형	long 8 / 실수형	float 4 / 실수형	double 8 </li>
</ul>
</div>
</details>
<br>

<details>
<summary>오버라이딩(OverRiding)과 오버로딩(OverLoading)에 대해 설명해주세요.</summary>
<div markdown="1">
<ul>
<li>오버라이딩(OverRiding): 부모 클래스의 메서드를 자식 클래스에서 상속받아 재정의하는 것을 의미한다. 메서드명, 매개변수 타입, 매개변수 개수, 반환 타입이 동일해야 한다.</li>
<li>오버로딩(OverLoading): 매개변수의 개수나 타입을 다르게 하여 같은 이름의 메서드를 여러 개 정의하는 것을 의미한다.</li>
</ul>
</div>
</details>
<br>

<details>
<summary>객체지향 프로그래밍(OOP)에 대해 설명해주세요</summary>
<div markdown="1">
<ul>
<li>객체지향 프로그래밍(OOP)은 프로그램 구현에 필요한 객체를 파악하고, 객체를 생성한 뒤 객체들 간의 상호작용을 통해 구현하는 것을 의미한다. 모듈 재사용으로 확장 및 유지보수가 용이하다. </li>
</ul>
</div>
</details>
<br>

<details>
<summary>추상 클래스와 인터페이스에 대해 설명해주시고, 차이에 대해 설명해주세요.</summary>
<div markdown="1">
<ul>
<li>추상 클래스: 하나 이상의 추상 메서드를 포함하고 있는 클래스로, 직접 객체를 생성할 수 없다. 다중 상속을 지원하지 않는다.</li>
<li>인터페이스: 모든 메서드가 추상 메서드로 이루어진 클래스로, 다른 클래스들이 해당 인터페이스를 구현하여 사용한다. 다중 상속이 가능하다.</li>
<li>차이점: 1) 추상 클래스는 직접 객체를 생성할 수 없지만, 인터페이스는 가능하다. 2) 추상 클래스는 단일 상속만을 지원하지만, 인터페이스는 다중 상속을 지원한다. </li>
</ul>
</div>
</details>
<br>

<details>
<summary>가비지 컬렉션(gc)란 무엇일까요?</summary>
<div markdown="1">
<ul>
<li>가비지 컬렉션(gc)은 JAVA의 메모리 관리 방법 중의 하나로, 프로그램이 동적 할당했던 메모리 영역 중에서 필요없게 된 영역을 해제하는 기능이다. 더 이상 사용할 수 없게 된 영역이란, 어떤 변수도 가리키지 않게 된 영역을 의미한다.</li>
</ul>
</div>
</details>
<br>

<details>
<summary>JVM의 동작 방식에 대해 설명해 주세요.</summary>

자바 가상 머신(JVM)은 자바 코드를 컴파일하여 만들어지는 바이트 코드를 실행시키기 위한 소프트웨어이다. JVM은 다음과 같은 단계를 거쳐 동작한다.
  1. 프로그램을 실행하면 JVM이 OS로부터 메모리를 할당한다.
  2. 자바 컴파이러(javac)가 자바 소스코드(.java)를 자바 바이트 코드(.class)로 컴파일한다.
  3. Class Loader를 통해 프로그램을 실행하기 위한 .class 파일들을 JVM에 올린다.
  4. JVM에 있는 .class 파일들을 Execution Engine의 Interpreter와 JIT Complier를 통해 해석된다.
  5. 해석된 바이트 코드는 Runtime Data Areas 에 배치되어 실질적인 수행이 이루어진다.
</details>


<details>
<summary>불변 객체란 무엇이고, final은 무엇일까요? 사용하는 이유와 함께 설명해주세요.</summary>
<div markdown="1">
<ul>
<li>불변 객체: 객체가 생성된 후에 그 내부 상태를 변경할 수 없는 객체를 의미한다. 불변 객체는 read-only 메서드만을 제공하며, 객체의 내부 상태를 제공하는 메소드를 제공하지 않거나 제공하는 경우 방어적 복사(defensive-copy)를 통해 제공한다.</li>
<li>final: 자바에서는 'final' 키워드를 사용하여 불변 객체를 생성할 수 있다. 이는 변수, 메서드, 클래스에 사용될 수 있다. 스레드 안정성, 보안성, 서비스의 안정성을 제공하기 위해 사용한다.</li>
</ul>
</div>
</details>
<br>

<details>
<summary>자바의 메모리 영역에 대해 설명해주세요.</summary>
<div markdown="1">
자바의 메모리 영역은 크게 세 가지 영역으로 나누어진다.
<ul>
<li>Method 영역: JVM이 실행되면서 만들어지는 영역이다. 클래스 파일의 바이트 코드, 클래스 변수, 메서드 정보 등이 해당 메모리 영역에 저장된다. </li>
<li>Heap 영역: 인스턴스를 생성할 때 사용되는 메모리 영역이다. 참조형 데이터 타입이 같이 저장되며, Heap의 참조 주소는 Stack이 가지고 있고 해당 객체를 통해서만 Heap 영역의 인스턴스를 참조 가능하다. </li>
<li>Stack 영역: 메서드의 기본 자료형을 생성할 때 저장하는 공간이며, 지역변수, 메서드의 매개변수와 같이 임시적으로 사용되는 데이터가 저장되는 영역이다. 각 Thread마다 하나의 Stack을 가진다.</li>
</ul>
</div>
</details>
<br>

<details>
<summary>new String()과 리터럴(" ")의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
<ul>
<li>nesw String(): 새로운 객체가 생성되어 Heap 메모리 영역에 저장된다. 즉, 매번 메모리에 새로운 문자열 객체가 할당된다. </li>
<li>리터럴(" "): 리터럴을 사용하여 생성할 경우 문자열 상수 풀(String Pool)에 저장된다. 이미 같은 값이 존재하는 경우에 새로운 객체를 생성하지 않고, 기존의 문자열을 재사용한다.</li>
</ul>
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
