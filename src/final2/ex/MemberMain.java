package final2.ex;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("myId", "myName");
        member.print();
        member.changeData("seo");
        member.print();

    }
}//class
