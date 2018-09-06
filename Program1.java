import java.util.Scanner;
public class Program1
{
 public static boolean isOperand(char c)
  {
    if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9'))
      {
        return true;
      }
      else
      {
        return false;
      }
  }//isOperand

  public static boolean isOperator(char c)
  {
    return c=='+' || c=='-' || c=='*' || c=='/';
  }//isOperator

  public static int precedenceOrder(char c)
  {
    if(c == '*' || c == '/' )
    {
      return 2;
    }
    else
    {
      return 1;
    }
  }//precedenceOrder



  public static void main (String [] args)
  {
    CharStack opstack = new CharStack();
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your infix expression: ");
    String infix = s.nextLine();
    String finish = "";

    for (int i = 0; i < infix.length(); i++)
    {
      if (isOperand(infix.charAt(i)))
      {
        finish += infix.charAt(i);
      }
      else if (infix.charAt(i) == '(')
      {
        opstack.push(infix.charAt(i));
      }
      else if (infix.charAt(i) == ')')
      {
        while (!opstack.isEmpty() && opstack.peek() != '(')
        {
        finish += opstack.pop();
        }
      opstack.pop();
      }
      else if (isOperator(infix.charAt(i)))
      {
      while (!opstack.isEmpty() && opstack.peek() != '(' && precedenceOrder(opstack.peek()) >= precedenceOrder(infix.charAt(i)))
      {
      finish += opstack.pop();
      }
      opstack.push(infix.charAt(i));
      }

    }//for
    while (!opstack.isEmpty())
    {
      if (opstack.peek() != '(')
      {
        finish += opstack.pop();
      }
      else
      {
        opstack.pop();
      }

    }
    System.out.println("Postfix conversion: " + finish);
  }//void main
}//class
