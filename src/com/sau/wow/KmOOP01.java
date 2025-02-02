
package com.sau.wow;


public class KmOOP01 {
    //data member  ( field,attribute,property)   คุณสมบัติหรือคุณลักษณะ
   public int a;
   public double b = 10;
    public String c;
    
    //method member พฤติกรรม หรือ การทำงานใดๆ
    public void showHello(){
        System.out.println("Hello...");
    }
    
    public void calSUMAndBandC() {
        System.out.println(a+b+c);
        
    }
    
    //public KmOOP01(){} Empty Constructor
    
    //Constructor
    public KmOOP01(int a,String c) {
        this.a = a;
        this.c=c;
        
    }
    
}
