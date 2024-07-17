package final2;

public class ConstructInit {

    final int value;

    //final필드를 사용할 경우 해당 필드는 생성자를 통해서 한번만 초기화 가능
    public ConstructInit(int value) {
        this.value = value;
    }
}//class
