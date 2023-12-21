package operator.cond.ex;

import operator.cond.Switch3;

public class GradeSwitchEx {

    public static void main(String[] args) {

        String grade = "Z";

        switch(grade){

            case "A":
                System.out.println("좋은 성과");
                break;
            case "B":
                System.out.println("탁월한");
                break;
            case "C":
                System.out.println("준수");
            case "D":
                System.out.println("향상필요");
            case "F":
                System.out.println("불합격");
                break;
            default:
                System.out.println("잘못된 학점");
        }
    }
}//class
