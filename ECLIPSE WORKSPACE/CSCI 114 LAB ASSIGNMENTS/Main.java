public class Main
{
   public static void main(String[] args) {
      
        // creating Square class object and set it to 7
       Square sq1 = new Square(7);
      
       // creating Square class object
       Square sq2 = new Square();
      
       // setting length to 10
       sq2.setLength(10);
      
       // printing output in desired format
       System.out.println("1st square: area: "+sq1.getSquareArea()+", perimeter: "+sq1.getSquarePerimeter());
       System.out.println("2nd square: area: "+sq2.getSquareArea()+", perimeter: "+sq2.getSquarePerimeter());
   }
}