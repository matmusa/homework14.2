public class Apple extends Friuts{

   Vitamine vitamine;

    public Apple(String name, String color, int weight,Vitamine vitamine) {
        super(name, color, weight);
        this.vitamine=vitamine;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "vitamine=" + vitamine +
                ", name='" + getName() + '\'' +
                ", color='" + getColor()+ '\'' +
                ", weight=" + getWeight() +
                '}';
    }
}

