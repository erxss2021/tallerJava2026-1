package records;

public record Person(String name, int age) {
    public Person{
        if (name.isBlank()) {
            throw new IllegalArgumentException();
        }
        if (age < 0) {
            throw new IllegalArgumentException();
        }
    }
}
