public class Friuts {
   private String name;
    private String color;
  private   int weight;



    public Friuts(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;

    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Friuts{" +
                "name='" + getName() + '\'' +
                ", color='" +getColor()+ '\'' +
                ", weight=" + getWeight() +
                '}';
    }
}

