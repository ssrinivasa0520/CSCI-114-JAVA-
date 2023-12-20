import java.util.*;
class Main2
{
   public static void main(String args[])
   {
       Scanner s=new Scanner(System.in);
       Invoice invoice=new Invoice();           // Invoice is a class that stores items, calculates discount and prints items
       while(true)                               // continuous prompt to enter items if they exist
       {
           System.out.print("More Items???\n1--->Yes\t-1--->No\nEnter your choice:");
           int choice=s.nextInt();
           if(choice==-1)
           {
               break;
           }
           else
           {
               System.out.print("Enter price:");
               double price=s.nextDouble();
               System.out.print("Enter quantity:");
               int quantity=s.nextInt();
               System.out.print("Enter Y if the item is PET else N:");
               boolean isPet=false;
               String ch=s.next();
               if(ch.equals("Y"))
                   isPet=true;
               else
                   isPet=false;
               Item newItem=new Item(price,isPet,quantity);       // take price, quantity and isPet values and create item
               invoice.add(newItem);                               // add item into Invoice
           }
       }
       invoice.printItems();
       double totalCost=invoice.totalCost();                       // calculate total cost of all items
       double discount=invoice.getDiscount();                       // calculate discount of all items
       System.out.println("Total Cost: "+totalCost);
       System.out.println("Discount: "+discount);
       System.out.println("Final Cost: "+(totalCost-discount));   // prints the finalCost
   }
}