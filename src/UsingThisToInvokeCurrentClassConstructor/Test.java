package UsingThisToInvokeCurrentClassConstructor;

public class Test {
    Test(){
        this(10,15);
        System.out.println("default constructor is called");
    }

    Test(int a,int b){
        System.out.println("parameterized constructor is called");
    }

    public static void main(String[] args) {
        Test test =new Test();
    }
}
