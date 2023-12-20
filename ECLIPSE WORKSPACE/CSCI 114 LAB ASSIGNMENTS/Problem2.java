import java.util.*;

import java.io.*;

class Problem2

{

public static void main (String[] args) throws IOException

{

// your code goes here

int y,a,b,c,d,e,g,h,j,k,m,r,n,p,flag;

y=a=b=c=d=e=g=h=j=k=m=r=n=p=flag=0;

String month="";

Scanner sc= new Scanner(System.in);

System.out.print("Enter the Year: ");

y=sc.nextInt();

a = y % 19;

b = y / 100;

c = y % 100;

d = b / 4;

e = b % 4;

g = ((8 * b + 13) / 25);

h = ((19 * a + b - d - g + 15) % 30);

j = c / 4;

k = c % 4;

m = ((a + 11 * h) / 319);

r = ((2 * e + 2 * j - k - h + m + 32) % 7);

n = ((h - m + r + 90) / 25);

p = ((h - m + r + n + 19) % 32);

switch(n)

{

case 1: month="January";

break;

case 2: month="Feburary";

break;

case 3: month="March";

break;

case 4: month="April";

break;

case 5: month="May";

break;

case 6: month="June";

break;

case 7: month="July";

break;

case 8: month="August";

break;

case 9: month="September";

break;

case 10: month="October";

break;

case 11: month="November";

break;

case 12: month="December";

break;

default: flag = 1;

break;

}

if(flag == 0)

{

System.out.println("In "+y+" Easter Sunday fell on "+month+" "+p);

}

else

{

System.out.println("Invalid Inputs!!! Please restart");

}

}

}