
package com.sau.wow;

public class Test04 {
    public static void main(String[] args) {
        KmOOP04 ob1 = new KmOOP04();
        
        KmOOP04 ob2 = new KmOOP04();
            
        KmOOP04 ob3 = new KmOOP04();
        
        
        // 
        ob1.b=222;
        ob3.b=555;
        
        System.out.println(ob1.b);
        System.out.println(ob2.b);
        System.out.println(ob3.b);
        //
        
        
        //
         ob1.a=999;
        System.out.println(ob1.a);
        System.out.println(ob2.a);
        System.out.println(ob3.a);
        //
        
        
        //ใช้data ที่เป็น static ผ่านชื่อ  class 
        KmOOP04.b=55555;
        KmOOP04.showB();
        //ใช้ method  ที่เป็น  static  ผ่านชื่อ class
        
        System.out.println(ob1.b);
        System.out.println(ob2.b);
        System.out.println(ob3.b);
        //
        
        
    }
    
}
