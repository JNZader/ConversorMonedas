import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      Conversor conversor=new Conversor();

      int opcion=0;

      do {
         System.out.println("**************************************");
         System.out.println("¡Bienvenido al conversor de moneda!\n");
         System.out.println("1) Dólar => Peso Argentino");
         System.out.println("2) Peso Argentino => Dólar");
         System.out.println("3) Dólar => Real Brasileño");
         System.out.println("4) Real Brasileño => Dólar");
         System.out.println("5) Dólar => Peso Colombiano");
         System.out.println("6) Peso Colombiano => Dólar");
         System.out.println("7) Salir\n");
         System.out.println("Elija una opción válida:");
         System.out.println("**************************************");

         if (!scanner.hasNextInt()) {
            System.out.println("Entrada no válida. Por favor, ingrese un número del 1 al 7.");
            scanner.next();
            continue;
         }

         opcion = scanner.nextInt();

         switch (opcion) {
            case 1:
               System.out.println("Convirtiendo de Dólar a Peso Argentino...");
               conversor.mostrarConversion("USD","ARS");
               break;
            case 2:
               System.out.println("Convirtiendo de Peso Argentino a Dólar...");
               conversor.mostrarConversion("ARS","USD");
               break;
            case 3:
               System.out.println("Convirtiendo de Dólar a Real Brasileño...");
               conversor.mostrarConversion("USD","BRL");
               break;
            case 4:
               System.out.println("Convirtiendo de Real Brasileño a Dólar...");
               conversor.mostrarConversion("BRL","USD");
               break;
            case 5:
               System.out.println("Convirtiendo de Dólar a Peso Colombiano...");
               conversor.mostrarConversion("USD","COP");
               break;
            case 6:
               System.out.println("Convirtiendo de Peso Colombiano a Dólar...");
               conversor.mostrarConversion("COP","USD");
               break;
            case 7:
               System.out.println("Saliendo del programa...");
               break;
            default:
               System.out.println("Opción no válida. Por favor, intente de nuevo.");
         }
      } while (opcion != 7);

      scanner.close();
   }
}
