package ProblemStatement1;
import java.util.*;

 

public class ProblemStatement1_1Even{

 

   public static void main(String []args)

   {

         

       Scanner sc = new Scanner(System.in);

         

       System.out.print("Enter value n : ");

      int  n = sc.nextInt();

         

       for(int i=0; i<=n; i++)

       {

           if(i%2==0)

               System.out.print(i+" ");

       }    

       System.out.println();

         

   }

}