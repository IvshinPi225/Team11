package Lb5;

public class Class3 {

    public static int[] sort(int[] mas) {

        int length = mas.length;
        int swap;
        boolean sorted;

        for (int i = 0; i < length; i++) {

            sorted = true; 

            for (int a = 1; a < (length - i); a++) {

                // ≈сли значение элемента a-1 больше значени€ элемента a, происходит смена их значений между собой
                if (mas[a - 1] > mas[a]) {
                    swap = mas[a - 1];
                    mas[a - 1] = mas[a];
                    mas[a] = swap;
                    sorted = false;
                }

            }


            if (sorted) break; // ≈сли уже нечего сортировать, то сортировка останавливаетс€
        }

        return mas;
    }
}
