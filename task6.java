// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре 
// будут повторяющиеся имена с разными телефонами, их необходимо 
// считать, как одного человека с разными телефонами. Вывод 
// должен быть отсортирован по убыванию числа телефонов.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.Set;

// import javax.print.attribute.IntegerSyntax;

public class task6 {
    public static void main(String[] args) {
        ArrayList<String> Shamilov = new ArrayList<>();
        ArrayList<String> Sokolov = new ArrayList<>();
        ArrayList<String> Ivanova = new ArrayList<>();
        ArrayList<String> Tkachev = new ArrayList<>();
        ArrayList<String> Nazarenko = new ArrayList<>();

        Shamilov.add("89078924687");
        
        Shamilov.add("89078924647");
        Shamilov.add("89078924627");
        
        Shamilov.add("89078924587");
        Sokolov.add("89049878922");
        Ivanova.add("89449924205");
        Ivanova.add("89449924005");
        Ivanova.add("89449923805");
        Tkachev.add("89043773211");
        Tkachev.add("89043764211");
        Tkachev.add("89043785211");
        Tkachev.add("89043752211");
        Nazarenko.add("89243773201");
        Nazarenko.add("89243774251");

        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        
        phoneBook.put("Shamilov", Shamilov);
        Shamilov.add("89078924667");
        phoneBook.put("Shamilov", Shamilov);
        Shamilov.add("89078924607");
        phoneBook.put("Shamilov", Shamilov);
        phoneBook.put("Sokolov", Sokolov);
        phoneBook.put("Ivanova", Ivanova);
        phoneBook.put("Tkachev", Tkachev);
        phoneBook.put("Nazarenko", Nazarenko);

    // System.out.println(phoneBook);

    ArrayList<String> names = new ArrayList<>();
    for (String n: phoneBook.keySet()){
        names.add(n);
    }
    // System.out.println(names);

    Collections.sort(names, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return phoneBook.get(o2).size() - phoneBook.get(o1).size();
        }
    });
    // весело заменяется на Collections.sort(names, (o1, o2) -> phoneBook.get(o2).size() - phoneBook.get(o1).size();
    
    for (int i = 0; i < names.size(); i++){
        System.out.println(names.get(i) + " - " + phoneBook.get(names.get(i)).size());
    }
    
   }
}
