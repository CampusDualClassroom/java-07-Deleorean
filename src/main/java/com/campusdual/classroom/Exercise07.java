package com.campusdual.classroom;


public class Exercise07 {

    public static void main(String[] args) {
        System.out.println("Suma numeros enteros");
        sumFirstNaturalNumbers(10);
        sumFirstNaturalNumbers(-5);

        System.out.println("Muestra numeros enteros");
        showFirstNaturalNumbers(10);
        showFirstNaturalNumbers(-5);
    }
    // ESTE METODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {

    }
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {

        if (num<0){
            System.out.println("Utilice numeros positivos, por favor");
        }
        else {
            int total = 0;
            for (int i = num; i >= 0; i--) {
                total = total + (num - i);
            }
            System.out.println(total);
        }
    }
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        if (num<0){
            System.out.println("Utilice numeros positivos, por favor");
        }
        else {
            for (int i = 0; i <= num; i++) {
                System.out.println(i);
            }
        }
    }
}
