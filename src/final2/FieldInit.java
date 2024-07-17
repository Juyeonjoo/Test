package final2;

public class FieldInit {

//   static, 클래스 영역에 있으므로 바로 사용할 수 있음. 인스턴스 생성 X
    static final int CONST_VALUE = 10;
    final int value =10;

//    final 필드를 필드에서 초기화하였으면 이미 초기화되었기 때문에 생성자를 통해서도 초기화할 수 없음.
    public FieldInit() {
//        this.value = value
    }
}//class
