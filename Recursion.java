public class Recursion{
   //part1: factorial non-recursion
    public static int factoria1(int n) {
        int temp = 1;
        for (int i = 1; i < n; i++) {
            temp *= i;
        }
        return temp;
    }
   //part2: factorial recursion
   public static int factoria(int n){
       if( n==0||n==1){
           return 1;
       }
       return n * factoria(--n);
   }
   
   //part3: fibonacci sequence non-recursion
       public static int fibonacci1(int mon) {
        int first = 1;
        int second = 1;
        for (int i = 1; i < mon; i++) {
            if (i > 2) {
                int temp = first;
                first = second;
                second += temp;
            }
        }
        return second + first;
    }
   //part4: fibonacci sequence recursion
   public static int fibonacci(int mon){
        if(mon ==1 || mon ==2){
            return 1;
        }
        return fibonacci(mon-1)+fibonacci(mon-2);
    }
}
