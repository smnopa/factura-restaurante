
package com.mycompany.factura.restaurante;

import java.util.Scanner;

public class FacturaRestaurante {

    public static void main(String[] args) {
    double descuento = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombreCliente = sc.nextLine();

        System.out.print("Ingrese el valor total de la compra: ");
        double valorCompra = sc.nextDouble();

        if (valorCompra >= 200000) {
            descuento = valorCompra * 0.15;
        } else if (valorCompra >= 50000) {
            descuento = valorCompra * 0.02;
        } else if (valorCompra >= 20000) {
            descuento = valorCompra * 0.015;
        }

        double totalPagar = valorCompra - descuento;
        
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("Restaurante pollo rico");
        System.out.println("-------------------------");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Valor total compra: $" + valorCompra);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);
        System.out.println("-------------------------");
        System.out.println("¡Gracias por su compra!");

    }
}