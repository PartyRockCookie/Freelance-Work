import java.util.Random;

public class sortArray {

    public static void main(String[] args) {
        int[] myArr = randomIntArray(10);
        sortArray(myArr);
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }
    }

    public static int randomInt(int low, int high) {
        Random rn = new Random();
        return rn.nextInt((high - low) + 1) + low;
    }

    public static int[] randomIntArray(int size) {
        int[] myArr = new int[size];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = randomInt(-5, 15);
        }
        return myArr;
    }

    public static int indexOfMaxInRange(int[] rand, int high, int low) {
        int max = rand[low];
        int index = low;
        for (int i = low + 1; i <= high; i++) {
            if (rand[i] > max) {
                index = i;
                max = rand[i];
            }
        }
        return index;
    }

    public static int[] swapElement(int[] myArr, int i, int j) {
        int temp = myArr[i];
        myArr[i] = myArr[j];
        myArr[j] = temp;
        return myArr;
    }

    public static int[] sortArray(int[] myArr) {
        int count = 0;
        for (int i = 0; i < myArr.length; i++) {
            int temp = indexOfMaxInRange(myArr, myArr.length - 1, count); //index of largest number.
            swapElement(myArr, temp, count);
            count++;
        }
        return myArr;
    }
}
