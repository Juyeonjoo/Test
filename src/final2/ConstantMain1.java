package final2;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + 1000);

        int currentUserCoutn = 999;
        process(currentUserCoutn++);
        process(currentUserCoutn++);
        process(currentUserCoutn++);
    }

    public static void process(int currentUserCount) {
        System.out.println("현재 참여자 수 : " + currentUserCount);

        if (currentUserCount > 1000) {
            System.out.println("대기자로 등록");
        } else {
            System.out.println("게임에 참여합니다.");
        }

    }


}
