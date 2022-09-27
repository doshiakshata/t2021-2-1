import java.util.Scanner;
class Demo{

    public static void main(string []args){
        char operator;
        Double number1;number2;result;
        Scanner s=new Scanner(System.in);
        System.out.println("choose an operator :+,-,*,or /");
        operator=input.next().charAt(0);
        System.out.println("enter first number");
        number1=input.Double();
        System.out.print("enter second number");
        System.out.println(x);
        number2=input.Double();
        switch (operator) {
            case '+':
                result = number1+number2;
                System.out.println(number1+"+"+number2+"="+result);
                break;
                case '-':
                result = number1+number2;
                System.out.println(number1+"-"+number2+"="+result);
                break;
                case '*':
                result = number1+number2;
                System.out.println(number1+"*"+number2+"="+result);
                break;
                case '/':
                result = number1+number2;
                System.out.println(number1+"/"+number2+"="+result);
                break;
        
            default:
            System.out.println("invalid operator")
                break;
        }
        input.close();
    }
}