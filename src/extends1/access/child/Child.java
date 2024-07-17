package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {

        publicValue = 1;
        protectedValue = 2;
//        defaultValue = 3; //  다른 패키지 접근 불가 'defaultValue' is not public in 'extends1.access.parent.Parent'. Cannot be accessed from outside package
//        privateValue = 1; // 접근 불가, 컴파일 오류 privateValue' has private access in 'extends1.access.parent.Parent'
        publicMethod();
        protectedMethod();
//        defaultMethod(); // Cannot be accessed from outside package
//        privateMethod();

        printParent();
    }//calss
}
