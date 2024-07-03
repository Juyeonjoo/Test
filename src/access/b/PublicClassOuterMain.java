package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

//        access.a.DefaultClass1 is not public in access.a; cannot be accessed from outside package
//        DefaultClass1 defaultClass1 = new DefaultClass1();
    }
}
