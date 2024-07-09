package static1;

public class Data3 {
    public String name;

//    static이 붙은 멤버 변수는 메서드 영역에서 관리함
//    static 붙은 멤버 변수 count는 인스턴스 영역에 생성되지 않고 메서드 영역에서 관리됨
//    메서드 영역에서 하나만 존재하므로 여러 인스턴스에서 공용으로 사용할 수 있음
   public static int count; // static

    public Data3(String name) {
        this.name = name;
        count++;
    }

}
