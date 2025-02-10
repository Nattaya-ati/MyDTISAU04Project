
package com.sau.wow;


public class KmOOP04 {
    //Data
    public int a = 10;
    public static int b = 20;
    //  เฉพาะ Dataนะ  data   ใด เป็น static   ทุกobject  ใช้ค่าร่วมกัน  (ในต่างclass)
    public final int c = 30;
    //  data  ใดก็ตาม มี   final นำหน้า เปลี่ยนค่าไม่ได้ 
    public static final int d = 40;
    // data ที่มี ทั้ง 2 คอนเซป ไว้ด้วยกัน  เปลี่ยนค่าไม่ได้ และ เป็น 40 ในทุกๆ static
    
    
    //Method
    public void showA(){
        System.out.println(a);
    }
    
     public static void showB(){
        System.out.println(b);
    }
     
                 //public  ที่มี หรือ ไม่มี static  สามารถใช้ได้ ไม่  _error
     public void met1(){
         a = 100;
         showA();
         b = 200;
         showB();  
     
     }
                  //public ใช้ได้เฉพาะ ที่มี static เท่านั้น ถ้าไม่ มี จะ  error
       public static void met2(){
                 // a = 111; error
          b=222;
                //showA();error
          showB() ;
     
     }
       
//Contructor   ยังไม่มี
       
}
