
package com.sau.wow;


public class Test02 {
    public static void main(String[] args) {
        //1
        
        KmOOP02 ob1;
        ob1 =new KmOOP02(10,20);
        
        //2
        KmOOP02 ob2 = new KmOOP02(10,50);
        
        //3
        KmOOP02 ob3 = new KmOOP02(10,20);
        
        
        //การใช้งานObject หรือ เรียกว่า Instance of class หรือ Instance   = ตัวแทนของClass 
        // คือ การใช้งาน Data หรือ Method   
        //การใช้งานData คือ การเอาค่ามันมาใช้ หรือ กำหนดค่าให้มันใหม่
        //การใช้งานMethod คือ สั่งให้Methodนั้นทำงาน
        
        //object . data
        //เอาData Aของ ob1  + A ของ ob2 
        // คือ การนำค่ามันมาใช้ หรือ การกำหนดค่าให้ใหม่
        System.out.println(ob1.a+ob2.a);
        ob1.a=100;
        System.out.println(ob1.a+ob2.a);
        
        //object . method 
        ob2.showB();   
        ob1.showA();
    
    
    }
    
}
