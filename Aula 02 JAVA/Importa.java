import java.util.Scanner;

public class Importa
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int sum;

        System.out.print("Enter Fist integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("Soma e %d%n", sum);
        input.close();
    }

}

