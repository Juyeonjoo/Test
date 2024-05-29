package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;

        System.out.println("호출 전 dataA = " + dataA.value);

        changeReference(dataA);
        System.out.println("호출 후 dataA = " + dataA.value);
    }

    static void changeReference(Data data) {
        data.value = 20;
    }
}
