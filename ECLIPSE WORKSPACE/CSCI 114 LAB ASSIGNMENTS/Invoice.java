import java.util.ArrayList;
class Invoice
{
   ArrayList<Item> items=new ArrayList<Item>();
   public void add(Item anItem)
   {
       items.add(anItem);
   }
   public double getDiscount()
   {
       double discount=0.0;
       boolean petExists=false;
       int otherItems=0;
       for(int i=0;i<items.size();i++)           // traverse the list and find whether it consists of at least one Pet Item and otherItems>=5
       {
           Item item=items.get(i);
           if(item.isPet)                       // if item is pet then assign petExists as true
               petExists=true;
           else
               otherItems++;                   // else increment otherItems
       }
       if(petExists && otherItems>=5)           // if condition for discount passes then it calculates discount
       {
           for(int i=0;i<items.size();i++)
           {
               Item item=items.get(i);
               if(!item.isPet)
               {
                   double tempCost=item.quantity*item.price;
                   discount+=0.2*tempCost;
               }
           }
       }
       return discount;
   }
   public double totalCost()           // method that returns totalCost of items
   {
       double totalCost=0.0;
       for(int i=0;i<items.size();i++)
       {
           Item item=items.get(i);
           totalCost+=item.price*item.quantity;
       }
       return totalCost;
   }
   public void printItems()           // method that prints items
   {
       for(int i=0;i<items.size();i++)
       {
           Item item=items.get(i);
           System.out.println(item.price+" "+item.isPet+" "+item.quantity);
       }
   }
}