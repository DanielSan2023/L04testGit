import java.util.Comparator;

public class ComputerWeightComparator implements Comparator<Computer> {


    @Override
    public int compare(Computer o1, Computer o2) {
        return (int) (o1.getWeight() - (o2.getWeight()));
    }
}
