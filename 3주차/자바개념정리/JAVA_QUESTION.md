
# 자바 핵심 개념 정리 3
<details>
<summary>POJO란 무엇일까요?</summary>
<div markdown="1">
</div>
- Plain Old Java Object, 오래된 방식의 간단한 자바 객체. <br>
- Java EE 등의 중량 프레임워크들을 사용하게 되면서 해당 프레임워크에 종속된 "무거운" 객체를 만들게 된 것에 반발해서 사용되게 된 용어. <br>
다른 클래스나 인터페이스를 상속받아 메서드가 추가된 클래스가 아닌, gette setter 같이 기본적인 기능만 가진 자바 객체를 말합니다. 
</details>
<br>

<details>
<summary>제너릭이 무엇인가요? 컬렉션 클래스에서 제너릭을 사용하는 이유를 설명해 주세요.</summary>
<div markdown="1">
</div>
제네릭(Generic)이란 "타입을 일반화"하는 것을 의미하며 
클래스 내부에서 정하는 것이 아닌 사용자 호출에 의해 타입이 지정되는 것을 의미합니다. 컬렉션 클래스에서 제너릭을 사용하면 타입 체크가 컴파일 시에 이루어져 실행 시간의 오류를 줄이고, 캐스팅의 번거로움 없이 특정 타입의 객체만 저장하도록 보장합니다. 이를 통해 코드의 안정성과 가독성을 향상시킬 수 있습니다.
</details>
<br>

<details>
<summary>자바의 클래스 멤버 변수 초기화 순서에 대해 알려주세요.</summary>
<div markdown="1">
static 변수 선언부 -> 필드 변수 선언부 -> 생성자 block <br>
- Static 변수 선언부: 클래스가 메모리에 로드될 때 최초 한 번 초기화됩니다. 
- 필드 변수 선언부: 인스턴스가 생성될 때 마다 각 인스턴스에 대해 초기화됩니다.
- 생성자 block: 객체가 생성될 때, 필드 변수 초기화 후에 실행됩니다. 생성자는 인스턴스 변수의 최종 초기화를 담당하며, 필요에 따라 이전에 초기화된 값들을 덮어쓸 수 있습니다. 
</div>
</details>
<br>

<details>
<summary>직렬화란 무엇인가요?</summary>
<div markdown="1">
직렬화는 자바에서 객체의 상태를 바이트 스트림으로 변환하는 과정으로, 이를 통해 객체를 파일에 저장하거나 네트워크를 통해 전송할 수 있습니다. 이 과정은 객체를 지속적으로 보관하거나, 다른 JVM에서 사용할 수 있게 만들기 위해 필요합니다. 역직렬화는 이 바이트 스트림을 다시 객체로 변환하는 반대 과정입니다.
</div>
</details>
<br>

<details>
<summary>[예습] SOLID에 대해 알아봅시다.</summary>
<div markdown="1">
SOLID는 객체 지향 프로그래밍과 설계의 다섯 가지 기본 원칙을 나타내는 약어입니다. <br>
S: 단일 책임 원칙(Single Responsibility Principle) - 한 클래스는 하나의 책임만 가져야 합니다.<br>
O: 개방-폐쇄 원칙(Open/Closed Principle) - 소프트웨어 엔티티(클래스, 모듈, 함수 등)는 확장에는 열려 있어야 하지만, 변경에는 닫혀 있어야 합니다.<br>
L: 리스코프 치환 원칙(Liskov Substitution Principle) - 서브 타입은 언제나 그들의 베이스 타입으로 교체될 수 있어야 합니다.<br>
I: 인터페이스 분리 원칙(Interface Segregation Principle) - 클라이언트는 사용하지 않는 인터페이스에 의존하면 안 됩니다. <br>
D: 의존성 역전 원칙(Dependency Inversion Principle) - 고수준 모듈은 저수준 모듈에 의존해서는 안 되며, 둘 다 추상화에 의존해야 합니다.
</div>
</details>
<br>

<details>
<summary>[예습] DI는 무엇일까요?</summary>
<div markdown="1">
DI(Dependency Injection)는 코드 간 결합도를 줄이기 위해, 객체가 필요로 하는 의존성을 외부에서 주입하는 방식입니다.이를 통해 코드의 재사용성과 테스트 용이성이 향상됩니다.
</div>
</details>
<br>