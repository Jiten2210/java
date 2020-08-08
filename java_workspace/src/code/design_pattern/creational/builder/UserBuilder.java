package code.design_pattern.creational.builder;

public class UserBuilder {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Jitendra", "Bisht")
                .age(28)
                .build();

        User user2 = new User.UserBuilder("Gaurav", "Garkoti")
                .age(30)
                .address("Banbasa, Champawat")
                .build();

        User user3 = new User.UserBuilder("Sumit", "Kumar")
                .build();

        System.out.println(user1 + "\n" + user2 + "\n" + user3);
    }
}
