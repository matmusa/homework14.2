public class Orange extends Friuts{
   Vitamine vitamine;

    public Orange(String name, String color, int weight,Vitamine vitamine) {
        super(name, color, weight);
        this.vitamine=vitamine;
    }

    public String toString() {
        return "Orange{" +
                "vitamine=" + vitamine +
                ", name='" + getName() + '\'' +
                ", color='" + getColor()+ '\'' +
                ", weight=" + getWeight() +
                '}';
    }
}
