
package calculadora;

import java.util.Scanner;
 
public class Calculadora {
     
    
     
   
   
    public static void main(String[] args) {
        int opcion;
        Operaciones calcu1= new Operaciones();
        Scanner entra=new Scanner(System.in);
        System.out.println("\t Bienvenido a la calculadora");
        
        System.out.println("Seleccione la opcion que desea realizar: \n1. Suma \n2. Resta \n3. Multiplicación \n4. División \n5. Exponente \n6. Raiz \n7. Calcular IVA" );
        opcion=entra.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Ingrese los 2 valores a sumar: ");
                float resultado= calcu1.suma(entra.nextFloat(), entra.nextFloat());
                System.out.println("El resultado es: "+resultado);
                break;
            case 2:
                System.out.println("Ingrese los 2 valores a restar: ");
                 resultado= calcu1.resta(entra.nextFloat(), entra.nextFloat());
                System.out.println("El resultado es: "+resultado);
                break;
            case 3:
                System.out.println("Ingrese los 2 valores a multiplicar: ");
                 resultado= calcu1.multiplicacion(entra.nextFloat(), entra.nextFloat());
                System.out.println("El resultado es: "+resultado);
                break;
            case 4:
                System.out.println("Ingrese los 2 valores a dividir: ");
                 resultado= calcu1.division(entra.nextFloat(), entra.nextFloat());
                System.out.println("El resultado es: "+resultado);
                break;
             case 5:
                 System.out.println("Ingrese los 2 valores, primero base y luego exponente: ");
                 resultado= (float) calcu1.exponente(entra.nextFloat(), entra.nextFloat());
                System.out.println("El resultado es: "+resultado);
                break;
            case 6:
                 System.out.println("Ingrese los 2 valores, primero base y valor de raiz: ");
                 resultado= (float) calcu1.raiz(entra.nextFloat(), entra.nextFloat());
                System.out.println("El resultado es: "+resultado);
                break;
            case 7:
                 System.out.println("Ingrese el valor a calcular el IVA");
                 resultado= calcu1.iva(entra.nextFloat());
                System.out.println("El resultado es: "+resultado);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        
        
        
        
        
        }
        }


