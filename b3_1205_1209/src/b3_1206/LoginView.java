package b3_1206;

import javax.swing.JFrame;

public class LoginView {
    public static void main( String[] args ) {
        JFrame jf_login = new JFrame();
        
        // 윈도우 운영체제 안에서 창을 만들어 띄울 때 사용하는 클래스
        // insert here
        int width  = 1000; // 로그인 창의 가로 길이를 담는 변수 선언
        int height = 1000; // 로그인 창의 세로 길이를 담는 변수 선언
        jf_login.setTitle( "Login ver 1.0" );   // 내가 만든 창의 타이틀 바에 문자열 찍기
        jf_login.setSize( width, height ); // 로그인 창의 가로와 세로의 크기를 정해주는 메소드 호출
        // 내가 만든 창을 화면에 활성화 또는 비활성화
        Return01 return1 = new Return01();
        jf_login.setVisible( return1.isView() );
    }
    
}
