package Java.builder_pattern.CarBuilder;

public class Director {
    public void buildBugatti(Builder builder) {
        builder.id(1)
                .brand("Bugatti")
                .model("Chiron")
                .color("Blue")
                .nbrOfDoors(2)
                .engine("8L")
                .height(115);
    }

    public void buildLambo(Builder builder) {
        builder.brand("Lamborghini")
                .model("Aventador")
                .color("Yellow")
                .height(120);
    }
}