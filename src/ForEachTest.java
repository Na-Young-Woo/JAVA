public class ForEachTest {
    public static void main(String[] args){
        String[] bts = {"진", "슈가", "제이홉", "RM", "지민", "뷔", "정국"};

        for(int i=0; i<bts.length; i++){
            String name = bts[i];
            System.out.println(name);
        }

        for(String name:bts){
            System.out.println(name);
        }

        int[] numbers = {2,3,4,5,6,7,8};
        for(int num:numbers){
            System.out.println(num);
        }


    }
}// end
