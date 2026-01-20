package info.thailand;

public class MyClass04 {
    //Member of class------
    //Data member
    //Method member

    //Constructor เขียนเหมือน Method แต่มีชื่อเดียวกับชื่อคลาส และไม่มี ReturnType -----
    //แต่ยังคงมี Access modifier อยู่
    //กรณีที่ 1 คลาสมี Constructor มากกว่า 1 ตัว เราเรียกว่า Overloading Constructor
    MyClass04( ){
        System.out.println("AAAA");
    }

    public MyClass04(int x){
        System.out.println("BBBB");
    }

    //Inner Class -----
    class Eiei{

    }
}
