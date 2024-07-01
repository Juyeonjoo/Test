package pack;

public class PackageMain1 {

    public static void main(String[] args) {
        //같은 패키지에 있는 경우 경로 생략
        Data data = new Data();
        //다른 패키지에 있을 때 패키지명+클래스명(풀 경로)
        pack.a.User user = new pack.a.User();
    }
}//class
