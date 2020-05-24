package kpfu.ru.MaximovKA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Sequence sequence = new Sequence(n);
        System.out.println(sequence);
		System.out.println("___________");
		
        System.out.println(new Sequence(5));
        System.out.println("___________");
        System.out.println(new Sequence(10));
    }
}
