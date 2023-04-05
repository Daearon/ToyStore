package ToyStore;

public class Toy {
    private final Integer id;
    private final String name;

    public Toy(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "; Name: " + this.name + ";";
    }
}
