public class rectangle extends measurment {
    int area = 0;
 
    rectangle() {
    }
 
    void calArea() {
       this.area = this.len*this.br;
    }
 
    void displayArea() {
       System.out.println("Area of rectangle is :" + this.area);
    }
 }