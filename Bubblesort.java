import java.util.*;

public class Bubblesort{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of elements");
        int max = s.nextInt();

        int A[] = new int[max];

        for(int i = 0; i<max; i++){
            A[i] = s.nextInt();
        }
        for(int i =0; i<max -1; i++){
            for(int j=0; j<max-1 -i;j++ ){
                if(A[j]>A[j+1]){
                    int temp = A[j];
                    A[j]= A[j+1];
                    A[j+1]= temp;
                }
            }
        }

        for(int i = 0; i<max; i++){
            System.out.print(A[i]+ " ");
        }

    }
}