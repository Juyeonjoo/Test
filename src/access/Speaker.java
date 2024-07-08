package access;

public class Speaker {

    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("최대 음량");
        } else {
            volume +=10;
            System.out.println("음량 10을 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumDown 호출");
    }

    void showVolume() {
        System.out.println("현재 볼륨은 " + volume + "입니다.");
    }
}//class
