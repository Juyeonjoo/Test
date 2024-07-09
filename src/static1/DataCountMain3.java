package static1;

public class DataCountMain3 {

    public static void main(String[] args) {

        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

//       인스턴스를 통한 접근도 가능하나 인스턴스 영역에 있는 것을 쓰는것은 아님
        Data3 data4 = new Data3("D");//권장하지 않음
        System.out.println("D count = " + data4.count);

        System.out.println(Data3.count);
    }//main
}//class
