package dynamictable;

import com.github.javafaker.Faker;

public class Dynamicdata {

    static Faker faker = new Faker();
   

    public static String generateFirstName() {
        return faker.name().firstName();
    }

    public static String generateLastName() {
        return faker.name().lastName();
    }

    public static String generatePassword() {
        // You can customize the password format here
        return faker.internet().password(8, 20, true, true);
    }

    public static void main(String[] args) {
        String firstName = generateFirstName();
        String lastName = generateLastName();
        String password = generatePassword();

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Password: " + password);
    }
}
