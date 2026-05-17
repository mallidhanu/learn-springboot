import java.util.Arrays;
import java.util.List;

interface  A{
    void show();

}

public class Demo{
    public static void main(String[] args) {

        // lambda used
        A object = () -> System.out.println("showed with lamba");
        object.show();
    }

    //streams
    List<Integer> numbers = Arrays.asList(1,3,5,8);

}
        //without lambda used

//        A object = new A(){
//            public void show(){
//                System.out.println("showed");
//            }
//        };
//        object.show();


        //        A object = new A() {
//            public void show() {
//                System.out.println("show method");
//            }
//
//            public void view() {
//                System.out.println("view method");
//            }
//        };
//        object.show();
//        object.view();

