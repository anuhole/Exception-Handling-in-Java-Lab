import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int [] arr =new int[5];
        try{
            System.out.println("Entr 5 Interger");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            System.out.println("Sum :"+sum);
            double avg=sum/ arr.length;
            System.out.println("Avg :"+avg);
        }catch (ArithmeticException e){
            System.out.println("Error : Arithematic Error Occurs");
        }catch (NumberFormatException e){
            System.out.println("Error : Please Enter Valid Integer");
        }
    }
}
