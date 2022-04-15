import java.util.Scanner;

public class FibonacciDemo {
        public static void main(String[] args){
            System.out.print("Please enter the numbers of integers for Fibonacci: ");
            Scanner input = new Scanner(System.in);
            int count = Integer.parseInt(input.next());

            int[] result = Generate(count);
            for(int i=0;i<count;i++)
                System.out.println(result[i]);

        }

        private static int[] Generate(int count){
            int[] result = new int[count];
            for(int i=0;i<count;i++){
                if(i == 0 || i == 1){
                    result[i] = 1;
                }else{
                    result[i] = result[i - 1] + result[i - 2];
                }
            }
            return result;
        }
}
