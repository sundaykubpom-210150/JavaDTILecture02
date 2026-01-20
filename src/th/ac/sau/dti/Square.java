package th.ac.sau.dti;

public class Square {
    //data member
    public double widths;
    public double longs;
    public double area;

    //method member
    public void calSquareArea(){
        area = widths * longs;
    }

    public void showSquareArea(){
        System.out.println("สี่เหลี่ยมขนาด " + widths + " x " + longs);
        System.out.println("มีพื้นที่ " + area);
    }

    //Constructor
    //Empty Constructor
    public Square() { }
}
