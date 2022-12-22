import java.util.Objects;

public class Ship {

    private String name;
    private int number;

    public Ship(){
        name = "Default";
    }

    public Ship(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return number == ship.number && Objects.equals(name, ship.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }
}
