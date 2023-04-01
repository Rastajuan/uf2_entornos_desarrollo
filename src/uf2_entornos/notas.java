package uf2_entornos;

import java.util.Scanner;
/**
* Clase notas
* 
* Clase para calcular las notas finales de un alumno
* 
* @author Juan Bello
* 
* @version 1.0
* 
*/
public class notas {
/**
* Variables que recogen el valor de las notas (uf),los acumulados (acumulado) y la nota definitiva (def)
*/
double uf1, uf2, uf3;
double acumulado1, acumulado2, acumulado3, definitiva;
Scanner entrada = new Scanner(System.in);
/**
*Método para ingresar las notas de un estudiante.
*
*Este método solicita al usuario ingresar las notas de tres unidades formativas y las almacena en variables correspondientes.
*
*/
public void introducirNotas() {
System.out.println("ingrese las notas del estudiante");
/**
* Recogida nota 1
*/
System.out.print("ingrese nota 1: ");
uf1= entrada.nextDouble();
/**
* Recogida nota 2
*/
System.out.print("ingrese nota 2: ");
uf2= entrada.nextDouble();
/**
* Recogida nota 3
*/
System.out.print("ingrese nota 3: ");
uf3= entrada.nextDouble();
}
/**
*Método para comprobar la validez de las notas introducidas.
*
*Este método comprueba si cada una de las tres notas introducidas por el usuario es menor o igual a 10. En caso contrario, muestra un mensaje de error indicando que la nota fue mal introducida.
*
*/
public void comprobacion(){
if (uf1>10) {
System.out.println(" nota1 mal introducida");
}else {
System.out.println(" nota1 correcta");
}
if (uf2>10) {
System.out.println(" nota2 mal introducida");
}else {
System.out.println(" nota2 correcta");
}
if (uf3>10) {
System.out.println(" nota3 mal introducida");
}else {
System.out.println(" nota3 correcta");
}
}
/**
*Método para calcular la nota definitiva de un estudiante.
*
*Este método utiliza las notas de tres unidades formativas para calcular la nota definitiva de un estudiante. La nota de la primera y segunda unidades formativas tienen un peso del 35%, mientras que la nota de la tercera unidad formativa tiene un peso del 30%.
*
*/
public void Calculonotas() {
/**
* Cálculo del valor del porcentaje total de cada nota
*/
acumulado1= uf1*0.35;
acumulado2 = uf2 * 0.35;
acumulado3 = uf3 * 0.30;
/**
* Nota definitiva del estudiante sumando las 3 acumuladas
*/
definitiva = acumulado1 + acumulado2+ acumulado3;
}
/**
*Método para mostrar las notas y la nota definitiva de un estudiante.
*
*Este método muestra en pantalla las notas de las tres unidades formativas, los acumulados correspondientes y la nota definitiva de un estudiante.
*
*/
public void Mostrar() {
/**
* Impresion de las 3 notas por separado
*/
System.out.println(" Las notas introducidas son:");
System.out.println(" nota1 = " + uf1);
System.out.println(" nota2 = " + uf2);
System.out.println(" nota3 = " + uf3);
/**
* Impresión acumulado
*/
System.out.println(" acumulado 1 = "+ acumulado1);
System.out.println(" acumulado 2 = "+ acumulado2);
System.out.println(" acumulado 3 = "+ acumulado3);
/**
* Impresion nota definitiva
*/
System.out.println(" nota definitiva es = "+ definitiva);
}
/**
*Método para determinar si un estudiante aprueba o suspende.
*
*Este método determina si un estudiante aprueba o suspende, comparando su nota definitiva con el valor 5. Si la nota es menor a 5, el estudiante reprobará. Si la nota es mayor o igual a 5, el estudiante aprobará. Si la nota está fuera del rango válido de 0 a 10, se muestra un mensaje de error. 
*
*/
public void aprobado() {
if(definitiva<5 && definitiva>=0) {
System.out.println("suspendido");
}else {
if (definitiva>=5 && definitiva<=10 ) {
System.out.println("aprobado");
}else {
System.out.println(" error en la notas");
}
}
}
/**
*Método principal que ejecuta el programa.
*
*Este método principal crea un objeto de la clase notas, llama a los métodos necesarios para ingresar las notas, calcular los acumulados y la nota definitiva, mostrar las notas y determinar si el estudiante aprueba o suspende.
* 
* @param args Argumentos del programa
*/ 
public static void main(String[] args) {
notas fc= new notas();
fc.introducirNotas();
fc.comprobacion();
fc.Calculonotas();
fc.Mostrar();
fc.aprobado();
}
}

