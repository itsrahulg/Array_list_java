import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    static int learnIndexOf(ArrayList<Integer> arraylist, int value){
        for(int i = 0; i < arraylist.size();i++){
            if(arraylist.get(i) == value){
                return i;
            }
        }
        return -1;
    }

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

        System.out.println("Enter value to get index of : ");
        int value = inputs.nextInt();

        int result = learnIndexOf(arrayList,value);
        System.out.println(result);
    }
}