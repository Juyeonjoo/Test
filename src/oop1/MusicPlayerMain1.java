package oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {

        int volumne =0;
        boolean isOn = false;

//        음악 플레이어 켜기0
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        volumne++;
        System.out.println("음악 플레이어 볼륨: "+ volumne);
        volumne++;
        System.out.println("음악 플레이어 볼륨: "+ volumne);
        volumne--;
        System.out.println("음악 플레이어 볼륨 : "+ volumne);

        //음악 플레이어 상태
        System.out.println("상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어  ON, 볼륨: "+ volumne);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        //음악 플레이어 끄기
        isOn = false;
        System.out.println("종료합니다.");


    }
}//class
