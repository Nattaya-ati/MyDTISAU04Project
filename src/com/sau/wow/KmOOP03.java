
package com.sau.wow;

public class KmOOP03 {
    //Data member
    public int a = 10;
    public int b;
    public int c;
    
    
    //Overloading Method คือ ใน1classมี method ชื่อเดียวกันมากกว่า 1 ตัว
    public void showData(String x) {
        System.out.println(x);
    }
    
    
    public void showData(String x,String y) {
        System.out.println(x+y);
    }
    
    
    public void showData(int x) {
        System.out.println(x);
    }
    
    //Overloading Contructor มี 3 ตัว (ต้องมีอะไรในวงเล็บ) เรียกว่า  arguement   ไม่มี   มี2ตัว    มี3ตัว
    public KmOOP03(){
        System.out.println("Hello...");
    }
    
    
    public KmOOP03(int b, int c){
        this.b = b;
        this.c=c;
        System.out.println("Hi...");
    }
    
    
    public KmOOP03(int a,int b,int c){
        System.out.println("Hey...");
        this.a=a;
        this.b=b;
        this.c=c;
    
    }
               
}
