import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //EBOB bulma
        int n1, n2;
        int ebobNumber;
        int ebob = 1, ekok = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("1'inci sayiyi giriniz:");
        n1 = inp.nextInt();
        System.out.print("2'nci sayiyi giriniz:");
        n2 = inp.nextInt();

        //kücük sayiyi bulma
        if (n1 < n2) {
            ebobNumber = n1;
        } else {
            ebobNumber = n2;
        }

        //ebob bulma
        for (int i = ebobNumber; i >= 1; i--) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                ebob = i;
                break;
            }
        }

        //ekok bulma
        for (int k = 1; k <= (n1 * n2); k++) {
            if (k % n1 == 0 && k % n2 == 0) {
                ekok = k;
                break;
            }
        }

        System.out.println("EBOB:" + ebob);
        System.out.println("EKOK:" + ekok);

    }
}
