package com.ch01;

public class Sonata {
    
    // 클래스 선언, Sonata라는 클래스를 정의하였다. 선언하는 이유는 '재사용'
    // 호출할 수 있다.
    // int와 같이 타입을 나타내는 예약어가 있다 - 어디에? JDK설치할 수 있다 -> JDK11
    // JVM안에는 예약어가 들어가있다.
    // 변수 선언 -> '타입' '변수이름'
    // 정수형을 담을 수 있는 type
    
    int i = 10; // 변수 선언 및 초기화를 했다.
    
    // int j; 변수 선언만 하고 초기화는 안되어있다.
    // j=5; 초기화를 하였다. 에러 발생 원인 "선언부에서는 선언과 초기화를 동시에 해야한다." (컨벤션)
    
    double d = 3.14; // double 타입에는 실수도 담는다.
    
    static void methodA() {
        System.out.println( "methodA 호출" ); // 2
        // 정수형을 담을 수 있는 변수 j를 method내부에서 선언하였다.
        // 지역변수라고 한다.
        // 지역변수는 메소드 안에서 선언함.
        // 메소드 밖에서는 접근이 불가하다.
        // 메소드 안에서 사용되고 나면 사라진다.(메모리에서 비워진다.)
        int j; // 변수 선언만 하고 초기화는 안되어있다.
        j = 5; // 메서드 안에서는 변수 선언과 초기화를 분리하여 작성할 수 있다.
        // int j에 선언된 변수 안에 5라는 값을 담았다. 이것을 초기화라고 한다.
    }
    
    // 변수 이름뒤에 ()가 있으면 메서드라고 부른다. -동사형이다.
    // 기능을 담당함
    // 우리는 이클립스에서 코딩을하고 코딩하는 영역은 반드시 클래스 선언 내부이어야 함
    // 클래스 내부에는 메인메서드를 가질 수 있다.
    // 메인메서드가 있어야 exe파일로 만들 수 있다.
    // 코드 실행시 가장 먼저 호출되는 곳이다.
    // JVM이 자동으로 호출한다.
    
    public void login( String id, String pw ) {// 파라미터 자리는 선언하는 자리이다.
        
        System.out.println( id + "," + pw ); // 변수 id를 출력//tomato가 출려된다.
        
    }
    
    // 메인 메소드는 자바에서 제공되는 메소드이다.
    // 그러니까 바꾸면(리턴타입니다 또는 파라미터 타입...) 안된다.
    // 클론 받아쓰기 X
    public static void main( String[] args ) {// 이것을 메인메서드라고 한다.
        
        System.out.println( "main 메서드 호출 성공" ); // 1
        methodA();
        // 메소드를 호출할 때 세미콜론으로 끝내고
        // 파라미터가 존재하면 파라미터도 고려해야 하고
        // 또한 타입도 고려되어야만 한다.
        // 결론: 사용자 정의 메소드 호출 시 파라미터와 타입도 맞춰야 한다.
        // static 영역에서는 내 안에 정의된 메소드라 하더라도
        // 반드시 인스턴스화를 하고 호출해야한다.
        // 두 번째 방법은 methodA();처럼 똑같이 static을 붙여서 선언
        Sonata test = new Sonata();
        test.login( "apple", "123" );
        test.login( "tomato", "123" );
        
    }
}
