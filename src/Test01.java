public class Test01 { // 메인 클래스

    public static void main(String[] args){ // 메인 메소드
        Test02 test02 = new Test02(3,4,"나나"); // 클래스 Test02를 가져와서 새로운 test02라는 객체 생성

        System.out.println(test02.some);
        test02.something("무언가"); // test02에 접근해서 "무언가" 를 넣어줌


    }

}

class Test02{ //클래스
    
    int num1; //Test02 클래스의 정수형 맴버변수
    int num2;
    String some; //Test02 클래스의 문자형 맴버변수
    void something(String txt){ //Test02 클래스의 변환형이 없는 메소드
        System.out.println(txt);
    }


    public Test02(int num1, int num2, String some) { // 생성자
        this.num1 = num1;
        this.num2 = num2;
        this.some = some;
    }
}