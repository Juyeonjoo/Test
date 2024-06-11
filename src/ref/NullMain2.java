package ref;

public class NullMain2 {

    public static void main(String[] args) {

//       null 값:참조할 주소가 존재하지 않는다
//        참조할 객체 인스턴스가 존재 하지 않음
        Data data = null;
        data.value = 10;
        System.out.println("data.value = " + data.value);
    }
}
