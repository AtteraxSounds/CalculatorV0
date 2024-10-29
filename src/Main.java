import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
double firstNum;
double secondNum;
String operation;
String operationsList[] = {"sum","subtraction","multiplication","division"};
    System.out.println("Welcome to Java Calculator V0! ");
    System.out.println("---------------------------------------------------------------------------------------");
    System.out.println("In this version of this application you can do the basic 4 algebraic operations!");
    System.out.println("---------------------------------------------------------------------------------------");
    System.out.println("Please enter the name of your operation");
    System.out.println("[ Write one of the following: sum / subtraction / multiplication / division ]");
        Scanner s = new Scanner(System.in);
        operation = s.nextLine();
        System.out.println("Enter first number: ");
        firstNum = s.nextDouble();
        System.out.println("Enter second number: ");
        secondNum = s.nextDouble();
        if (operationsList[0].equals(operation.toLowerCase()))
        {
            double sum=firstNum+secondNum;
            System.out.println("You entered: " + firstNum +" and " + secondNum);
            System.out.println("Your Result: " + firstNum +" + " + secondNum+" = "+sum);
        }else if (operationsList[1].equals(operation.toLowerCase())){
            double subtraction=firstNum-secondNum;
            System.out.println("You entered: " + firstNum +" and " + secondNum);
            System.out.println("Your Result: " + firstNum +" - " + secondNum+" = "+subtraction);
        } else if (operationsList[2].equals(operation.toLowerCase())){
            double multiplication=firstNum*secondNum;
            System.out.println("You entered: " + firstNum +" and " + secondNum);
            System.out.println("Your Result: " + firstNum +" x " + secondNum+" = "+multiplication);
        }else if (operationsList[3].equals(operation.toLowerCase())){
            if (secondNum==0){
                System.out.println("You have created a black hole! please stop the program!!");
            }else {
                double division=firstNum/secondNum;
                System.out.println("You entered: " + firstNum +" and " + secondNum);
                System.out.println("Your Result: " + firstNum +" / " + secondNum+" = "+division);
            }

        }else{
            System.out.println("Please enter a valid operation!");
        }
    }
}