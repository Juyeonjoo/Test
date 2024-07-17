package final2.ex;

import java.sql.SQLOutput;

public class Member {

    private final String id; //final
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String name) {
//        this.id = id;//final 필드는 한번 초기화되면 변경 불가
        this.name = name;
    }

    public void print() {
    System.out.println("id : " + id + ", name : " + name);
    }


}//class
