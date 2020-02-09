import java.util.*;
public class Calculator extends AbstractCalculator {
    Calculator(){}
    Calculator(float num1,float num2)
    {
         super(num1,num2);
    }
    public float add()
    {
        return num1+num2;
    }
    public float subtract()
    {
        return num1-num2;
    }
    public float multiply()
    {
        return num1*num2;
    }
    public float divide()
    {
        return num1/num2;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        do {
            try {
                System.out.println("Enter + to add \nEnter - to subtract \nEnter * to multiply\nEnter / to divide");
                System.out.println("Enter your operation:");
                char operation = sc.next().charAt(0);
                System.out.println("Enter your first number:");
                float num1 = sc.nextFloat();
                System.out.println("Enter your second number:");
                float num2 = sc.nextFloat();
                Calculator cal = new Calculator(num1, num2);
                switch (operation) {
                    case '+':
                        System.out.println("Addition Result: "+cal.add());
                        break;
                    case '-':
                        System.out.println("Subtraction Result: "+cal.subtract());
                        break;
                    case '*':
                        System.out.println("Multiplication Result: "+cal.multiply());
                        break;
                    case '/':
                        System.out.println("Division Result: "+cal.divide());
                        break;
                    default:
                        throw new InvalidOperationException("must be between +,-,*,/ only");
                }
            }
            catch(InvalidOperationException e)
            {
                System.out.println(e);
            }
            System.out.println("Do you want to continue? Enter 'y' for Yes or Enter any other key for No:");
        }while(sc.next().charAt(0)=='y');
        System.out.println("Thank You! Have a Nice Day!");
    }
}
