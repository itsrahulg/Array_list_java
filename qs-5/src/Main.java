import java.util.Scanner;
import java.util.ArrayList;
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
            String word = inputs.next();
            arrayList.add(word);

        }

        System.out.println("Enter word to remove: ");
        String wordToRemove = inputs.next();

        for(int k=arrayList.size()-1;k>=0;k--){
            if (arrayList.get(k).equals(wordToRemove)){
                arrayList.remove(k);
            }
        }

        for(int m=0;m<arrayList.size();m++){
            System.out.print(arrayList.get(m) + " ");
        }

    }
}