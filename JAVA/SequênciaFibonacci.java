import java.util.Scanner;
public class  SequênciaFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num, p1=0, p2=1, res=0, i=0;
        num = scan.nextInt();
        if (num <= 1) {
            System.out.print("1");
        }else{
            while (i < num) {
                res = p1 + p2;
                p1 = p2;
                p2 = res;
                System.out.println(res);
                i++;
            }
        }
        scan.close();
    }
}