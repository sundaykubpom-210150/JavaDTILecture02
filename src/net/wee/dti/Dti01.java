// Access modifier ของ member
// default เรียกใช้ได้เฉพาะคลาสที่อยู่ใน package เดียวเท่านั้น
// public เรียกใช้ที่ไหนก็ได้
// private เรียกใช้ได้เฉพาะใน Class ของตัวเองเท่านั้น
// protected เรียกใช้ได้เฉพาะคลาสที่อยู่ใน package เดียวกันเท่านั้น หากเป็นคลาสที่อยู่ต่าง package
        // จะต้องเป็นคลาสที่สืบทอดกัน (inheritance)
package net.wee.dti;

public class Dti01 {
    int dataA = 10;
    private int dataB = 20;

    public void metDti01(){

    }
}
