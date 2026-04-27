public  class square {
 class square extends measurment {
        int area;    
        square() {
       }    
         void calArea() {
         this.area = this.side * this.side;
        }
       void displayArea() {
         System.out.println("The area of a square is :" + this.area);
         }
           }
   
}
