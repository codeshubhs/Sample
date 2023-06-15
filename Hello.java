import java.util.Scanner;
class Hello{
    public static void main(String[] args, String string) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int x=sc.nextInt();
        System.out.println("Enter Second number");
        int y=sc.nextInt();
        int temp =x;
        x=y;
        y=temp;
        System.out.println("x =" +x+ string+y);
      
    }
}