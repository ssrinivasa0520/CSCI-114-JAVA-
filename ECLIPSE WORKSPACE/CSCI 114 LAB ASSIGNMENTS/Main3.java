class Main3 {
  public static void main(String[] args) {
    // create object
    UserInput u = new UserInput();
    //Initializing frequency array to store count of numbers 0-9
    int[] freq = new int[10];
    int num=u.getNextNumber();
    int count=0;//Only 20 numbers can be taken as input
    while(num!=-1 && count<20)
    {
        if(num>=0&&num<=9){
          freq[num]++;
          count++;
        }
        else{
          System.out.println("Enter valid input. Only numbers 0-9 allowed or (-1)"); //message to enter valid input
        }
       num=u.getNextNumber(); 
    }
    for(int i=0;i<=9;i++)
    {
        System.out.println(i+": "+freq[i]); //displaying the frequency of each number
    }
  }
}