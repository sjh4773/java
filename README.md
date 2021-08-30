### 클래스의 정의 

            클래스의 정의 : 클래스란 객체를 정의해 놓은 것
            클래스의 용도: 클래스는 객체를 생성하는데 사용

            객체의 정의: 실제로 존재하는 것, 사물 또는 개념
            객체의 용도: 객체가 가지고 있는 기능과 속성에 따라 다름

            객체 = 속성(변수) + 기능(메서드)

            속성 : 크기, 길이 , 높이, 색상, 볼륨, 채널 등
            기능 : 켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 변경하기

            속성 -> 변수, 기능 -> 메서드

### 객체와 인스턴스

            객체 : 모든 인스턴스를 대표하는 일반적 용어
            인스턴스 : 특정 클래스로부터 생성된 객체(tv클래스로부터 만들어진 객체 -> tv인스턴스)

            클래스(설계도)  -> (인스턴스화) -> 인스턴스(제품)

            Q. 클래스가 왜 필요한가?
            A. 객체를 생성하기 위해, 클래스 -> 설계도, 객체 -> 제품

            Q. 객체가 왜 필요한가?
            A. 객체를 사용하기 위해

            Q. 객체를 사용한다는 것은?
            A. 객체가 가진 속성과 기능을 사용하려고, 속성 -> 변수, 기능 -> 메서드

            - 객체의 생성과 사용
### 객체의 생성

            클래스명 변수명;               // 클래스의 객체를 참조하기 위한 참조변수를 선언 -> 리모콘
            변수명 = new 클래스명;      // 클래스의 객체를 생성한 후, 객체의 주소를 참조변수에 저장 -> 리모콘과 tv를 연결 

            Tv t;                               // Tv클래스 타입의 참조변수 t를 선언
            t = new Tv();                    // Tv인스턴스를 생성한 후, 생성된 Tv인스턴스의 주소를 t에 저장

            Tv t        =          new Tv()
            리모콘     연결       객체

            2. 객체의 사용

            t.channel = 7;
            t.channelDown(); 메서드 호출

            Class Tv {
            String color;     // 색깔
            boolean power; // 전원상태
            int channel;      // 채널

            void power()          { power = !power; }
            void channelUp()     { channel++; }
            void channelDown()  { channel--; }
            }

            Tv t;
            t = new Tv();

            t.channel = 7;
            t.channelDown();
            System.out.println("현재 채널은 " + t.channel + "입니다.");

            하나의 인스턴스를 여러 개의 참조변수가 가리키는 경우(가능)
            여러 인스턴스를 하나의 참조변수가 가리키는 경우(불가능)

### 객체 배열

            객체 배열 == 참조 변수 배열

            Tv tv1, tv2, tv3 -> Tv[] tvArr = new Tv[3];

            // 객체를 생성해서 배열의 각 요소에 저장
            tvArr[0] = new Tv();
            tvArr[1] = new Tv();
            tvArr[2] = new Tv();

            Tv[] tvArr = { new Tv(), new Tv(), new Tv() };

            Tv t1 = new Tv();
            Tv t2 = new Tv();
            Tv t3 = new Tv();


            // 참조변수를 여러개로 묶어서 하나의 배열로 다루는 것
            Tv[] tvArr = new Tv[3]
            tvArr[0] = new Tv();
            tvArr[1] = new Tv();
            tvArr[2] = new Tv();

### 클래스의 정의
            1. 설계도
            2. 데이터 + 함수
            3. 사용자 정의 타입

            1. 변수 : 하나의 데이터를 저장할 수 있는 공간
            2. 배열 : 같은 종류의 여러 데이터를 하나로 저장할 수 있는 공간
            3. 구조체 : 서로 관련된 여러 데이터(종류 관계X)를 하나로 저장할 수 있는 공간
            4. 클래스 : 데이터와 함수의 결합(구조체 + 함수)

            사용자 정의 타입 - 원하는 타입을 직접 만들 수 있다.

            선언위치에 따른 변수의 종류

            class Variables
            {
            int iv;          // 인스턴스 변수
            static int cv;  // 클래스 변수(static변수, 공유변수) -> static이 없으면 iv와 같다

            void method()
            {
                int lv = 0;   // 지역변수, 메서드 종료 시 자동제거
            }
            }

### 영역

            1. 클래스 영역 : iv, cv
            2. 메서드 영역 : lv

            객체 = iv를 묶어 놓은것

### 클래스 변수와 인스턴스 변수

            Class Card {
                String kind;  // 무늬, 인스턴스 변수(개별 속성) -> iv
                int number;  // 숫자, 인스턴스 변수(개별 속성)

                static int width  = 100; // 폭, 클래스 변수(공통 속성) -> cv
                static int heigth = 250; // 높이, 클래스 변수(공통 속성)
            }

            Card c = new Card(); 객체 생성
            c.kind = "HEART";
            c.number = 5;
            c.width =  200;   →    Card.width = 200; 
            c.height = 300;         Card.height = 300; 


