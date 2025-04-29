import java.util.ArrayList;
import java.util.Arrays;

public class mac {
    public static void main(String[] args) {
        ArrayList < ArrayList <String> > multi = new ArrayList<>();
        multi.add(new ArrayList<>(Arrays.asList()));
        multi.add(new ArrayList<>(Arrays.asList("David","Adamu")));
        multi.add(new ArrayList<>(Arrays.asList()));
        multi.add(new ArrayList<>(Arrays.asList()));
        multi.add(new ArrayList<>(Arrays.asList()));

        multi.get(0).add(0,"Sarah");
        System.out.println(multi);
    }
}
