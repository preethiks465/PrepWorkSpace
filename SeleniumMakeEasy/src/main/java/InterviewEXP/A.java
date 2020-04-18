package InterviewEXP;

/*
 * public class A extends B{ public void me1() { super.me1();
 * System.out.println("cat meow"); } public static void main(String[]args) {
 * 
 * B bobj = new A(); bobj.me1();
 * 
 * } }
 */

class A {
    public void talk(){
        this.sayIt();
    }

    protected void sayIt(){
        System.out.println("class A says...");
    }
}