### 메서드란?
            1. 문장들을 묶어놓은 것(작업단위)
            2. 값(입력)을 받아서 처리하고, 결과를 반환(출력)

            int add(int x, int y) {
                int result = x + y;

                return result; // 결과를 반환
            }

### 메서드의 장점
            - 코드의 중복을 줄일 수 있다.
            - 코드의 관리가 쉽다.
            - 코드를 재사용할 수 있다.
            - 코드가 간결해서 이해하기 쉬워진다.

### 메서드의 작성
            - 반복적으로 수행되는 여러 문장을 메서드로 작성
            - 하나의 메서드는 한 가지 기능만 수행하도록 작성

            메서드 = 선언부 + 구현부

            반환타입 메서드이름 (타입 변수명, 타입 변수명, ... ) → 선언부
            {
                // 메서드 호출시 수행될 코드                → 구현부
            }

### 패키지(package)
            - 서로 관련된 클래스의 묶음
            - 클래스는 클래스 파일(*.class), 패키지는 폴더. 하위 패키지는 하위 폴더
            - 클래스의 실제 이름(full name)은 패키지를 포함.(java.lang.String)
            rt.jar는 클래스들을 압축한 파일(JDK설치경로\jre\lib에 위치)



            지역변수(lv) : 메서드 내에 선언된 변수, 메서드 영역 내에 존재하므로 이름이 같아도 상관없다.

### 메서드의 호출

            메서드이름(값1, 값2, ...); // 메서드를 호출하는 방법

            print99danAll();  // void print99danAll()을 호출
            int result = add(3, 5) // int add(int x, int y)를 호출하고, 결과를 result에 저장, 작업결과를 저장할 변수가 필요

            - return문
            실행 중인 메서드를 종료하고 호출한 곳으로 되돌아간다.

            void printGugudan(int dan) {
                if(!(2 <= dan && dan <= 9))
                    return; // dan의 값이 2~9가 아닌경우, 호출한 곳으로 그냥 되돌아간다.

                for(int i=1;i<=9;i++){
                    System.out.printf("%d * %d = %d%n", da, i, dan * i );
                }
                return; // 반환 타입이 void이므로 생략가능. 컴파일러가 자동추가
            }

            반환타입이 void가 아닌 경우. 반드시 return문 필요
            int multiply(int x, int y) {
                int result = x * y;

                return result;  // 반환 타입이 void가 아니므로 생략불가
            }

            int max(int a, int b) {
                if(a > b)
                return a;  // 조건식이 참일 때만 실행되고 거짓일 때는 실행되지 않아 오류가 발생한다.
            }

                    ↓

            int max(int a,int b) {
                if(a > b)
                return a;
                else
                return b;
            }

### 호출 스택(call stack)
            - 메서드 수행에 필요한 메모리가 제공되는 공간 
            - 메서드가 호출되면 호출스택에 메모리 할당, 종료되면 해제
            - 아래 있는 메서드가 위의 메서드를 호출한 것
            - 맨 위의 메서드 하나만 실행 중, 나머지는 대기중

            스택(stack) : 밑이 막힌 상자. 위에 차곡차곡 쌓인다.


### 기본형 매개변수
            - 기본형 매개변수 : 변수의 값을 읽기만 할 수 있다(.read only)
            - 참조형 매개변수 : 변수의 값을 읽고 변경할 수 있다.(read & write)


