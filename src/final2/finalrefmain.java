package final2;

public class finalrefmain {

    public static void main(String[] args) {
        final Data data = new Data();
//        final이라 이미 할당해서 담을 수 없음, 참조 대상 변경 불가
//        data = new Data(); // 컴파일 에러

//        참조 대상의 값은 변경 가능
        data.value =10;
        System.out.println(data.value);
        data.value=20;
        System.out.println(data.value);
//참조 값만 변경하지 못함. 참조 대상 자체는 변경 못하지, 참조하는 대상의 값은 변경 가능.
    }
}
