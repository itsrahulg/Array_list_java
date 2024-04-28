import java.util.Scanner;
import java.util.ArrayList;
 class Main {
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

        //printing the original array list
        for(int k=0;k<arrayList.size();k++){
            System.out.print(arrayList.get(k) + " ");
        }
        System.out.println();

        //removing the odd numbered values
        for(int j=arrayList.size()-1;j>=0;j--){
            if(arrayList.get(j) % 2 != 0){
                arrayList.remove(j);
            }
        }

        //printing the modified array list
        for(int k=0;k<arrayList.size();k++){
            System.out.print(arrayList.get(k) + " ");
            }

    }
}