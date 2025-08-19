import java.util.Scanner; 

public class calc{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        
        System.out.println("Enter operator(+,-,*,/,%): ");
        char operator = sc.next().charAt(0);
        
        double result;
        
        switch(operator){
            case '+':
                result = num1 + num2;
                System.out.println("Sum is " + result);
                break;
            
            case '-':
                result = num1 - num2;
                System.out.println("Difference is " + result);
                break;
                
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication is " + result);
                break;
                
            case '/':
                if (num2!=0){
                    result = num1 / num2;
                    System.out.println("Division is " + result);
                }
                else{
                    System.out.println("Divison not valid!");
                }
                break;
                
            case '%':
                if (num2!=0){
                    result = num1 % num2;
                System.out.println("Reminder is " + result);
                }
                else{
                    System.out.println("Invalid");
                }
                break;
        }
    }
}