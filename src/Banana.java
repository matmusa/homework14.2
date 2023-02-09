public class Banana extends Friuts {
    Vitamine vitamine;


    public Banana(String name, String color, int weight, Vitamine vitamine) {
        super(name, color, weight);
        this.vitamine=vitamine;
    }

    public String toString() {
        return "Banana{" +
                "vitamine=" + vitamine +
                ", name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", weight=" + getWeight() +
                '}';
    }
}