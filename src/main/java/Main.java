public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Peggy")
                .setSurname("Hill")
                .setAge(30)
                .setAddress("Arlen")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Bobby")
                .build();
        System.out.println(mom + " has " + " son, " + son);

        try {
            // Не хватает обяхательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}