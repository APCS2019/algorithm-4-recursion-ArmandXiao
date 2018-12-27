public class Recursion{
   //part1: factorial non-recursion
   public static int factoria(int n){
   
   //part2: factorial recursion
   public static int factoria(int n){
       if( n==0||n==1){
           return 1;
       }
       return n * factoria(--n);
   }
   
   //part3: fibonacci sequence non-recursion

   //part4: fibonacci sequence recursion
   public static int fibonacci(int mon){
        if(mon ==1 || mon ==2){
            return 1;
        }
        return fibonacci(mon-1)+fibonacci(mon-2);
    }
}
