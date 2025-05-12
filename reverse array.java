import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]=new int[100];
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int f=s.nextInt();
        for(int i=0;i<f;i++)
        {
        int x=(n-1);
        int y=(n-2);
        for (int j=0;j<n;j++){
        while(y>=0 && x>=0){
            int temp;
            temp=a[x];
            a[x]=a[y];
            a[y]=temp;
            x=x-1;
            y=y-1;
        }
        }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}