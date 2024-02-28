package ref;

public class VarChange2 {

    public static void main(String[] args) {

        Data dataA = new Data();
        dataA.value = 10;

        // 참조값 복사, 변수 dataA가 가르키는 인스턴스를 복사하는 것이 아니라 변수에 들어있는 참조값만 복사해서 전달함
        // 동일한 인스턴스 바라봄
        Data dataB = dataA;

        System.out.println("dataA의 참조값 = "+ dataA);
        System.out.println("dataB의 참조값 = "+ dataB);

        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataA.value = " + dataB.value);

        //dataA변경
        dataA.value = 20;
        System.out.println("dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataA.value = " + dataB.value);

        //dataB변경
        dataA.value = 30;
        System.out.println("dataB.value = 30");
        System.out.println("dataB.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

    }
}