### static 메서드와 인스턴스 메서드

            class MyMath2 {
                long a, b; // iv 인스턴스 변수

                long add()  {    // 인스턴스 메서드(iv를 사용)
                        return a + b;
                }
                // 클래스 메서드(static메서드) iv를 사용하지 않음(객체 필요 x)
                static long add(long a, long b) // lv 지역변수  {  
                        return a + b;
                }
            }

            * 객체는 iv의 집합

            - 인스턴스 메서드
            - 인스턴스 생성 후, "참조변수.메서드이름()'으로 호출
            - 인스턴스 멤버(iv, im)와 관련도니 작업을 하는 메서드
            - 메서드 내에서 인스턴스 변수(iv) 사용가능

            - static 메서드(클래스메서드)
            - 객체생성없이 '클래스이름.메서드이름()'으로 호출
            - 인스턴스 멤버(iv, im)와 관련없는 작업을 하는 메서드
            - 메서드 내에서 인스턴스 변수(iv) 사용불가

            class MyMath2Test {
                public static void main(String args[])  {
                System.out.println(MyMath2.add(200L,100L); // 클래스메서드(객체 생성 없이 호출가능) 호출
                MyMath2 mm = new MyMath2();  // 인스턴스 생성
                mm.a = 200L;
                mm.b = 100L;
                System.out.println(mm.add()); // 인스턴스메서드 호출
            }

            메서드를 만들 때 static를 붙이는 경우는 iv를 사용하지 않을 때
            static 메서드는 자기 작업에 필요한 값들을 매개변수로 받는다
            반면에 인스턴스 메서드는 매개변수가 없기 때문에 iv값을 사용한다.
            static 메서드와 인스턴스 메서드의 차이는 iv 사용의 유무이다.


### static을 언제 붙여야 할까?
            - 속성(멤버 변수) 중에서 공통 속성에 static을 붙인다.

            class Card {
            // 개별 속성
            String kind;  // 무늬
            int number;  // 숫자

            // 공통 속성
            static int width = 100;  // 폭
            static int height = 250; // 높이
            }

            - 인스턴스 멤버(iv, im)을 사용하지 않는 메서드에 static을 붙인다.

            class MyMath2 {
            long a, b;

                    long add()                    { return a + b; }  // a, b는 인스턴스 변수
            static long add(long a, long b)  { return a + b; }  // a, b는 지역변수
            }

            ### 메서드 간의 호출과 참조
            - static 메서드는 인스턴스 변수(iv)를 사용할 수 없다.

            class TestClass2 {
                int iv;           // 인스턴스 변수, 객체 생성 후 사용가능
                static int cv;   // 클래스 변수, 언제나 사용가능

                
                void instanceMethod() {           // 인스턴스 메서드, 객체 생성 후 호출 가능
                                // 인스턴스 메서드가 호출 되었다는 것은 이미 객체가 생성되었다는 것 따라서 인스턴스 변수 사용 가능
                    System.out.println(iv);         // 인스턴스 변수를 사용할 수 있다.
                    System.out.println(cv);        // 클래스 변수를 사용할 수 있다.
                }

                static void staticMethod() {    // static 메서드
                    System.out.println(iv);     // 에러!!! 인스턴스 변수를 사용할 수 없다.
                                                    // static메서드는 객체 생성없이 호출 가능 하지만 iv는 객체 생성 후 호출가능
                    System.out.println(cv);    // 클래스 변수는 사용할 수 있다.
                }
            }  // end of class


### 메서드 간의 호출과 참조
            - static 메서드는 인승턴스 메서드(im)를 호출할 수 없다.

            class TestClass {
                void instanceMethod() {}        // 인스턴스 메서드
                static void staticMethod()   {}  // static메서드

                void instanceMethod2() {       // 인스턴스 메서드
                    instanceMethod();          // 다른 인스턴스 메서드를 호출한다.
                    staticMethod();              // static 메서드를 호출한다. -> 항상 ok

                static void staticMethod2() {   // static 메서드
                    instanceMethod();           // 에러! instance메서드를 호출할 수 없다!
                    staticMethod();               // static 메서드는 호출할 수 있다.
                }
            }  // end of class

            Q. static 메서드는 static 메서드 호출가능?
            A. 네

            Q. static 메서드는 인스턴스 변수 사용가능?
            A. 아니요. iv를 사용하려면 객체(iv묶음)를 생성해야 사용가능한데 static 메서드는 언제나 호출 가능하기 때문에 인스턴스 변수를 사용 불가능

            Q. static 메서드는 인스턴스 메서드를 호출 가능가능?
            A. 아니요. 인스턴스 메서드는 iv를 필요로 하기 때문에 불가능

            Q. 왜? static 메서드는 인스턴스 멤버(iv, im)를 쓸 수 없나요?
            A. static 메서드 호출 시 객체(iv묶음)가 없을 수도 있어서

### 오버로딩(overloading)
            - 한 클래스 안에 같은 이름의 메서드 여러개 정의하는 것

            void println()
            void println(boolena x)
            void println(char x)
            void println(char[] x)
            void println(double x)
            void println(float x)
            void println(int x)
            void println(long x)
            void println(Object x)
            void println(String x)

            - 오버로딩이 성립하기 위한 조건
            1. 메서드 이름이 같아야 한다.
            2. 매개변수의 개수 또는 타입이 달라야 한다.
            3. 반환 타입은 영향 없다.

            // 오버로딩 x
            int add(int a, int b) { return a+b; }
            int add(int x, int y) { return x+y; }
            -> 똑같음

            // 오버로딩 x
            int add(int a, int b) { return a+b; }
            long add(int a, int b) { return (long)a+b; }
            -> 매개변수의 개수 또는 타입이 달라야하는 조건 성립 x

            // 오버로딩 성립 그러나 ambiguous, 에러 발생
            long add(int a, long b) { return a+b; }
            long add(long a, int b) { return a+b; }

            메서드 이름 같다 = 하는 작업이 같다

### 생성자(constructor)
            - 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'
            - 인스턴스 생성시 수행할 작업(iv 초기화)에 사용

            Time t = new Time();
            t.hour = 12;
            t.minute = 34;
            t.second = 56;

            Time t = new Time(12, 34, 56); // 생성자 호출

#### 생성자를 만들 때 규칙
            - 이름이 클래스 이름과 같아야 한다.
            - 리턴값이 없다.(void 안붙임)
            - 모든 클래스는 반드시 생성자를 가져야 한다.

### 기본 생성자(default constructor)
            - 매개변수가 없는 생성자
            - 생성자가 하나도 없을 때만, 컴파일러가 자동 추가

            클래스이름() {} // 기본 생성자
            Point() {}        // Point클래스의 기본 생성자


### 매개변수가 있는 생성자

            class Car {
                String color;
                String gearType;
                int door;
                
                Car() {}
                
                Car(String c, String g, int d){
                    color = c;
                    gearType = g;
                    door = d;
                }
            }
            public class Oop_12 {

                public static void main(String[] args) {
                    Car c1 = new Car();
                    c1.color = "white";
                    c1.gearType = "auto";
                    c1.door = 4;
                    
                    Car c2 = new Car("white","auto",4);
                    
                    System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door=" + c1.door);
                    System.out.println("c1의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door=" + c2.door);

                }

            }

### 생성자 this()
            - 생성자에서 다른 생성자 호출할 때 사용
            - 다른 생성자 호출시 첫 줄에서만 사용가능

            class Car {
                String color;
                String gearType;
                int door;

                // 코드의 중복 bad code
                Car() {
                    color = "white";
                    gearType = "auto"
                    door = 4;
                }

                // 코드의 중복을 제거한 코드 good code
                Car() {
                    //Card("white","auto",4);
                    this("white","auto",4); // this를 통해 아래의 생성자 호출
                }

                Car(String c, String g, int d) {
                    color = c;
                    gearType = g;
                    door = d;
                }

            }

### 참조변수 this
            - 인스턴스 자신을 가리키는 참조변수
            - 인스턴스 메서드(생성자 포함)에서 사용가능
            - 지역변수(lv)와 인스턴스 변수(iv)를 구별할 때 사용

            Car(String c, String g, int d) {
            // color는 iv, c는 lv
            color = c;
            gearType = g;
            door = d;

            }
            -> this 같은 클래스 내에서 생략 가능

            Car(String color, String gearType, int door) {
                // this.color는 iv, color는 lv
                this.color = color;
                this.gearType = gearType;
                this.door = door;
            }
            -> 참조 변수와 변수 이름을 구별 하기 위함.




### 참조변수 this와 생성자 this()
            - this : 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있다.
                    모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재한다.
            - this(), this(매개변수) 생성자, 같은 클래스의 다른 생성자를 호출 할 때 사용한다.    

### 변수의 초기화
            - 지역변수(lv)는 수동 초기화 해야함(사용전 꼭!!!)
            - 멤버변수(iv, cv)는 자동 초기화된다.

            class InitTest {
                int x;                     // 인스턴스 변수
                int y = x;                // 인스턴스 변수

                void method1() {
                        int i;               // 지역변수
                        int j=i;            // 에러, 지역변수를 초기화하지 않고 사용
                }
            }

### 멤버변수의 초기화
            1. 명시적 초기화(=) // 간단 초기화

            class Car {
                int door = 4;                // 기본형(primitive type) 변수의 초기화
                Engine e = new Engine(); // 참조형(reference type) 변수의 초기화, 참조형 변수 null or 객체주소

            2. 초기화 블럭
                - 인스턴스 초기화 블럭 : { }    // 복잡한 초기화, 여러 문장 넣기
                - 클래스 초기화 블럭 : static { }

            class StaticBlockTest {
                static int[] arr = new int[10]; // 명시적 초기화

                static { // 클래스 초기화 블럭 - 배열 arr을 난수로 채운다.
                    for(int=0;i<arr.length;i++) {
                        arr[i] = (int)(Math.random()*10)+1;
                    }
            }
            3. 생성자 <- iv 초기화. 복잡한 초기화
            Car(String color, String gearType, int door) { // 매개변수 있는 생성자
                    this.color = color;
                    this.gearType = gearType;
                    this.door = door;
            }


            - 클래스 변수 초기화 시점 : 클래스가 처음 로딩될 때 단 한번(메모리에 올라갈 때)   
            - 인스턴스 변수 초기화 시점 : 인스턴스가 생성도리 때 마다

            class InitTest {
                static int cv = 1;   // 명시적 초기화
                int iv = 1;           // 명시적 초기화

                static {  cv = 2;  }     // 클래스 초기화 블럭
                {   iv = 2;  }            // 인스턴스 초기화 블럭

                InitTest() {  // 생성자
                    iv = 3;
                }
            }

### 상속(Inheritance)
            - 기존의 클래스로 새로운 클래스를 작성하는 것.(코드의 재사용)
            - 두 클래스를 부모와 자식으로 관계를 맺어주는 것

            class 자식클래스 extends 부모클래스 {
            // ...
            }

            class Parent { }

            class Child extends Parent {
                // ...
            }

            - 자손은 조상의 모든 멤버를 상속받는다.(생성자, 초기화 블럭 제외)
            - 자손의 멤버 개수는 조상보다 적을 수 없다.(같거나 많다.)

            class Parent {
                int age;
            }

            class Child extends Parent { }

            - 자손의 변경은 조상에 영향을 미치지 않는다.

            class Parent {
                int age;
            }

            class Child extends Parent {
                void play() {
                    System.out.println("놀자~");
                }
            }

### 포함 관계
            - 포함(composite)이란?
            - 클래스의 멤버로 참조변수를 선언하는 것
            - 작은 단위의 클래스를 만들고 이들을 조합해서 클래스를 만든다.

### 클래스 간의 관계 결정하기
            - 상속관계 : '~은 ~이다.(is-a)'
            - 포함관계:  '~은 ~을 가지고 있다.(has-a)'

            원은 점이다 - Circle is a Point
            원은 점을 가지고 있다. - Circle has a Point -> 더 자연스러움

### 단일 상속(Single Inheritance)
            - Java는 단일상속만을 허용한다.(C++은 다중상속 허용)
            class TvDVD extends Tv, DVD {    // 에러, 조상은 하나만 허용된다.
                // ...
            }
            - 비중이 높은 클래스 하나만 상속관계로, 나머지는 포함관계로 한다.

### Object클래스 - 모든 클래스의 조상
            - 부모가 없는 클래스는 자동적으로 Object클래스를 상속받게 된다.
            - 모든 클래스는 Object클래스에 정의된 11개의 메서드를 상속받는다.
            - toString(), equals(Object obj), hashCode(), ...

            class Tv{
                // ...
            }

            class SmartTv extends Tv {
                // ...
            }

                    ↓

            class Tv extends Object {
                // ...
            }

            class SmartTv extends Tv {
                // ...
            }

### 오버라이딩(overriding)
            - 상속받은 조상의 메서드를 자신에 맞게 변경하는 것

            class Point {
                int x;
                int y;

                String getLocation() {
                        return "x :" + x + ", y :" + y;
                }
            }

            class Point3D extends Point {
                int z;

                String getLocation() {        // 오버라이딩
                        return "x :" + x + ", y :" + y + ", z :" + z;
                }
            }


### 오버라이딩의 조건
            1. 선언부가 조상 클래스의 메서드와 일치해야 한다.
            2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
            3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.

### 오버로딩 vs. 오버라이딩
            - 오버로딩(overloading)  : 기존에 없는 새로운 메서드를 정의하는 것(new) -> 이름만 같음. 상속과 관계 x
            - 오버라이딩(overriding) : 상속받은 메서드의 내용을 변경하는 것(change, modify)

### 참조변수 super
            - 객체 자신을 가리키는 참조변수. 인스턴스 메서드(생성자)내에만 존재
            - 조상의 멤버를 자신의 멤버와 구별할 때 사용

### super()-조상의 생성자
            - 조상의 생성자를 호출할 때 사용
            - 조상의 멤버는 조상의 생성자를 호출해서 초기화

            class Point {
                int x, y;
                
                Point(int x, int y) {
                this.x = x;
                this.y = y;
                }
            }
                
            class Point3D extends Point {
            int z;
            
            Point3D(int x, int y, int z) {
                this.x = x; // 조상멤버를 초기화
                this.y = y; // 조상멤버를 초기화
                this.z = z;
                }
            }
            -> 잘못됐음
                        ↓

            Point3D(int x, int y, int z) {
                super(x, y);   // 조상클래스의 생성자 Point(int x, int y)를 호출
                this.z = z;    // 자신의 멤버를 초기화
            }

            - 생성자의 첫 줄에 반드시 생성자(super(),this())를 호출해야 한다.(매우 중요!)
            그렇지 않으면 컴파일러가 생성자의 첫 줄에 super();를 삽입

            class Point {
                int x;
                int y;

                Point() {
                    this(0,0);
                }

                Point(int x, int y) {
                    this.x = x;
                    this.y = y;
                }
            }

                        ↓

            class Point extends Object {
                int x;
                int y;
            
                Point() {
                    this(0,0);
                }

                Point(int x, int y) {
                    super(); // Object();
                    this.x = x;
                    this.y = y;
                }
            }

### 패키지의 선언
            - 패키지는 소스파일의 첫 번재 문장으로 단 한번 선언
            - 같은 소스 파일의 클래스들은 모두 같은 패키지에 속하게 된다.
            - 패키지 선언이 없으면 이름없는(unnamed) 패키지에 속하게 된다.

### 클래스 패스(classpath)
            - 클래스 파일(*.class)의 위치를 알려주는 경로(path)
            - 환경변수 classpath로 관리하며, 경로간의 구분자는 ';'를 사용
            classpath( 환경변수)에 패키지의 루트를 등록해줘야 함

### import문
            - 클래스를 사용할 때 패키지 이름을 생략할 수 있다.
            - 컴파일러에게 클래스가 속한 패키지를 알려준다.
            - java.lang 패키지의 클래스는 import하지 않고도 사용할 수 있다.
            String, Object, System, Thread...


            class ImportTest {
                java.util.Date today = new java.util.Date();
                // ...
            }

                        ↓

            import java.util.Date;

            class ImportTest {
            Date today = new Date();
            }


            // 모든 클래스 생략 가능, String, System,...
            import java.lang.*;

            class ImportTest2
            {
                public static void main(String[] args)
                {
                    System.out.println("Hello World!");
                }
            }

### import문의 선언
            - import문을 선언하는 방법은 다음과 같다.

            import 패키지명.클래스명; 또는 import 패키지명.*;

            - import문은 패키지문과 클래스 선언의 사이에 선언한다.
            - import문은 컴파일 시에 처리되므로 프로그램의 성능에 영향없음.

### static import문
            - static 멤버를 사용할 때 클래스 이름을 생략할 수 있게 해준다.
            import static java.lang.Integer.*;       // Integer클래스의 모든 static 메서드
            import static java.lang.Math.random; // Math.random()만. 괄호 안붙임.
            import static java.lang.System.out;    // System.out을 out만으로 참조 가능

            System.out.println(Math.random()); -> out.println(random());

### 제어자(modifier)
            - 클래스와 클래스의 멤버(멤버 변수, 메서드)에 부가적인 의미 부여

            접근 제어자 : public, protected, (default), private
            그 외 : static, final, abstract, native, transient, synchronized, volatile, stricfp

            - 하나의 대상에 여러 제어자를 같이 사용가능(접근 제어자는 하나만)

            public class ModifierTest {
                public static final int WIDTH = 200;

                public static void main(String[] args) {
                        System.out.println("WIDTH="+WIDTH);
                }
            }

### static - 클래스의, 공통적인

            class StaticTest {
                static int width = 200;       // 클래스 변수(static변수)
                static int height = 120;      // 클래스 변수(static변수)

                static {                          // 클래스 초기화 블럭
                    // static 변수의 복잡한 초기화 수행
                }

                static int max(int a, int b) {   // 클래스 메서드(static메서드), iv 사용 불가, instance 메서드 사용 불가
                    return a > b ? a : b;
                }
            }

### final - 마지막의, 변경될 수 없는

            final class FinalTest {              // 조상이 될 수 없는 클래스 ex) String,Math
                final int MAX_SIZE = 10;    // 값을 변경할 수 없는 멤버변수(상수)

                final void getMaxSize() {      // 오버라이딩 할 수 없는 메서드(변경불가)
                    final int LV = MAX_SIZE; // 값을 변경할 수 없는 지역변수(상수)
                    return MAX_SIZE;
                }
            }

### abstract - 추상의, 미완성의

            abstract class AbstractTest {       // 추상 클래스(추상 메서드를 포함한 클래스)
                abstract void move();           // 추상 메서드(구현부가 없는 메서드)
            }

            AbstractTest a = new AbstractTest();   // 에러. 추상 클래스(미완성 설계도)의 인스턴스 생성불가
                                                            // 완전한 클래스(완성된 설계도)를 만든 후에 객체 생성가능

### 접근 제어자(access modifier)

            private     : 같은 클래스 내에서만 접근이 가능하다.
            (default)   : 같은 패키지 내에서만 접근이 가능하다.
            protected : 같은 패키지 내에서, 그리고 다른 패키지 자손클래스에서 접근이 가능하다.
            public      : 접근 제한이 전혀 없다.

            public(접근제한없음) > protected(같은 패키지 + 자손) > default(같은 패키지) > private(같은 클래스)

### 캡슐화와 접근 제어자
            - 접근 제어자를 사용하는 이유
            - 외부로부터 데이터를 보호하기 위해서
            - 외부에는 불필요한, 내부적으로만 사용되는 부분을 감추기 위해서

### 다형성(polymorphism)
            - 여러 가지 형태를 가질 수 있는 능력
            - 조상 타입 참조 변수로 자손 타입 객체를 다루는 것
            - 객체와 참조변수의 타입이 일치할 때와 일치하지 않을 때의 차이?

            SmartTv s = new SmartTv(); // 참조 변수와 인스턴스의 타입이 일치
            Tv        t = new SmartTv(); // 조상 타입 참조변수로 자손 타입 인스턴스 참조

            - 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없다.
            Tv        t = new SmartTv();    // OK. 허용
            SmartTv s = new Tv()            // 에러. 허용 안 됨.

            Q. 참조변수의 타입은 인스턴스의 타입과 반드시 일치해야 하나요?
            A. 아닙니다 일치하는 것이 보통이지만 일치 하지 않을 수도 있습니다.

            Q. 참조변수가 조상타입일 때와 자손타입일 때의 차이
            A. 참조변수로 사용할 수 있는 멤버의 갯수가 달라집니다.

            Q. 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 있나요?
            A. 아니요. 허용되지 않습니다.

### 참조변수의 형변환
            - 사용할 수 있는 멤버의 갯수를 조절하는 것
            - 조상 자손 관계의 참조변수는 서로 형변환 가능

### instanceof 연산자
            - 참조변수의 형변환 가능여부 확인에 사용. 가능하면 true 반환

            Q. 참조변수의 형변환은 왜 하나요?
            A. 참조변수(리모콘)을 변경함으로써 사용할 수 있는 멤버의 갯수를 조절하기 위해서

            Q. instanceof연산자는 언제 사용하나요?
            A. 참조변수를 형변환하기 전에 형변환 가능 여부를 확인할 때

            void doWork(Car c) {
                if (c instanceof) FireEngine) {         // 1. 형변환이 가능한지 확인
                    FireEngine fe = (FireEngine)c;    // 2. 형변환
                    fe.water();

### 매개변수의 다형성
            - 참조형 매개변수는 메서드 호출시, 자신과 같은 또는 자손타입의 인스턴스를 넘겨줄 수 있다.

            ## 여러 종류의 객체를 배열로 다루기
            - 조상타입의 배열에 자손들의 객체를 담을 수 있다.

            Product p1 = new Tv();
            Product p2 = new Computer();
            Product p3 = new Audio();

                        ↓

            Product p[] = new Product[3];
            p[0] = new Tv();
            p[1] = new Computer();
            p[2] = new Audio();

### 추상 클래스(abstract class)
            - 미완성 설계도. 미완성 메서드를 갖고 있는 클래스

            abstract class Player {   // 추상클래스(미완성 클래스)
                abstract void play(int pos);      // 추상메서드(몸통{}이 없는 미완성 메서드)
                abstract void void stop();        // 추상메서드
            }
            - 다른 클래스 작성에 도움을 주기 위한 것. 인스턴스 생성 불가.
            Player p = new Player(); // 에러. 추상 클래스의 인스턴스 생성 불가

            - 상속을 통해 추상 메서드를 완성해야 인스턴스 생성가능

            class AudioPlayer extends Player {
                void play(int pos) { /* 내용 생략 */ }   // 추상메서드를 구현
                void stop() { /* 내용 생략 */ }           // 추상메서드를 구현
            }

            AudioPlayer ap = new AudioPlayer();  // 인스턴스 생성 가능

### 추상 메서드 (abstract method)
            - 미완성 메서드. 구현부(몸통, {})가 없는 메서드

            /* 주석을 통해 어떤 기능을 수행할 목적으로 작성하였는지 설명한다. */
            abstract 리턴타입 메서드이름();
            사용이유 : 꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우

            abstract class Player { // 추상클래스
                abstract void play(int pos);        // 추상메서드
                abstract void stop();                // 추상메서드
            }

            class AudioPlayer extends Player {
                void play(int pos) { /* 내용 생략 */ }  // 추상메서드를 구현( 몸통 { } 만들어주기 )
                void stop()  { /* 내용 생략 */ }         // 추상메서드를 구현
            }

            abstract class AbstractPlayer extends Player { // 2개를 구현해야 완성인데 1개만 구현한 미완성 상태이므로 abstract를 붙여줘야한다.
                void play(int pos) { /* 내용 생략 */ }   // 추상메서드를 구현
            }

### 추상클래스의 작성
            - 여러 클래스에 공통적으로 사용될 수 있는 추상클래스를 바로 작성하거나
            기존클래스의 공통 부분을 뽑아서 추상 클래스를 만든다.
            - 추상화 <- -> 구체화
            - 추상화된 코드는 구체화된 코드보다 유연하다. 변경에 유리
            GregorianCalendar cal = new GregorianCalendar(); // 구체적
            Calendar cal = Ca;emdar/getInstance();               // Calendar 자손 객체를 반환.  어떤 객체를 반환할지 불분명 -> 추상적


### 인터페이스(interface)
            - 추상 메서드의 집합 <--> 추상클래스( 일반 클래스에 추상 메서드가 있는 것, 생성자, iv도 있다)
            - 구현된 것이 전혀 없는 설계도. 껍데기(모든 멤버가 public)

            interface 인터페이스이름 { // interface의 모든 멤버는 public 이며 메소드는 모두 추상 메소드
                public static final 타입 상수이름 = 값; <- 상수 o, 변수 iv,cv x
                public abstract 메서드이름(매개변수목록); <- 추상 메서드
            }

            interface PlayinCard {
                public static final int SPADE = 4;
                final int DIAMOND = 3;   // public static final int DIAMOND = 3;
                static int HEART = 2;      // public static final int HEART = 2;
                int CLOVER = 1;            // public static final int CLOVER = 1;

                public abstract String getCardNumber();
                String getCardKind();      // public abstract String getCardKind(); ->public abstract 생략가능
            }

### 인터페이스의 상속
            - 인터페이스의 조상은 인터페이스만 가능(Object가 최고 조상 아님)
            - 다중 상속이 가능.(추상메서드는 충돌해도 문제 없음)

            interface Fightable extends Movable, Attackable { }

            interface Movable {
                / ** 지정된 위치(x, y)로 이동하는 기능의 메서드 */
                void move(int x, int y);
            }

            interface Movable {
                / ** 지정된 대상(u)을 공격하는 기능의 메서드 */
                void attack(Unit u);
            }

### 인터페이스의 구현
            - 인터페이스에 정의도니 추상 메서드를 완성하는 것

            class 클래스이름 implements 인터페이스이름 {
                // 인터페이스에 정의도니 추상메서드를 모두 구현해야 한다.
            }

            interface Fightable {
                void move(int x, int y);
                void attack(Unit u)l
            }

            class Fighter implements Fightable {
                public void move(int x, int y) { /* 내용 생략 */ }
                public void attack(Unit u)      { /* 내용 생략 */ }
            }

            - 일부만 구현하는 경우, 클래스 앞에 abstract를 붙여야 함.

            abstract class Fighter implements Fightable {
                public void move(int x, int y) { /* 내용 생략*/ }
            }

### 인터페이스의 구현

            Q. 인터페이스란?
            A. 추상 메서드의 집합

            Q. 인터페이스의 구현이란?
            A. 인터페이스의 추상메서드 몸통 { } 만들기(미완성 설계도 완성하기) 

            Q. 추상 클래스와 인터페이스의 공통점은?
            A. 추상 메서드를 가지고 있다.(미완성 설계도)

            Q. 추상 클래스와 인터페이스의 차이점은?
            A. 인터페이스는 iv를 가질 수 없다.

### 인터페이스를 이용한 다형성

            - 인터페이스도 구현 클래스의 부모? Yes
            - 인터페이스 타입 매개변수는 인터페이스 구현한 클래스의 객체만 가능

            interface Fightable {
                void move(int x, int y);
                void attack(Fightable f);
            }  // 2개만 사용가능

            class Fighter extends Unit implements Fightable {
                public void move(int x, int y) { /* 내용 생략 */ }
                public void attack(Fightable f) { /* 내용 생략 */ }
            }

            Unit       u = new Fighter();
            Fightable f = new Fighter();

            f.move(100, 200);
            f.attack(new Fighter());

            - 인터페이스를 메서드의 리턴타입으로 지정할 수 있다.

            // Fightable 인터페이스를 구현한 클래스의 인스턴스를 반환
            Fightable method() {
                Fighter f = new Fighter();
                return f;
            }
            // 위 두 문장을 한 문장으로 바꾸면 다음과 같다. return new Fighter();

            Fightable f = method(); // 호출

### 인터페이스의 장점
            - 두 대상(객체) 간의 '연결,대화,소통'을 돕는 '중간 역할'을 한다.
            - 선언(설계)와 구현을 분리시킬 수 있게 한다.


            // 유연하지 않고, 변경에 불리.
            class B {
                public void method() {
                        System.out.println("methodInB);
                }
            }

                                ↓

            - 인터페이스 덕분에 B가 변경되어도 A는 안바꿀 수 있게 된다.(느슨한 결합)

            // 껍데기 <--> 알맹이 분리
            // 새로운 interface 선언
            interface I {
                public void method();  // 선언부만 떼어내기
            }

                                +

            class B implements I {
                public void method() {
                            System.out.println("methodInB");
                }
            }

            - 개발 시간을 단축할 수 있다.
            - 변경에 유리한 유연한 설계가 가능하다.
            - 표준화가 가능하다.
            - 서로 관계없는 클래스들을 관계를 맺어줄 수 있다.

### 디폴트 메서드와 static 메서드
            - 인터페이스에 디폴트 메서드, static 메서드 추가 가능.(JDK1.8부터)
            - 인터페이스에 새로운 메서드(추상 메서드)를 추가하기 어려움
            해결책 => 디폴트 메서드(default method)
            - 디폴트 메서드는 인스턴스 메서드(인터페이스 원칙 위반)

            interface MyInterface {
            void method();
            void netMethod();  // 추상 메서드
            }

                        ↓

            interface MyInterface {
            void method();
            default void newMethod() { }
            }

            - 디폴트 메서드가 기존의 메서드와 충돌할 때의 해결책
            1. 여러 인터페이스의 디폴트 메서드 간의 충돌
            - 인터페이스를 구현한 클래스에서 디폴트 메서드를 오버라이딩 해야한다.
            2. 디폴트 메서드와 조상 클래스의 메서드 간의 충돌
            - 조상 클래스의 메서드가 상속되고, 디폴트 메서드는 무시된다.