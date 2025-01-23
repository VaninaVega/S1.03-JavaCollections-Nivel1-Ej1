
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ArrayList<Month> Month = new ArrayList<>();
        Month.add(new Month("January"));
        Month.add(new Month("February"));
        Month.add(new Month("March"));
        Month.add(new Month("April"));
        Month.add(new Month("May"));
        Month.add(new Month("June"));
        Month.add(new Month("July"));
        Month.add(new Month("September"));
        Month.add(new Month("October"));
        Month.add(new Month("November"));
        Month.add(new Month("December"));

        for (int i = 0; i < Month.size(); i++) {
            System.out.println("Month of the year without August: " + Month.get(i).getName());
        }

        System.out.println("---------------------Month with August-------------------------");

        Month.add(7, new Month("August"));

        for (int i = 0; i < Month.size(); i++) {
            System.out.println("Month of the year with August: " + Month.get(i).getName());
        }

        System.out.println("------------------------HashSet-------------------------");

        Set<String> MonthNoDuplicates = new HashSet<>();

        Month.add(new Month("January"));
        Month.add(new Month("February"));

        for (int i = 0; i < Month.size(); i++) {
            System.out.println("Month of the year with two repeated: " + Month.get(i).getName());
        }

        for (int i = 0; i < Month.size(); i++) { //recorro el array original
            MonthNoDuplicates.add(Month.get(i).getName());
        }

        System.out.println(MonthNoDuplicates);
    }
}

