import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int a,b;
       a=s.nextInt();
       b=s.nextInt();
       for (int i=a+1;i<b;i++){
           int c=0;
           for (int j=2;j<i;j++){
               if(i%j==0){
                   c=1;
               }
           }
           if(c==0)
               {
                   System.out.print(i+" ");
               }
       }
    }
}
