package static2.ex;

import static static2.ex.MathArrayUtils.*;

public class MathArrayUtilsMain {

    public static void main(String[] args) {

//       인스턴스 생성이 되지 않는 것을 알 수 있음>
//       생성하지 못한다면 static으로 써야한다는걸 알 수 있음
//        MathArrayUtils utils = new MathArrayUtils();
//        utils.sum(new int[]{1, 2, 3, 4, 5});

        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum= "+ sum(values));
        System.out.println("averages= " + average(values));
        System.out.println("min= " + min(values));
        System.out.println("max= " + max(values));
    }//main
}//class
