package MapProductions;

public class Owner implements Comparable<Owner>{
    private String name;
    private String name2;
    private Integer phone;

    public Owner(String name, String name2, int phone) {
        this.name = name;
        this.name2 = name2;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Director{" +
                "Name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Owner owner) {
        return this.getName().compareToIgnoreCase(owner.getName());
    }
}

//@FunctionalInterface
//public interface Comparator<T>{
  //  @Contract(pure = true) int compare(T v1, T v2);
//}