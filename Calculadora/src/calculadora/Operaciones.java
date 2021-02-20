
package calculadora;

public class Operaciones {
     public float suma(float num1, float num2){
         float resultado=num1+num2;
         return resultado;
     }
     public float resta(float num1, float num2){
          float resultado=num1-num2;
         return resultado;
     }
     public float multiplicacion(float num1, float num2){
         float resultado=num1*num2;
         return resultado;
     }
     public float division(float num1, float num2){
         float resultado=num1/num2;
         return resultado;
     }
     public double exponente(float num1, float num2){
         double  resultado=Math.pow(num1,num2);
         return resultado;
}
     public double raiz(double num1, double num2){
         num2=1/num2;
         double  resultado=Math.pow(num1,num2);
         return resultado;
}
     public float iva(float num1){
         
         float  resultado=(float) ((float)num1+(num1*0.19));
         return resultado;
}
}
