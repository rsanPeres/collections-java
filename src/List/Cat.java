package List;

public class Cat implements Comparable<Cat> {
    private String name;
    private Integer age;
    private String color;

    public Cat(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        return this.getName().compareToIgnoreCase(cat.getName());
    }
}
