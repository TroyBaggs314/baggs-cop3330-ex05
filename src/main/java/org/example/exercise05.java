package org.example;
import java.util.Scanner;
class Numbers
{
    int n1;
    int n2;
}

public class exercise05
{
    public static void main (String[] args)
    {
        Numbers num = new Numbers();
        num = inputs(num);
        System.out.println(num.n1 + " + " + num.n2 + " = " + (num.n1 + num.n2));
        System.out.println(num.n1 + " - " + num.n2 + " = " + (num.n1 - num.n2));
        System.out.println(num.n1 + " *+ " + num.n2 + " = " + (num.n1 * num.n2));
        System.out.println(num.n1 + " / " + num.n2 + " = " + (num.n1 / num.n2));
    }

    public static Numbers inputs(Numbers num)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the first number?");
        num.n1 = sc.nextInt();
        System.out.println("What is the second number?");
        num.n2 = sc.nextInt();
        return num;
    }
}
