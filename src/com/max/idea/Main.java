package com.max.idea;
import java.math.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {

        double a;
        double b;
        System.out.println("Введите курс доллара");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        System.out.println("Кол-во рублей");
        b = sc.nextDouble();
        sc.close();
        BigDecimal result = new BigDecimal(b/a);
        result = result.setScale(2, RoundingMode.HALF_UP);

        System.out.println(String.format("%s ", result));
    }
}
