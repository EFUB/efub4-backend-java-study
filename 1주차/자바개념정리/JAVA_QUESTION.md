
# 자바 핵심 개념 정리 1
<details>
<summary>Java에서 제공하는 원시 타입들에 무엇이 있고, 각각 몇 바이트를 차지하나요?</summary>
<div markdown="1">
byte: 1바이트
short: 2바이트   
int: 4바이트
long: 8바이트
float: 4바이트
double: 8바이트
char: 2바이트
boolean: JVM 및 컴파일러에 따라 다를 수 있지만 보통 1바이트
</div>
</details>
<br>

<details>
<summary>오버라이딩(OverRiding)과 오버로딩(OverLoading)에 대해 설명해주세요.</summary>
<div markdown="1">
- 오버라이딩: 서브클래스가 슈퍼클래스의 메소드를 재정의하여 사용하는 것. 메소드 시그니처는 같지만 구현이 다를 수 있다.
- 오버로딩: 같은 이름의 메소드가 여러 개 정의되어, 매개변수의 타입, 개수, 순서가 다른 경우를 가리킨다.

</div>
</details>
<br>

<details>
<summary>객체지향 프로그래밍(OOP)에 대해 설명해주세요</summary>
<div markdown="1">
객체지향 프로그래밍은 프로그램을 객체들의 모임으로 바라보고, 이들 간의 상호작용으로 프로그램을 구성하는 프로그래밍 패러다임이다. 주요 특징으로는 캡슐화, 상속, 다형성이 있다.
</div>
</details>
<br>

<details>
<summary>추상 클래스와 인터페이스에 대해 설명해주시고, 차이에 대해 설명해주세요.</summary>
<div markdown="1">
추상 클래스: 하나 이상의 추상 메소드를 포함하는 클래스로, 객체를 생성할 수 없다. 일반 메소드와 필드를 가질 수 있다.

인터페이스: 모든 메소드가 추상 메소드인 클래스로, 다중 상속을 지원하며, 다른 클래스들이 특정 동작을 공유할 수 있도록 한다.
</div>
</details>
<br>

<details>
<summary>가비지 컬렉션(gc)란 무엇일까요?</summary>
<div markdown="1">
가비지 컬렉션은 사용하지 않는 메모리를 자동으로 회수하는 프로세스를 가리킨다. Java에서는 JVM이 동적으로 할당된 메모리를 관리하고, 더 이상 사용되지 않는 객체를 찾아 메모리를 해제한다.
</div>
</details>
<br>

<details>
<summary>JVM의 동작 방식에 대해 설명해 주세요.</summary>
<div markdown="1">
JVM은 Java 가상 머신의 약자로, Java 바이트코드를 실행하는 역할을 한다. JVM은 클래스 로더를 통해 클래스 파일을 로드하고, 바이트코드를 해석하여 실행한다. 이때 JIT(Just-In-Time) 컴파일러를 사용하여 바이트코드를 네이티브 코드로 변환하고 실행한다.
</div>
</details>
<br>

<details>
<summary>불변 객체란 무엇이고, final은 무엇일까요? 사용하는 이유와 함께 설명해주세요.</summary>
<div markdown="1">
불변 객체는 생성된 후에 상태를 변경할 수 없는 객체를 가리킨다. final 키워드는 해당 변수, 메소드, 클래스 등을 수정할 수 없게 한다. 이를 통해 불변성을 유지하고, 다중 스레드 환경에서 안전성을 보장할 수 있다.
</div>
</details>
<br>

<details>
<summary>자바의 메모리 영역에 대해 설명해주세요.</summary>
<div markdown="1">
스택(Stack): 지역 변수, 메소드 호출, 스레드 관련 정보 등이 저장된다.
힙(Heap): 동적으로 할당된 객체들이 저장된다.
메소드 영역(Method Area 또는 PermGen): 클래스 정보, 상수, 정적 변수 등이 저장된다.
네이티브 메소드 스택(Native Method Stack): 네이티브 메소드 호출 정보가 저장된다.
</div>
</details>
<br>

<details>
<summary>new String()과 리터럴(" ")의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
new String(): 매번 호출될 때마다 새로운 문자열 객체를 생성한다.

리터럴(" "): 컴파일 시점에 이미 문자열이 상수 풀(Constant Pool)에 저장되어 있고, 동일한 문자열 리터럴은 같은 객체를 참조한다. 따라서 더 효율적이다.
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
