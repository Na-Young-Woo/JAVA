

public class Test {
//    public class 와 파일명은 같아야 한다
//    이 class가 파일의 대표 class임을 알려줌.

    public static void main(String[] args){
//        메인 함수 지정
        int number = 0;
        number = 0;
        int number1;
        number1 = 1;


        Student gildong = new Student(); // 생성자, 클래스는 new를 통해서 생성자를 하나 만들어 낸다.
        gildong.name = "홍길동"; // student의 맴버변수에 접근해 홍길동을 넣어줌
        gildong.grade = 1;
        gildong.ban = 3;

        System.out.printf("이름은 %s 이고 학년은 %d학년이며, 반은 %d 반이다. %n",gildong.name,gildong.grade,gildong.ban);

        Student kim = new Student();
        kim.name = "kim";
        kim.grade = 2;
        kim.ban = 2;
        kim.increaseGrade();
        kim.increaseGrade();
        kim.displayInfo();




        Person nayoung = new Person();
        nayoung.name = "ny";
        nayoung.gender = 2;
        nayoung.height = 161;
        nayoung.age = 22;


        Person human = new Person();

        human.alive = true;
        human.gender = 2;
        human. height = 170;

        System.out.printf("안녕 난 %s이고 %d살이다 반갑다. %n",nayoung.name,nayoung.age);

        Computer pc1 = new Computer();

        pc1.cpu = "Intell 9세대";
        pc1.memory = 8000;
        pc1.ssd = 512;
        pc1.brand = "Samsung";








    }

}

class Student{
//    class의 첫 문자는 대문자로 지정
    String name; //    멤버변수1
    int grade; //    멤버변수2
    int ban; //    멤버변수3

    void displayInfo(){
        System.out.printf("이름은 %s %d학년 %d반 입니다. (이 메세지는 내장 메소드를 통해 작성되었습니다.) %n",
                name,grade,ban);
    };
    void increaseGrade(){
        grade++;
    };
};

class Person {
    Boolean alive;
    int age;
    int height;
    int weight;
    String name;
    int gender;
}