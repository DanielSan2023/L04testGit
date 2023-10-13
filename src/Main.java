import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Hello world2 !");
        System.out.println("Hello svet !");

        List<Integer> listOfInts = new ArrayList<>();
        listOfInts.addAll(List.of(5,8,1,3,15,12));


        System.out.println("Puvodne : "+listOfInts);

        Collections.sort(listOfInts, Collections.reverseOrder());


        System.out.println("Serezeni" +listOfInts);


        List<Computer> computerList = new ArrayList<>();
        computerList.add(new Computer("ABD", 50, 7));
        computerList.add(new Computer("XSD", 51, 5));

        Collections.sort(computerList);

        System.out.println("Puvodne : "+computerList);

        Collections.sort(computerList,Collections.reverseOrder());


        System.out.println("Serezeni" +computerList);




        System.out.println("Puvodne : "+computerList);

        Collections.sort(computerList,new ComputerWeightComparator());


        System.out.println("Serezeni" +computerList);



    }
    }
