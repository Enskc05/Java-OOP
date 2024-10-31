// 1! + 2! + 3! + ... + n!
import java.util.Scanner;
class Islem{
    static int fact(int n){
        int f = 1;
        for(int i= 1 ; i<=n; i++){
            f = f * i;
        }
        return f;
    }
}

public class Main{
    public static void main(String[] args){
        int toplam  = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen değer giriniz(n<2)");
        int sayi = sc.nextInt();

        for(int k = 1; k<=sayi;k++){ö
            toplam = toplam + Islem.fact(k);
        }
        System.out.println("1!+2!+3!+...+n! değeri  = " + toplam);
        sc.close();
    }
}