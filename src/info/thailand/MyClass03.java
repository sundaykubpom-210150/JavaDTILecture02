package info.thailand;

public class MyClass03 {
    //Overloading Method
    public static void showData(){ }

    public static void showData(int x){ }

    public static void showData(double y){ }

    public static void showData(int a, int b){ }

    public static void main() {
        showData();
        showData(10, 20);
        showData(500.4568);
    }
}
