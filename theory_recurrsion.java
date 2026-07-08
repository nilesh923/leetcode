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
