package VoiceAssistant;
import java.util.Scanner;
public class calculations
{
    Scanner sc=new Scanner(System.in);
    speech speak=new speech();
    public void answer()
    {
            int n1,n2,result;
            char ch;
            speak.say("Enter the operand 1");
            System.out.print("Enter the operand 1: ");
            n1=sc.nextInt();
            System.out.println();
            speak.say("Enter the operand 2");
            System.out.print("Enter the operand 2: ");
            n2=sc.nextInt();
            System.out.println();
            speak.say("Enter the arithmetic or bitwise operator for operation between two operands");
            System.out.print("Enter the arithmetic or bitwise operator for operation between two operands: ");
            ch=sc.next().charAt(0);
            System.out.println();
            switch(ch)
            {
                case '+':
                    result=n1+n2;
                    speak.say("Sum of operand 1 & 2 is");
                    speak.say(String.valueOf(result));
                    System.out.println("Sum of operand 1 & 2 is : "+result);
                    break;
                case '-':
                    result=n1-n2;
                    speak.say("Subtraction of operand 1 & 2 is");
                    speak.say(String.valueOf(result));
                    System.out.println("Subtraction of operand 1 & 2 is : "+result);
                    break;
                case '*':
                    result=n1*n2;
                    speak.say("Multiplication of operand 1 & 2 is");
                    speak.say(String.valueOf(result));
                    System.out.println("Multiplication of operand 1 & 2 is : "+result);
                    break;
                case '/':
                    result=n1/n2;
                    speak.say("Division of operand 1 & 2 is");
                    speak.say(String.valueOf(result));
                    System.out.println("Division of operand 1 & 2 is : "+result);
                    break;
                case '%':
                    result=n1%n2;
                    speak.say("Modulo of operand 1 & 2 is");
                    speak.say(String.valueOf(result));
                    System.out.println("Modulo of operand 1 & 2 is : "+result);
                    break;
                case '&':
                    result=n1&n2;
                    speak.say("Bitwise AND of operand 1 & 2 is");
                    speak.say(String.valueOf(result));
                    System.out.println("Bitwise AND of operand 1 & 2 is : "+result);
                    break;
                case '|':
                    result=n1|n2;
                    speak.say("Bitwise OR of operand 1 & 2 is");
                    speak.say(String.valueOf(result));
                    System.out.println("Bitwise OR of operand 1 & 2 is : "+result);
                    break;
                case '^':
                    result=n1^n2;
                    speak.say("Bitwise XOR of operand 1 & 2 is");
                    speak.say(String.valueOf(result));
                    System.out.println("Bitwise XOR of operand 1 & 2 is : "+result);
                    break;
                default:
                    speak.say("Enter valid operator.");
                    System.out.println("Enter valid operator.");
            }

    }

}
