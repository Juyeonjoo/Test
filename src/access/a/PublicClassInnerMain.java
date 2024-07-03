package access.a;

public class PublicClassInnerMain {

    public static void main(String[] args) {

//        publicClass 는 public 이기 때문에 호출 가능
//        defaultClass1,2는 같은 패키지 이기 때문에 접근 가능
            PublicClass publicClass = new PublicClass();
            DefaultClass1 defaultClass1 = new DefaultClass1();
            DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}//class

