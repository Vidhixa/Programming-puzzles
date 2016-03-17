package commonQuestions;

import java.util.*;
class Parentheses{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      String input = "";
      boolean isBal = false;
       
      while (sc.hasNext()) {
        input = sc.next();
        isBal = checkBalance(input);
        System.out.println(isBal);
      }
       
   }
    
  public static boolean checkBalance(String s) {
      Stack<Character> stk = new Stack<Character>();
      for(char c : s.toCharArray()){
          if(c == '{' || c == '[' || c == '(') {
              stk.push(c);
          } else {
              if(c == '}' && !stk.isEmpty() && stk.peek() == '{') {
                  stk.pop();
              } else if(c == ']' && !stk.isEmpty() && stk.peek() == '[') {
                  stk.pop();
              } else if(c == ')' && !stk.isEmpty() && stk.peek() == '(') {
                  stk.pop();
              } else {
                  return false;
              }
          }
          
      }
      
      if(!stk.isEmpty()) {
        return false;  
      }
      
      return true;
      
  }
}