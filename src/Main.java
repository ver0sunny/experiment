import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Human me = new Human(17, "Veronica");
        Human him = new Human(18, "Vanya");
        Human myClone = new Human(17, "Veronica");
        System.out.println(me);
        System.out.println(me.equals(myClone));
        System.out.println(me.equals(him));
        System.out.println(me.hashCode());
        System.out.println(myClone.hashCode());
        System.out.println(him.hashCode());

    }
}

class Human {
    private int age;
    private String name;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

    @Override
    public boolean equals(Object ex) {
        if (this == ex) return true;
        if (ex == null) return false;
        if (this.getClass() != ex.getClass()) return false;
        Human other = (Human) ex;
        if (age != other.age) return false;
        if (name != other.name) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Math.abs(Objects.hash(this.name));
    }

//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime*result + age;
//        return result;
//    }
}
