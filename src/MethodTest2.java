public class MethodTest2 { // 메인 클래스
    public static void main(String[] args){ // 메인 메소드, 여기에서 호출.

        Methods methods = new Methods(); // 생성
//=================================================================
        String result = methods.sayHello();
        System.out.println(result); // Hello Java!

        System.out.println(methods.sayHello());// Hello Java!
//=================================================================
        System.out.println(methods.method01()); //3

        int answer = methods.method01();
        System.out.println(answer); // 3
//=================================================================
        System.out.println(methods.sayHello("나영"));

        String yourName = methods.sayHello("나영이");
        System.out.println(yourName);
//=================================================================
        int answer2 = methods.multiple2(5);
        System.out.println(answer2);
//=================================================================
        methods.saySomething("텍스트",3);
//=================================================================
        methods.calculator(2,"+",5);

        int number = methods.clac(3,"*",5);
        System.out.println(number);

        int number2 = methods.clac(1,"/",2);
        System.out.println(number2);

        int number3 = methods.clac(5,"/",2);
        System.out.println(number3);

        int number4 = methods.clac(5,"dd",2);
        System.out.println(number4);
//=================================================================
        String Student1Grade= methods.clacGrade(99);
        System.out.println(Student1Grade);

        String Student2Grade= methods.clacGrade(10);
        System.out.println(Student2Grade);
//=================================================================



    }

}

class Methods { //그냥 메소드 클래스

    String sayHello(){
        //연산 후
        String result = "Hello Java!";
        return result;
    }
    //----------------------------------------------
    int method01(){
        int result =3;
        return result;
    };
    //----------------------------------------------
    String sayHello(String name){
        String result = "Hello " + name;
        return result;
    }
    //----------------------------------------------
    int multiple2(int num){
        int answer = num * num;
        return answer;
    }
    //----------------------------------------------
    void saySomething(String txt,int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println("saySomething 함수입니다." + txt);
        }
    }
    //----------------------------------------------
    void calculator(int num1, String sign, int num2){

        switch (sign){
            case "+":
                System.out.printf("%d + %d = %d %n",num1,num2,num1 + num2);
                break;
            case "-":
                System.out.printf("%d - %d = %d %n",num1,num2,num1 - num2);
                break;
            case "*":
                System.out.printf("%d * %d = %d %n",num1,num2,num1 * num2);
                break;
            case "/":
                System.out.printf("%d / %d = %d %n",num1,num2,num1 / num2);
                break;
        }
    }
    //----------------------------------------------
    int clac(int num1, String op,int num2){
        int result = 0;
        switch (op){
            case "+" : result = num1 + num2;
            break;
            case "-" : result = num1 - num2;
            break;
            case "*" : result = num1 * num2;
            break;
            case "/" : result = num1 / num2;
            break;

            case "%" : result = num1 % num2;
                break;
            
            default:
                System.out.println("양식에 맞춰 넣어주세요");
        }
        return result;
    }

    //----------------------------------------------

    String clacGrade(int grade){

        if( 0 <= grade && grade <= 100 ){
            switch (grade/10){
                case 10: return "A+";
                case 9: return "A";
                case 8: return "B";
                case 7: return "C";
                case 6: return "D";
                case 5: return "F";
                default: return "미달입니다";
            }
        }else {
            return "점수를 제대로 입력해주세요";
        }
    }

    //----------------------------------------------







//    sayHello 오버로딩, 이름이 같아도 형식이 다르면 다르게 구분
}
