package pack;

//import pack.a.User;

import pack.a.User;
//import pack.b.User; <- 같은 이름의 클래스가 있어

public class PackageMain3 {

    public static void main(String[] args) {
        Data data = new Data();
        //패키지 명 경로 적지 않고 import문을 사용하여 클래스를 불러옴

//        같은 이름의 클래스가 있다면 import는 둘 중 하나만 선택할 수 있다.
//        자주사용하는 클래스 import하고 나머지를 패키지 포함한 전체 경로 적어주기기
       User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}//class
