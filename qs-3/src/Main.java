import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<String>();
        int N = 0;
        System.out.println("Enter N value: ");
        N = inputs.nextInt();
        inputs.nextLine();

        for(int j = 0;j<N;j++){
            System.out.println("Enter string " + (j+1) +" :");
            String fruit = inputs.next();
            arrayList.add(fruit);

        }

        String[] array = arrayList.toArray(new String[0]);
        Arrays.sort(array);


        System.out.println("Array elements:");
        for (String element : array) {
            System.out.print(element + " ");
        }




    }
}