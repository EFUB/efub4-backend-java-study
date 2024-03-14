
# 자바 핵심 개념 정리 1
<details>
<summary>Java에서 제공하는 원시 타입들에 무엇이 있고, 각각 몇 바이트를 차지하나요?</summary>
<div markdown="1">
- cf) 원시타입: 실제 데이터 값을 저장하는 타입 vs 참조타입: 메모리 번지 값을 통해 객체를 참조하는 타입 <br/>
1. boolean: 1바이트 <br/>
2. char: 2바이트 <br/>
3. byte: 1바이트 <br/>
4. short: 2바이트 <br/>
5. int: 4바이트 <br/>
6. long: 8바이트 <br/>
7. float: 4바이트 <br/>
8. double: 8바이트 <br/>
- 1: 논리형 <br/>
- 2: 문자형 <br/>
- 3-6: 정수형 <br/>
- 7-8: 실수형 <br/>
</div>
</details>
<br>

<details>
<summary>오버라이딩(OverRiding)과 오버로딩(OverLoading)에 대해 설명해주세요.</summary>
<div markdown="1">
오버로딩: 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메소드가 있더라도, 매개변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메소드를 정의할 수 있다. (리턴값만 다른 경우에는, 오버로딩 불가능) <br/>
오버라이딩: 부모 클래스로부터 상속받은 메소드를 자식 클래스에서 재정의하는 것, 상속받은 메소드를 자식 클래스에서 상황에 맞게 변경해서 사용해야할 때 활용 가능. 메소드의 이름, 매개변수, 리턴 값이 모두 같아야 한다. <br/>
</div>
</details>
<br>

<details>
<summary>객체지향 프로그래밍(OOP)에 대해 설명해주세요</summary>
<div markdown="1">
객체지향프로그래밍: 객체지향 프로그래밍은 실세계에 존재하고 인지하고 있는 객체(Object)를 소프트웨어의 세계에서 표현하기 위해 객체의 핵심적인 개념 또는 기능만을 추출하는 추상화(abstraction)를 통해 모델링하려는 프로그래밍 패러다임을 말한다. <br/>
</div>
</details>
<br>

<details>
<summary>추상 클래스와 인터페이스에 대해 설명해주시고, 차이에 대해 설명해주세요.</summary>
<div markdown="1">
- 추상클래스: 하나 이상의 추상 메소드를 포함하는 클래스 <br/>
( 추상 메소드: 자식 클래스에서 반드시 **오버라이딩해야만** 사용할 수 있는 메소드. 사용하는 목적은 추상 메소드가 포함된 클래스를 상속받는 자식 클래스가 **반드시 추상 메소드를 구현하도록** 하기 위함. (문법: abstract 반환타입 메소드이름(); ← 구현부 없이 **선언부만 존재**) ) <br/>
- 인터페이스: 다른 클래스를 작성할 때 기본이 되는 틀을 제공하면서, 다른 클래스 사이의 중간 매개 역할까지 담당하는 일종의 추상 클래스. 다중 상속시 발생하는 문제(ex 메소드 출처의 모호성)를 막기 위해, 자바에서는 다중상속을 허용하지 않음. → 다중상속의 이점은 취하기 위해, 인터페이스를 통해 다중 상속을 지원 <br/>

</div>
</details>
<br>

<details>
<summary>가비지 컬렉션(gc)란 무엇일까요?</summary>
<div markdown="1">
// 내용 입력
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
// 내용 입력
</div>
</details>
<br>

<details>
<summary>new String()과 리터럴(" ")의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
// 내용 입력
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
