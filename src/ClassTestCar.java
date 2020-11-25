public class ClassTestCar { //메인 클래스
    public static void main(String[] args){ //메인 메소드
        Vehicle v1 = new Vehicle(4, 4, 8); // Vehicle을 기반으로 한 객체 생성
        Car c1 = new Car(4,4,10,8);

        System.out.println(c1.seats);
    }
}
