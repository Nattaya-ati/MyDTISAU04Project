
package com.dti.aa;

//Access Modifier
// ของคลาส
// Public
//Default


// ของ Member data / method
//-public  ที่ไหนก็ได้
//-private เฉพาะภายในคลาสนั้นเท่านั้น
 //-protected ต่างคลาสได้แต่ต้องอยู่ในpackage  เดียวกัน 
          // กรณี ต่างคลาส คลาสนั้นต้องสืบทอดเป็นแม่ลูกกัน 
//-default ต่างคลาสได้แต่ต้องอยู่ใน package เดียวกัน


public class Test06 {
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;
    
    void testWow() {
        Test06 ob1=new Test06();
        ob1.a=100;
        ob1.b=200;
    
    }
    
}
