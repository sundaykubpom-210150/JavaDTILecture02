//Access Modifier of class -> default, public
//Access Modifier of member -> default, public, private, protected

package info.thailand;

public class MyClass01 {
    //องค์ประกอบของคลาส Member of Class มีแค่ 2 อย่าง ----------------------------------
    //data member (data, field, attribute, property) = คือ ตัวแปรประเภทหนึ่ง
    int dataA = 20;
    public int dataB;
    private int dataC = 0;
    protected int dataD = 0;

    //method member คือ ฟังก์แบบหนึ่ง -----------------------------------
    void met1(){
        int score = 0; //ตัวแปร
    }

    public void met2(){ }

    private void met3(){ }

    protected void met4(){ }

}
