public class TestThis { // 메인 클래스
    
    public static void main(String[] args){ // 메인 메소드
        Student2 s1 = new Student2("ny",2,2); // 생성자 함수를 만듬
        s1.displayInfo();

    }
}



class Student2{ // 클래스
    // 내가 선언한 멤버 변수들 (Field)
    String name;
    int grade;
    int ban;

    void displayInfo(){
        System.out.printf("이름은 %s %d학년 %d반 입니다. (이 메세지는 내장 메소드를 통해 작성되었습니다.) %n",
                name,grade,ban);
    };
    void increaseGrade(){
        grade++;
    };


    public Student2(String name, int grade, int ban) {
        // 생성자는 일반 메소드가 아니라 특수한 메소드, 클래스가 객체로 인스턴스화 될 때 초기화를 담당하기 위한 코드 블록이다.
        this.name = name; // this.name은 현재 class Student2의 name을 가리킴 (현재 자기 자신의 class의 맴버변수인 name). name은 위의 파라메터를 가리킴.
        this.grade = grade;
        this.ban = ban;
    } // generate 에서도 생성 가능.



}
