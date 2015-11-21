import java.util.Random;

public class arrayHistogram {
    public static void main(String[] args)
    {
        int[] myArr = randomIntArray(30);

        myArr = arrayHist(myArr);
        for(int i = 0;i<myArr.length;i++)
        {
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

    public static int[] arrayHist(int[] myArr)
    {
        int[] histArr = new int[11];
        for(int i = 0;i<myArr.length;i++)
        {
           if(myArr[i] <= 0)
           {
               histArr[0] += 1;
           }
            else if(myArr[i] == 1)
           {
               histArr[1] += 1;
           }
            else if(myArr[i] == 2)
           {
               histArr[2] += 1;
           }
            else if(myArr[i] == 3)
           {
               histArr[3] += 1;
           }
            else if(myArr[i] == 4)
           {
               histArr[4] += 1;
           }
            else if(myArr[i] == 5)
           {
               histArr[5] += 1;
           }
            else if(myArr[i] == 6)
           {
               histArr[6] += 1;
           }
            else if(myArr[i] == 7)
           {
               histArr[7] += 1;
           }
            else if(myArr[i] == 8)
           {
               histArr[8] += 1;
           }
            else if(myArr[i] == 9)
           {
               histArr[9] +=1;
           }
            else
           {
               histArr[10] += 1;
           }
        }
        return histArr;
    }
}
