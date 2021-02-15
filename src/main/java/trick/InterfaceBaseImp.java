package trick;


interface BaseI {
    void method();
}

class BaseC {
    public void method(){
        System.out.println("Inside BaseC::method()");
    }
}
public class InterfaceBaseImp extends BaseC implements BaseI {

    public static void main(String[] args ){
        (new InterfaceBaseImp()).method();
    }
}
