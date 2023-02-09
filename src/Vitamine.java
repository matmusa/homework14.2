public class Vitamine {

    private String vitamin;

    public Vitamine(String vitamin) {
        this.vitamin = vitamin;
    }

    public void setVitamin(String vitamin) {
        this.vitamin = vitamin;

    }

    public String getVitamin() {
        return vitamin;
    }

    @Override
    public String toString() {
        return "Vitamine{" +
                "vitamin='" + vitamin + '\'' +
                '}';
    }
}
