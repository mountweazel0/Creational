public class PersonBuilder {
    private String name;
    private String surname;
    private int age = -1;
    private String address;
    private Person person;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Error! Incorrect age");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalArgumentException("Error. Insufficient data entered!");
        } else if (age >= 0 && address != null) {
            return new Person(name, surname, age, address);
        } else if (age >= 0) {
            return new Person(name, surname, age);
        } else {
            return new Person(name, surname);
        }
    }
}