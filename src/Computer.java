public class Computer implements Comparable<Computer>{
    private String desription;
    private int id;
    private double weight;


    public Computer(String desription, int id, double weight) {
        this.desription = desription;
        this.id = id;
        this.weight = weight;
    }


    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Computer other) {
        return desription.compareTo(other.getDesription());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "desription='" + desription + '\'' +
                ", id=" + id +
                ", weight=" + weight +
                '}';
    }
}
