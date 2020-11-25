public class MethodTest1 { // 메인 클래스

    public static void main(String[] args){ //메인 메소드
        MethodTest1 methodTest1 = new MethodTest1(); // 생성자 생성, 따로 클래스를 두지 않고 메인 클래스 내에서 오브젝트를 만듬
        methodTest1.multiple();

        methodTest1.sayHello("Nayoung");
        methodTest1.multiple2(2);
    }//메인 메소드

    void multiple(){ // 메인 클래스 내 메소드
        for (int dan = 2;dan<10;dan++){
            System.out.println("-------------");
            for (int num=1; num<10; num++){
                System.out.printf("%d x %d = %d %n",dan,num,dan*num);
            }
        }
    }

    void multiple2(int dan){ // 메인 클래스 내 메소드
            System.out.printf("==========%n%d단만 표현 %n",dan);
            for (int num=1; num<10; num++){
                System.out.printf("%d x %d = %d %n",dan,num,dan*num);
            }
        }


    void sayHello(String name){ // 메인 클래스 내 메인 메소드
        System.out.println("=============");
        System.out.printf("Hello %s %n", name);
    }

}
