package Talleres2;

import java.util.Scanner;

public class Taller2_1 {

    public static void main(String[] args) {
        int num;
        Scanner entrada=new Scanner (System.in);
        System.out.print("Ingrese su codigo de area: ");
        num = entrada.nextInt();

        if(num >= 507 )
            System.out.println("Eres local");



        else
            System.out.println("Sigue intentando");
    }
}







