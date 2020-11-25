public class ExceptionTest {
    public static void main(String[] atgs) {
        int[] nums = {1, 2, 3, 4, 5};

        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(nums[i]);
                // 범위를 넘어서는 예외 처리.
                // 예외처리를 만난 후 for 구문 안은 잠시 멈추지만, 프로그램은 지속적으로 진행된다.
            }

        }catch (Exception e){
            System.out.println("범위를 넘어서는 예외가 발생했습니다.");
            System.out.println(e.getMessage()); // 메세지 가져오기
          //e.printStackTrace(); //catch 문을 추가로 더 쓸 수도 있음.
        }finally {
            System.out.println("꼭 처리해야줘야 할 일");
        }


        System.out.println("예외가 발생해도 프로그램은 실행 중입니다.");
        // try catch문을 쓰면 예외 처리 후 정상 작동 진행한다.

    }

}



