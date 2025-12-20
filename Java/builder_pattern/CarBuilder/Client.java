package Java.builder_pattern.CarBuilder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.buildBugatti(carBuilder);
        Car car = carBuilder.build();
        System.out.println(car.toString());

        CarBuilder carBuilder2 = new CarBuilder();
        carBuilder2.id(15)
                .brand("Branch Name")
                .color("Blue")
                .nbrOfDoors(2)
                .engine("8L")
                .height(115);

        Car car2 = carBuilder2.build();
        System.out.println(car2);

    }
}


// cd Java/builder_pattern/CarBuilder

// # Compile and run in one command
// mvn compile exec:java

// # Or just run (Maven will compile if needed)
// mvn exec:java