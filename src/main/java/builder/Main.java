package builder;

public class Main {
    public static void main(String[] args) {

        User user = User.UserBuilder.anUser()
                .email("asdasd")
                .age(21)
                .name("joe")
                .lastName("ssdgdfe")
                .build();

        System.out.println(user.getAge());

//        User user =
//                new User.UserBuilder("jan","kowalski")
//                .age(21)
//                .email("asdf@wp.pl")
//                .build();
//        System.out.println(user.getAge());

    }
}
