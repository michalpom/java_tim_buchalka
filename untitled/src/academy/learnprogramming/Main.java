package academy.learnprogramming;

//Suma1.java
public class Suma1
{
    public static void main(String[] liczby)
    {
        int j = liczby.length;
        float[] tablica = new float [j];
        float suma = 0;
//wypełnianie tablicy liczbami
        for(int i = 0; i < liczby.length; i++)
            try
            {
                tablica [i]= Float.parseFloat(liczby[i]);
            }
            catch(Exception e)
            {
                int k = i+1;
                System.err.println("Parametr numer " + k +" to nie liczba");
            }
//obliczanie sumy
        for(int i = 0; i < liczby.length; i++)
            suma = suma + tablica[i];
        System.out.println("Suma podanych liczb wynosi: " + suma);
    }
} c
