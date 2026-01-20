package th.ac.sau.dti;

public class SauTest01 {
    public int x;

    public void showX() {
        System.out.println(x);
    }

    //Overloading Constructor
    public SauTest01(){
        System.out.println("Wow wow wow");
    }

    public SauTest01(int x){
        this.x = x * 10;
        System.out.println("Hello...");
        System.out.println(x);
        System.out.println(this.x);
    }
}
