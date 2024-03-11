
# 자바 핵심 개념 정리 1
<details>
<summary>Java에서 제공하는 원시 타입들에 무엇이 있고, 각각 몇 바이트를 차지하나요?</summary>
<div markdown="1">
    1. byte : 1byte <br>
    2. boolean : 1byte <br>
    3. char : 2byte<br>
    4. short : 2byte<br>
    5. int : 4byte<br>
    6. float : 4byte<br>
    7. long : 8byte<br>
    8. double : 8byte <br>
</div>
</details>
<br>

<details>
<summary>오버라이딩(OverRiding)과 오버로딩(OverLoading)에 대해 설명해주세요.</summary>
<div markdown="1">
    - 오버라이딩 : 상속된 메소드의 내용을 자식 클래스에서 재정의하는 것이다. <br>
    - 오버로딩 : 같은 클래스 내에 같은 이름의 메소드를 여러 개 선언하는 것이다. 매개변수의 타입, 개수, 순서가 다른 같은 이름의 메소드들을 여러 개 선언 가능하다.<br>
</div>
</details>
<br>

<details>
<summary>객체지향 프로그래밍(OOP)에 대해 설명해주세요</summary>
<div markdown="1">
    프로그램 개발 기법 중 하나로, 부품 객체들을 먼저 만들고 객체들을 연결해서 하나의 전체 프로그램을 완성하는 기법을 객체지향 프로그래밍이라고 한다.
</div>
</details>
<br>

<details>
<summary>추상 클래스와 인터페이스에 대해 설명해주시고, 차이에 대해 설명해주세요.</summary>
<div markdown="1">
    추상 클래스는 여러 클래스들이 가지는 공통적인 필드나 메소드들을 추상 클래스로 따로 정의해두는 것으로, 구현 클래스에서 추상 클래스를 사용할 때에는 'extends' 키워드를 사용한다.
    인터페이스는 객체의 사용 방법을 정의한 것으로, 구현 클래스에서 사용할 때에는 'implements' 키워드를 사용한다. 
    추상클래스는 여러 클래스의 공통된 필드와 메소드를 한 추상 클래스에 모아놓은 것이지만, 인터페이스는 추상클래스와 달리 (default 메소드가 아닌 이상) 구현된 메소드가 없기 때문에 다중상속이 가능하다는 차이점이 있다.
</div>
</details>
<br>

<details>
<summary>가비지 컬렉션(gc)란 무엇일까요?</summary>
<div markdown="1">
    불필요한 메모리 사용을 줄이기 위해 JVM에서 Garbage Collector를 작동시켜 사용하지 않는 객체를 자체적으로(사용자가 삭제시킬 수 없고, gc()라는 메서드를 사용해 삭제를 촉구할 수 있다) 제거하는 기능이다.
</div>
</details>
<br>

<details>
<summary>JVM의 동작 방식에 대해 설명해 주세요.</summary>
<div markdown="1">
    JVM은 중간단계의 바이트코드를 운영체제에 맞는 바이트코드로 변환하여 실행토록 하는 프로그램이다. '.java' 확장자의 java 언어 파일을 JDK(java development kit)의 javac.exe라는 컴파일러 프로그램을 통해 '.class'확장자의 바이트코드(16진수) 파일이 만들어진다. java.exe인 JVM은 각 운영체제에 맞는 기계어(2진수)로 변환하여 java 파일을 운영체제와 상관없이 실행 가능하도록 해준다. 운영체제마다 기계어를 처리하는 방식이 다르고, 이 때문에 JVM은 운영체제 종류에 의존적이다.
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
