package grupo1;

import java.util.Scanner;

public class area_circulo {

    public  void circulo() {
        Scanner sc = new Scanner(System.in);

        // Solicitar el radio del círculo al usuario
        System.out.println("Ingrese el radio del círculo:");
        double radio = sc.nextDouble();

        // Calcular el área del círculo
        double area = Math.PI * Math.pow(radio, 2);

        // Imprimir el área del círculo
        System.out.println("El área del círculo es: " + area);

        // Cerrar el scanner
        sc.close();
    }
}
