
package com.sau.wow;


public class KmOOP02 {
    //data member 
    public int a = 10;
    public int b;
    public int c;
    
    //method member
public void showA(){
    System.out.println(a);
  }
public void showB(){
    System.out.println(b);   
 }
public void showAB(){
    System.out.println(a+b);
 }
//constructor
//public KmOOP01(){} Empty Constructor

public KmOOP02(int b,int c){
    this.b = b;
    this.c = c;
    System.out.println("Hello..."+a);
    
    
}
}
