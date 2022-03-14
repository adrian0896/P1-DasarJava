import java.util.Scanner;

public class T_InputScanner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = input.nextLine();
        System.out.println("my name is " + name);
    }
}
