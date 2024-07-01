package construct;

public class MemberInit {

    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        /*
        * 멤버 변수보다 매개 변수가 코드 블럭의 더 안쪽에 있기 때문에
        * 매개 변수가 우선순위를 가진다.
        * */
        this.name = name; // 자기 자신의 인스턴스를 가르킴
        this.age = age;
        this.grade = grade;
    }
}//class
