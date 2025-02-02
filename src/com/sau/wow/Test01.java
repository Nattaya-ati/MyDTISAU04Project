
package com.sau.wow;


public class Test01 {
    public static void main(String[] args) {
        // มี 2 แบบ
        //แบบที่ 1 มี 2 ขั้น
        KmOOP01 obA; //ประกาศชื่อ Object / instace
        obA = new KmOOP01(10,"ieie"); // เอาชื่อที่ประกาศมาสร้างโดยใช้คีย์เวิร์ด new
        
        //แบบที่ 2 มี 1 ขั้น
        KmOOP01 obB = new KmOOP01 (20,"-_-");
        
        KmOOP01 obC = new KmOOP01 (10,"^_^");
        
        KmOOP01 obD = new KmOOP01 (20,"-_-");
        
        obB.a = 1000;
        System.out.println(obB.c);
        
         obC.c = "wow wow wow";
        System.out.println(obC.c);
        
         obD.showHello();

    }
    
}
