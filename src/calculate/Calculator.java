package calculate;

public class Calculator
{
    public void addition(int a, int b) {
        System.out.println("The addition of  " + a + " and " + b + " is: " + (a + b));
    }

    public void subtraction(int a, int b) {
        System.out.println("The subtraction  of  " + a + " and " + b + " is: " + (a - b));
    }

    public void multiplication(int a, int b) {
        System.out.println("The multiplication of  " + a + " and " + b + " is: " + (a * b));

    }

    public void division(int a, int b) {
        System.out.println("The division of  " + a + " and " + b + " is: " + (a / b));
    }

    public void calculateResult(int a, int b, char opt)
    {
        if(opt == '+' )
        {
            addition(a,b);
        }

        if(opt == '-' )
        {
            subtraction(a,b);
        }

        if(opt == '*' )
        {
            multiplication(a,b);
        }

        if(opt == '/' )
        {
            division(a,b);
        }
        else
        {
            System.out.println("Please enter the  valid input");
        }
    }

}
