package MapProductions;

public class Owner implements Comparable<Owner>{
    private String Name;

    public Owner(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Director{" +
                "Name='" + Name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Owner owner) {
        return this.getName().compareToIgnoreCase(owner.getName());
    }
}
