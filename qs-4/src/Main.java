import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int N = 0;
        System.out.println("Enter N value: ");
        N = inputs.nextInt();

        for(int j = 0;j<N;j++){
            System.out.println("Enter value " + (j+1) +" :");
            int num = inputs.nextInt();
            arrayList.add(num);

        }

        ArrayList<Integer> temp = new ArrayList<Integer>();

        for(int j=arrayList.size()-1;j>=0;j--){
            int value = arrayList.get(j);
            temp.add(value);
        }

        for(int k = 0;k<temp.size();k++){
            System.out.print(temp.get(k) + " ");
        }

    }
}