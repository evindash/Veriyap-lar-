
package javaapplication103minheap;
/*
  Evin Das---02190201017
 */
import java.util.Scanner;

public class JavaApplication103MinHeap {
    // Olusturulan dizinin min-heap olup olmadigini gosteren fonksiyon
    public static boolean checkMinHeap(int[] A, int i)
    {
        // eger "i" bir yaprak dugumse , true dondurur cunku butun yaprak dugumler bir hesp dir
        if (2*i + 2 > A.length) {
            return true;
        }
 
        // eger "i" baska bir node ise
 
        // sol cocugun bir heap olup olmadigini rekursif olarak kontrol et
        boolean left = (A[i] <= A[2*i + 1]) && checkMinHeap(A, 2*i + 1);
 
        // sag cocugun bir heap olup olmadigini rekursif olarak kontrol et
        // once sag cocugun olup olmadigini kontrol et
        boolean right = (2*i + 2 == A.length) ||
                        (A[i] <= A[2*i + 2] && checkMinHeap(A, 2*i + 2));
 
        // sag ve sol cocugun ikisi de heap ise true dondurur
        return left && right;
    }
    public static void main(String[] args)
    {
        int i = 0;
        int A[] = new int[10];
        Scanner sc = new Scanner(System.in);
 
        System.out.print("10 tane sayi girin :");
 
        for (i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
 
        for (int sayi:A) {
            System.out.print(sayi+",");
        }
       
 
        // 0  inci indeks ile basla (heap in kok dugum)
        int index = 0;
 
        if (checkMinHeap(A, index)) {
            System.out.println("Olusturulan dizi min heap dir.");
        }
        else {
            System.out.println("Olusturulan dizi min heap degildir.");
        }
    }
   
}


  
