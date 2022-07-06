import java.util.HashSet;
import java.util.Scanner;

public class Main_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int data;

        for(int i=0; i<10; i++){
            data = sc.nextInt();
            data %= 42;
            set.add(data);
        }
        System.out.println(set.size());

    }

}
