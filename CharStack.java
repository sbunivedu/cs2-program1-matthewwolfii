public class CharStack
{
  private final int MAX_CAP = 100;
  private int top; //location of top item on the stack
  private char [] s; //The stack

  public CharStack(){
    //PRE:
    //POS:
    //TAS: Create an empty stack with a default capacity
    s = new char[MAX_CAP];
    top = -1;
  }

  public void push(char element){
    //PRE:
    //POS:
    //TAS: Add a new item to the stack
    top ++;
    s[top] = element;
  }

  public char pop (){
    //PRE:
    //POS:
    //TAS: remove and return the item on the top of the stack


    return s[top--];
  }

  public boolean isEmpty(){
    //PRE:
    //POS:
    //TAS: Return whether or not the stack is empty. HINT: look
    //     at the constructor.

    return (top == -1);

  }

  public char peek (){
    //TAS: Examines the element at the top of the stack
    char peek = s[top];
    return peek;
  }

  public boolean isFull(){
    //PRE:
    //POS:
    //TAS: return whether or not the stack is full
    return top == MAX_CAP-1;
  }

  public String toString() {
    //TAS: creates and returns all the characters on the stack left to right, starting at the top
    String str = "";
    String string = "";
    for (int x = 0; x <= top; x++){
      str += s[x];
    }
  for (int y = str.length() - 1; y >= 0; y--) {
    string += str.charAt(y) + " ";
  }


    return string;
  }


}

