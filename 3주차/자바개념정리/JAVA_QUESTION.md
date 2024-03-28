
# 자바 핵심 개념 정리 3
<details>
<summary>POJO란 무엇일까요?</summary>
<div markdown="1">

Plain Old Java Object로 객체 지향적인 원리에 충실하면서 환경과 기술에 종속되지 않고 필요에 따라 재활용될 수 있는 방식으로 설계된 오브젝트를 말한다. 스프링은 POJO를 이용해서 만든 애플리케이션 코드이며 IoC/DI, AOP, PSA는 애플리케이션을 POJO로 개발할 수 있게 해준다.
</div>
</details>
<br>

<details>
<summary>제너릭이 무엇인가요? 컬렉션 클래스에서 제너릭을 사용하는 이유를 설명해 주세요.</summary>
<div markdown="1">
  제네릭은 모든 종류의 타입을 다룰 수 있도록 클래스나 메소드를 일반화된 타입 매개 변수(generic type)를 이용하여 선언하는 기법이다. <br> 컬렉션 클래스에서 다룰 수 있는 원소의 타입을 여러 종류로 변신할 수 있도록 일반화시킬 수 있기 때문에 제네릭을 사용한다.
</div>
</details>
<br>

<details>
<summary>자바의 클래스 멤버 변수 초기화 순서에 대해 알려주세요.</summary>
<div markdown="1">
  클래스 변수의 기본값, 클래스 변수의 명시적 초기화, 클래스 초기화 블럭, 인스턴스 변수의 기본값, 인스턴스 변수의 명시적 초기화, 인스턴스 초기화 블럭, 인스턴스 생성자 순서이다.
</div>
</details>
<br>

<details>
<summary>직렬화란 무엇인가요?</summary>
<div markdown="1">
  자바 언어에서 사용되는 객체 또는 데이터를 다른 컴퓨터의 자바 시스템에서도 사용할 수 있도록 바이트 스트림 형태로 연속적인 데이터로 변환하는 포맷 변환 기술을 말한다. 직렬화의 주된 목적은 객체를 상태 그대로 저장하고 필요할 때 다시 생성해서 사용하는 것이다.
</div>
</details>
<br>

<details>
<summary>[예습] SOLID에 대해 알아봅시다.</summary>
<div markdown="1">
  객체지향 프로그래밍 및 설계의 5가지 기본 원칙이라고 할 수 있다.
  Single responsibility principle(단일 책임 원칙) : 한 클래스는 하나의 책임만 가져야 한다.
  Open/closed principle(개방-폐쇄 원칙) : 소프트웨어 요소는 확장에는 열려 있으나 변경에는 닫혀 있어야 한다.
  Liskov substitution principle(리스코프 치환 원칙) : 프로그램의 객체는 프로그램의 정확성을 깨뜨리지 않으면서 하위 타입의 인스턴스로 바꿀 수 있어야 한다.
  Interface segregation principle(인터페이스 분리 원칙) : 각 역할에 맞게 인터페이스로 분리하는 것이다.
  Dependency inversion principle(의존 역전 원칙) : 의존 관계는 변화하기 어렵거나 변화가 거의 없는 것과 맺어야 하며 추상성이 높은 클래스와 의존 관계를 맺어야 한다.
</div>
</details>
<br>

<details>
<summary>[예습] DI는 무엇일까요?</summary>
<div markdown="1">
  어떤 클래스가 다른 클래스에 의존한다. 스프링에서 클래스 A가 B 객체를 사용하고 싶은 경우 객체를 직접 생성하지 않고 스프링 컨테이너에서 객체를 주입받아 사용한다.
</div>
</details>
<br>
