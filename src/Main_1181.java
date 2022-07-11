import java.util.*;

public class Main_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        HashSet<String> set = new HashSet<String>();
        for(int i=0; i<num; i++){
            set.add(sc.next());
        }
        String[] data = set.toArray(new String[0]);

        Arrays.sort(data);
        Arrays.sort(data, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        for(String answer : data)
            System.out.println(answer);
    }
}
