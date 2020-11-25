public class ExceptionTest {
    public static void main(String[] atgs) {
        int[] nums = {1, 2, 3, 4, 5};

        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(nums[i]);
                //            범위를 넘어서는 예외처리
            }
        }catch (Exception e){
            System.out.println("범위를 넘어서는 예외가 발생했습니다.");
            System.out.println(e.getMessage()); // 메세지 가져오기
            e.printStackTrace();
        }

        System.out.println("예외가 발생해도 프로그램은 실행 중입니다.");
        // try catch문을 쓰면 예외 처리 후 정상 작동 진행한다.

    }

}



