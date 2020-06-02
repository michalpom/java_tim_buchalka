package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int variable = 25;
        int[] arrayA= new int[10]; //1st way to initialize

        arrayA[4]=6;
        arrayA[0]=1;
        int[] arrayC={2,76,5,3,5,8,44,67,8,5,55};//2nd way to initialize
        double[] arrayB = new double[5];

        int[] arrayD=new int[8];
        for (int i=0; i < arrayD.length; i++){
            arrayD[i]= i*2+1;
            System.out.println(arrayD[i]);
        }

        printArray(arrayD); //printing elements of any array
        printArray(arrayC);
        //System.out.println(arrayA[4]);
        //System.out.println(arrayC[3]);

    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(i + "# element = " + array[i]);
        }
    }
}
