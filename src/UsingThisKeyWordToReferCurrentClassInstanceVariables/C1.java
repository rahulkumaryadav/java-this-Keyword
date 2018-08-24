package UsingThisKeyWordToReferCurrentClassInstanceVariables;

public class C1 {
    int a1;
    int a2;

    C1(int a1, int a2 ){
        this.a1=a1;
        this.a2=a2;
    }

    public void display(){
        System.out.println("value of a1 = "+a1+"value of a2 = "+a2);
    }



    public static void main(String[] args) {
        C1 c1=new C1(10,20);
        c1.display();
    }
}
