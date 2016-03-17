package commonQuestions;
import java.util.*;
import java.io.*;

class phoneDir{
 public static void main(String []argh)
 {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    in.nextLine();
     
    Map<String, Integer> phoneDir = new HashMap<String, Integer>();
    for(int i=0;i<n;i++)
    {
       String name=in.nextLine();
       int phone=in.nextInt();
       phoneDir.put(name, phone);
       in.nextLine();
    }
    while(in.hasNext())
    {
       String s=in.nextLine();
       if(phoneDir.containsKey(s)) {
           System.out.println(s+"="+phoneDir.get(s));
       } else {
           System.out.println("Not found");
       }
    }
 }
}
