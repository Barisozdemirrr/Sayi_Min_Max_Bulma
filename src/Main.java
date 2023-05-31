import java.util.*;

class Main {


    public static void main(String[] args) {
        int n ,min,max;

        Scanner input=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");

        n=input.nextInt();

        int[] array = new int[10];
        System.out.println("Lütfen sayıyı giriniz : ");

        for(int i=0; i<n; i++)
        {

            array[i]=input.nextInt();
        }
        max = Arrays.stream(array).max().getAsInt();
        min = Arrays.stream(array).min().getAsInt();

        System.out.println("En büyük sayı : "+max);
        System.out.println("En küçük sayı : "+min);


    }}