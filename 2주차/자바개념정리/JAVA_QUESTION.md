# 자바 핵심 개념 정리 2
<details>
<summary>JAVA의 접근 제어자의 종류와 특징에 대해 설명해주세요.</summary>
<div markdown="1">
  * public: 모든 클래스에서 접근 가능.
 <br>
  * protected: 자식 클래스(패키지 무관) 또는 같은 패키지에서 접근 가능.
 <br>
  * default: 같은 패키지에서만 접근 가능.
 <br>
  * private: 같은 클래스 내에서만 접근 가능.
 <br>
</div>
</details>
<br>

<details>
<summary>OOP의 5대 원칙(SOLID)에 대해 설명해주세요.</summary>
<div markdown="1">
 * SRP(Single Responsibility Principle): 단일 책임의 원칙
 <br>
 - 객체는 오직 하나의 책임을 가져야 한다. 한 클래스가 하나의 기능을 담당하여 하나의 책임을 수행하는 데 집중되어있어야 한다.
 <br>
 * OCP(Open-Closed Principle): 개방 폐쇄 원칙
 <br>
 - 객체는 확장에 대해서는 개방적이고 수정에 대해서는 폐쇄적이어야 한다. 기존의 코드를 변경하지 않으면서, 기능을 추가할 수 있도록 설계되어야 한다.
 <br>
 * ISP(Interface Segregation Principle): 인터페이스 분리 원칙
 <br>
 - 인터페이스를 클라이언트 기준으로 분리해야 한다. 즉, 클라이언트가 자신이 호출하지 않는 메소드에 의존하지 않아야 한다.
 <br>
 * LSP(Liskov Substitution Principle): 리스코프 치환 원칙
 <br>
 - 상위 타입의 객체를 하위 타입의 객체로 치환해도 상위 타입을 사용하는 프로그램은 정상적으로 동작해야 한다. 즉 부모 클래스가 들어갈 자리에 자식 클래스를 넣어도 잘 작동해야 한다.
 <br>
 * DIP(Dependency Inversion Principle): 의존성 역전 원칙
 <br>
 - 객체는 구체적인 구현이 아닌 구체적인 구현이 아닌 추상화(추상 클래스, 인터페이스)에 의존해야 한다.
 <br>
</div>
</details>
<br>

<details>
<summary>non-static 멤버와 static 멤버의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
  * non-static: 객체에 속하는 멤버. 객체가 생성될 때 초기화되며, 객체가 삭제될 때까지 메모리에 유지된다. 객체마다 다른 값을 가지고 있다. 
 <br>
  * static: 클래스에 속하는 멤버. 클래스가 로딩될 때 초기화되며, 프로그램 종료까지 메모리에 유지된다. 클래스마다 값이 공유된다.
 <br>
</div>
</details>
<br>

<details>
<summary>클래스, 객체, 인스턴스의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
  * 클래스: 객체를 생성하기 위한 설계도. 필드와 메서드로 이루어져 있다.
 <br>
  * 객체: 자신 고유의 속성을 가지는 물리적, 추상적인 모든 대상. 소프트웨어 세계에 구현할 대상.
 <br>
  * 인스턴스: 클래스를 바탕으로 소프트웨어 세계에 객체를 실체화한 것. 자바에서 new 예약어로 클래스 생성자를 호출하면 인스턴스가 힙 메모리에 생성된다.
 <br>
</div>
</details>
<br>

<details>
<summary>⭐️ 프로세스, 스레드, 멀티프로세스, 멀티스레드에 대해 설명해주세요.</summary>
<div markdown="1">
  * 프로세스: 프로그램이 메모리에 올라와 CPU를 할당받고 프로그램이 실행되고 있는 상태.
 <br>
  * 스레드: 프로세스 내에서 실행되는 흐름의 단위.
 <br>
  * 멀티프로세스: 여러 개의 프로세스가 작업을 병렬처리 하는 것. 각 프로세스 간 메모리 구분이 필요하거나 독립된 주소 공간을 가져야 할 때 사용한다.
 <br>
  * 멀티스레드: 하나의 프로세스에 여러 스레드로 자원을 공유하며 작업을 수행하는 것.
 <br>
</div>
</details>
<br>
