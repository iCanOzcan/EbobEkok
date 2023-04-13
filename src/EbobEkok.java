import java.util.Scanner;
public class EbobEkok {
    public static void main(String[]args){
        int i =1,ebob=1,ekok=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("n1:");
        int n1 = scan.nextInt();
        System.out.print("n2:");
        int n2 = scan.nextInt();

        while (i<=n1) {
            i++;
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
        }
        ekok=(n1*n2)/ebob;
        System.out.println("Ebob : "+ebob);
        System.out.print("Ekok : "+ekok);

        }
    }

