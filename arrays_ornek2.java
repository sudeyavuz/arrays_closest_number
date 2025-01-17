package JAVA101;
import java.util.Scanner;
import java.util.Arrays;
public class arrays_ornek2 {
     public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);
         int[] arr = {15,12,788,1,-1,-778,2,0};
         System.out.print("bir değer girin:");
         int sayi = inp.nextInt();
         int min = arr[0];
         int max = arr[0];
         Arrays.sort(arr);
         for (int i:arr){
         if (sayi>i){
             min=i;
         }
         if (sayi<i){
             max=i;
             break;
         }
         }
         System.out.println("dizi:"+Arrays.toString(arr));
         System.out.println("sayıdan küçük en yakın değer: "+min);
         System.out.println("sayıdan büyük en yakın değer: "+max);

     }

 }