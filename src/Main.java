public class Main {
    public static void main(String[] args) {
        Vitamine vitamine = new Vitamine("Vitamin b6");
        Vitamine vitamine2 = new Vitamine("Vitamin c1");
        Vitamine vitamine3 = new Vitamine("Vitamin f ");

        Apple apple = new Apple("Apple", "red", 50, vitamine);
         Orange orange = new Orange("Orange", "orange", 13,vitamine2);
            Banana banana = new Banana("Banana", "yellow", 12, vitamine3);

        System.out.println(apple);
         System.out.println(banana);
         System.out.println(orange);
    }
}