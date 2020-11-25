public class Vehicle { // 메인 클래스

    int wheels; // 메인 클래스 내 맴버 변수
    int seats;
    int speed;

    public Vehicle(int wheels, int seats, int speed) { // 메인 클래스의 생성자 (생성자는 특별한 메소드)
        this.wheels = wheels;
        this.seats = seats;
        this.speed = speed;
    }

    public void drive(){ // 메인 클래스 내 일반 메소드
        System.out.println("drive");

    }
}
