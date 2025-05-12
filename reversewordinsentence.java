import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=new String(s.nextLine());
        String ar[]=a.split(" ");
        for(int i=(ar.length-1);i>=0;i--){
            System.out.print(ar[i]+" ");
        }
        }
        
    }

or

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        StringBuilder a=new StringBuilder(s.nextLine());
        a.reverse();
        //System.out.print(a);
        String ar[]=((""+a).split(" "));
        for(int i=(ar.length-1);i>=0;i--){
            System.out.print(ar[i]+" ");
        }
        }
}
