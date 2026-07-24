import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);//สแกนรับค่าจากคีร์บอด
        System.out.println("ใส่ค่า r");//รับค่า r
        double r=kb.nextDouble();//ประกาศตัวแปลเพื่อรับค่าจากคีร์บอด
        double area=3.145*(r*r);//คำนวณค่า area
        System.out.println("area ="+area);//แสดงผล area
    }
}
