public class Car extends Vehicle{  //Vehicle을 확장하겠다, 상속받겠다
    int engine; // Car의 멤버변수

    public Car(int wheels, int seats, int speed, int engine) { // 생성자 
        super(wheels, seats, speed); // Vehicle의 생성자를 가져움
        this.engine = engine; // Car의 생성자
    }

    public void speedUp(){ //Car에 없지만 Vehicle에 있어서 가능
        speed+=10;
        System.out.println("Speed =" + speed);
    }

    public void speedDn(){
        speed-=10;
        System.out.println("Speed =" + speed);
    }


}
