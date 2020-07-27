package andersen.test.task;
import java.util.Scanner;
public class ArrayAlg {

    public void getArray(){
        int array[] = getArrayValue();
        sortArray(array);
    }

    private static int[] getArrayValue() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int size = input.nextInt();
        System.out.println("Введите элементы массива:");
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            while (!input.hasNextInt()){
                input.next();
            }
            array[i] = input.nextInt();
        }

        return array;
    }

    private static void sortArray(int[] array) {
        for(int myList : array) {
            if (myList % 3 == 0)
                System.out.println(myList);
        }
    }
}


