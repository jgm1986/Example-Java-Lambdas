import lib.example3.Person;
import lib.example3.PersonFactory;

import java.util.Collections;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        /**
         * We want to use Lambda expresion to short a list of objects
         */
        List<Person> persons = PersonFactory.createPersons();

        // Order alphabetical by name
        //Collections.sort(persons, new Comparator<Person>() {
        //    @Override
        //    public int compare(Person o1, Person o2) {
        //        return o1.getName().compareToIgnoreCase(o2.getName());
        //    }
        //});
        Collections.sort(persons, (o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));


        persons.forEach(person -> System.out.println(person.getName()));
        printSplitLine();

        /**
         * Using method reference, we can parse the previous line to (this is called pass-through) this because
         *  we are not changing nothing:
         */
        persons.forEach(System.out::println);
        printSplitLine();

        /********************
         * Other part of the example. We cant order by Gender
         */
        Collections.sort(persons, (o1, o2) -> o1.getGender().compareTo(o2.getGender()));
        persons.forEach(System.out::println);

    }

    public static final void printSplitLine() {
        System.out.println("-------------------------------------------------------------------------------------");
    }
}
