public class SquareRoot{
public static void main(String[] args)
    {
        double number = 15;
        sqrt(number);
  
    }
  
    
    public static void sqrt(double number)
    {
  
        
        double num;
  
        //if the number given is a 0
        if(number==0)
        {
            System.out.println("Square root of "+number+" = "+0);
        }
          
        //Proceeding to find out square root of the number
        double squareRoot = number/2; 
        System.out.println("Squareroot variable value is : "+squareRoot);
        do
        {
            num=squareRoot;
            squareRoot = (num + (number/num))/2;
            System.out.println("Squareroot variable value is ...."+squareRoot);
            System.out.println("difference is ...."+(num-squareRoot));
        }
        while((num-squareRoot)!=0);
  
            System.out.println("Square roots of "+number+" are :");
            System.out.println("+"+squareRoot+" i");
            
        
  
    }
}
