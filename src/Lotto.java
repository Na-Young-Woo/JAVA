import java.util.HashSet;

public class Lotto {
    public static void main(String[] args){
        HashSet<Integer> lotto = new HashSet<>(); //로또 번호를 담을 HashSet

        while (lotto.size() < 6){
            double num1 = Math.random()*45;
            double num2 = Math.floor(num1);
            int num3 = (int)num2 +1;

//            int num4 = (int)Math.floor(Marh.random() * 45) +1 ;
            lotto.add(num3);
        }
        for (int num:lotto){
            System.out.println(num);
        }

//        double num = Math.random() * 10; // 0~1 미만의 실수, 0.234, 0.0001. 0.99999999... -> 1~45의 정수 만들기
//        double num1 = Math.floor(num); // 2.0, 3.0, 4.0, 5.0 ...
//        int num2 = (int)num1; // 형변환 -> 2, 3, 4, 5 ...
//
//        double num3 = Math.random() * 45; //0.0000~ 44.999999999999...
//        double num4 = Math.floor(num3); //0.0~44.0까지
//        int num5 = (int)num4+1; //

    }
}
