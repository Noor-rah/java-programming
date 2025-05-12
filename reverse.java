import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]=new int[100];
        int n;
        n=s.nextInt();
        for (int i=0;i<n;i++){
            a[i]=s.nextInt();
            }
        for (int i=n-1;i>-1;i--){
            System.out.print(a[i]+" ");
        }
    }
}
