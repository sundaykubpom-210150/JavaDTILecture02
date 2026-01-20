package info.thailand;

public class MyClass02 {
    //ประเภทของ Method (เหมือนกับประเภทของฟังก์ชั่นเลย)
    //no parameter no return
    public void metA(){
        System.out.println("AAAA");
    }

    //have parameters no return
    public void metB(String fname, String lname, int age){
        System.out.println("ชื่อ " + fname + "  " + lname);
        System.out.println("อายุ " + age + "ปี");
    }

    //no parameter has return
    public String metC(){
        return "Wow wow wow";
    }

    //have parameters has return
    public int sum3Number(int n1, int n2, int n3){
        int sum = n1 + n2 + n3;
        return sum;
    }
}
