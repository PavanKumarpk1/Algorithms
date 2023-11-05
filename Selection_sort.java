import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of elements");
        int max = s.nextInt();

        int A[] = new int[max];

        for(int i = 0; i<max; i++){
            A[i] = s.nextInt();
        }

        for(int i =0; i<max -1; i++){
            int smallest = i;
            for(int j=i+1; j<max;j++){
                if(A[smallest]>A[j]){
                    smallest = j;
                }

            }
            int temp = A[smallest];
            A[smallest] = A[i];
            A[i] = temp;
        }

        for(int i = 0; i<max; i++){
            System.out.print(A[i]+ " ");
        }
    }
}
