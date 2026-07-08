import java.util.Scanner;
class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter number: ");
         int number = scanner.nextInt();
         
        scanner.close();
        System.out.print(facto(number));
        
    }
    public static int facto(int a){
        if(a==0)
        return 1;
        else
        return a * facto(a-1);
    }
}

//#multiple of n*m
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter number: ");
         int number = scanner.nextInt();
         int number2 = scanner.nextInt();
         //System.out.print(number);
        // 3. Read a line of string input
        
        scanner.close();
        System.out.print(mult(number,number2));
        
    }
    public static int mult(int a,int b){
        if(b==1)
        return a;
        else
        return a + mult(a,b-1);
    }
}

#n ki power m
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter number: ");
         int number = scanner.nextInt();
         int number2 = scanner.nextInt();
         scanner.close();
        System.out.print(mult(number,number2));
        
    }
    public static int mult(int a,int b){
        if(b==1)
        return a;
        else
        return a * mult(a,b-1);
    }
}
