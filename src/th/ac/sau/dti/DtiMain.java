package th.ac.sau.dti;

public class DtiMain {
    public static void main() {
        //สร้าง Object-instance of Class มี 2 วิธี
        //วิธีที่ 1 มี 2 ขั้นตอน
        Square ob1; //ประกาศชื่อ Object/Instance
        ob1 = new Square(); //เอาชื่อประกาศมาสร้างเป็น Object/Instance ด้วย new

        //วิธีที่ 2 มี 1 ขั้นตอน
        Square ob2 = new Square();

        ob1.widths = 10;
        ob1.longs = 20;
        ob1.calSquareArea();
        ob1.showSquareArea();

        ob1.widths = 100;
        ob1.longs = 200;
        ob1.calSquareArea();
        ob1.showSquareArea();

        ob2.widths = 11;
        ob2.longs = 22;
        ob2.calSquareArea();
        ob2.showSquareArea();

    }
}
