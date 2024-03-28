
# 자바 핵심 개념 정리 3
<details>
<summary>POJO란 무엇일까요?</summary>
<div markdown="1">
POJO ( Plain Old Java Object) : 자바로 생성하는 순수한 객체
객체 지향적인 원리에 충실하면서 환경과 기술에 종속되지 않고, 필요에 따라 재활용될 수 있는 방식으로 설계된 오브젝트를 의미한다.

public class User {
    private String name;
 
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }
}
 위 코드와 같이 다른 클래스나 인터페이스를 상속/implements 받은 클래스가 아닌 getter, setter 같은 기본적인 형태의 자바 객체를 POJO라고 한다.

EJB(Enterprise JavaBeans)의 사용과 프로그램의 규모 증가로 특정 기술과 환경에 종속되어 의존하게 된 자바 코드는 가독성이 떨어져 유지보수에 어려움이 생겼다. 또한, 특정 기술의 클래스를 상속받거나, 직접 의존하게 되어 확장성이 매우 떨어지며 점점 객체지향성을 잃어가는 문제점이 있었고 이를 해결하기 위해 POJO가 개발되었다.
</div>
</details>
<br>

<details>
<summary>제너릭이 무엇인가요? 컬렉션 클래스에서 제너릭을 사용하는 이유를 설명해 주세요.</summary>
<div markdown="1">
제네릭 : 데이터의 타입을 클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것
ex) class Person<T> { 
    }

    public class Main {
        public static void main(String[] args) {
            Person<Integer> arr1 = new Person<>();
        }
    }

컬렉션(collection) : 많은 수의 데이터를 그 사용 목적에 적합한 자료구조로 묶어 하나로 그룹화한 객체

컬렉션에서 제네릭을 사용하는 이유
1. 타입 안정성 보장
 제너릭을 사용하면 컴파일러가 컴파일 시에 타입을 체크하여 타입 관련 오류를 미리 방지할 수 있다. 이는 더 안정적인 코드를 작성할 수 있도록 돕는다.
2. 코드 가독성
 제너릭을 사용하면 해당 컬렉션이 어떤 타입의 객체를 다루는지 명확하게 표현할 수 있으므로, 코드를 작성하거나 유지 보수할 때 혼란을 줄일 수 있다.
3. 다양한 타입
 제너릭을 사용하면 하나의 클래스나 메서드를 여러 타입의 데이터에 대해 재사용할 수 있다. 이는 코드의 유연성을 높이고 중복을 줄일 수 있다.
</div>
</details>
<br>

<details>
<summary>자바의 클래스 멤버 변수 초기화 순서에 대해 알려주세요.</summary>
<div markdown="1">

클래스 변수 초기화 시점 : 클래스가 처음 메모리에 로딩될 때 단 한번 초기화된다.

클래스 변수 초기화 순서
기본값(0) -> 명시적초기화 -> 클래스 초기화 블럭
1. 클래스 변수가 메모리에 생성되고, 기본값(0)이 저장된다.
2. 명시적 초기화에 의해 값이 저장된다.
   ex) static int classVariable = 1;
3. 클래스 초기화 블록에 의해 값이 저장된다.
   ex) static { classVariable = 2; }

인스턴스 변수 초기화 시점: 인스턴스를 생성할 때마다 각 인스턴스별로 초기화된다.

기본값(0) -> 명시적초기화 -> 인스턴스 초기화 블럭 -> 생성자
1. 인스턴스가 생성되면 메모리에 올라가고, 기본값(0)이 저장된다.
2. 명시적 초기화에 의해 값이 저장된다.
   ex)  int instanceVariable = 1;
3. 인스턴스 초기화 블록에 의해 값이 저장된다.
   ex) { instanceVariable = 2; }
4. 생성자에 의해 값이 저장된다.
   ex) 생성자(){ 
    	instanceVariable = 3;
       }
</div>
</details>
<br>

<details>
<summary>직렬화란 무엇인가요?</summary>
<div markdown="1">
직렬화(serialize) : 자바에서 사용되는 Object 또는 Data를 외부의 자바 시스템에서도 사용할 수 있도록 바이트 스트림(stream of bytes) 형태로 연속적인 데이터로 변환하는 기술

직렬화는 다음과 같은 상황에서 사용할 수 있다.
1. 생성한 객체를 파일로 저장할 때
2. 저장한 객체를 읽을 때
3. 다른 서버에서 생성한 객체를 받을 때

// 직렬화하여 객체를 파일로 저장하는 예시 코드
// 직렬화될 객체는 Serializable 인터페이스를 구현해야함
// java.io.ObjectOutputStream 객체를 이용하여 직렬화 실행
public class SerialDTO implements Serializable {
}
public class ManageObject {
    public static void main(String[] args) {
            SerialDTO dto = new SerialDTO()
            FileOutputStream fos = new FileOutputStream(fullPath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dto);
    } 
}
</div>
</details>
<br>

<details>
<summary>[예습] SOLID에 대해 알아봅시다.</summary>
<div markdown="1">
1. SRP(Single Responsibility Principle): 단일 책임 원칙
   - 모든 클래스는 각각 하나의 책임만 가져야 하며, 수정할 이유는 단 한 가지여야 한다.
2. OCP(Open Closed Priciple): 개방 폐쇄 원칙
   - 기존의 코드를 변경하지 않으면서, 기능을 추가할 수 있도록 설계가 되는 원칙을 말한다.
3. LSP(Listov Substitution Priciple): 리스코프 치환 원칙
   - 부모 클래스가 들어갈 자리에 자식 클래스를 넣어도 역할을 하는데 문제가 없어야 한다.
4. ISP(Interface Segregation Principle): 인터페이스 분리 원칙
   - 각 역할에 맞게 인터페이스를 분리하여 인터페이스가 최소한의 기능만 제공하면서 하나의 역할에 집중해야 한다.
5. DIP(Dependency Inversion Principle): 의존 역전 원칙
   - 구체적인 클래스보다 상위 클래스, 인터페이스, 추상 클래스와 같이 변하지 않을 가능성이 높은 클래스와 관계를 맺는 것이 좋다.
</div>
</details>
<br>

<details>
<summary>[예습] DI는 무엇일까요?</summary>
<div markdown="1">
DI (Dependency Injection, 의존성 주입) : 객체가 직접적으로 의존하는 객체를 생성하는 것이 아니라 외부에서 의존 객체를 주입받아 사용하는 것
보통 객체 간의 의존성은 객체가 직접 생성하는 방식으로 구현된다. 그러나 이는 유연성이 떨어지고 테스트하기 어렵게 만들 수 있다. DI는 이러한 문제를 해결하기 위해 사용된다.

DI(의존성 주입)의 장점
- 객체 간의 결합도를 낮추고 유연한 코드를 작성할 수 있다.
- Unit Test가 용이해진다.
- 코드의 재활용성을 높여 준다.
- 객체 간의 의존성을 줄이거나 없앨 수 있다.
</div>
</details>
<br>