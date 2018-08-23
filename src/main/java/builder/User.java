package builder;

public class User {

    private String name;
    private String lastName;
    private String adress;
    private String city;
    private String postalCode;
    private String email;
    private String telephoneNumber;
    private int age;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdress() {
        return adress;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public int getAge() {
        return age;
    }

    public static final class UserBuilder {
        private String name;
        private String lastName;
        private String adress;
        private String city;
        private String postalCode;
        private String email;
        private String telephoneNumber;
        private int age;

        private UserBuilder() {
        }

        public static UserBuilder anUser() {
            return new UserBuilder();
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder adress(String adress) {
            this.adress = adress;
            return this;
        }

        public UserBuilder city(String city) {
            this.city = city;
            return this;
        }

        public UserBuilder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder telephoneNumber(String telephoneNumber) {
            this.telephoneNumber = telephoneNumber;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            User user = new User();
            user.city = this.city;
            user.email = this.email;
            user.name = this.name;
            user.age = this.age;
            user.adress = this.adress;
            user.telephoneNumber = this.telephoneNumber;
            user.lastName = this.lastName;
            user.postalCode = this.postalCode;
            return user;
        }
    }


    //caly ten szit ponizej mozna wygenerowac za pomoca wtyczki Builder Generator

//    public User(UserBuilder builder) {
//        this.name = builder.name;
//        this.lastName = builder.lastName;
//        this.adress = builder.adress;
//        this.city = builder.city;
//        this.postalCode = builder.postalCode;
//        this.email = builder.email;
//        this.telephoneNumber = builder.telephoneNumber;
//        this.age = builder.age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getAdress() {
//        return adress;
//    }
//
//    public void setAdress(String adress) {
//        this.adress = adress;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getPostalCode() {
//        return postalCode;
//    }
//
//    public void setPostalCode(String postalCode) {
//        this.postalCode = postalCode;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getTelephoneNumber() {
//        return telephoneNumber;
//    }
//
//    public void setTelephoneNumber(String telephoneNumber) {
//        this.telephoneNumber = telephoneNumber;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public static class UserBuilder {
//        private String name;
//        private String lastName;
//        private String adress;
//        private String city;
//        private String postalCode;
//        private String email;
//        private String telephoneNumber;
//        private int age;
//
//        public UserBuilder(String name, String lastName) {
//            this.name = name;
//            this.lastName = lastName;
//        }
//
//        public UserBuilder age(int age){
//            this.age = age;
//            return this;
//        }
//        public UserBuilder email(String email){
//            this.email = email;
//            return this;
//        }
//        public UserBuilder adress(String adress){
//            this.adress = adress;
//            return this;
//        }
//        public UserBuilder city(String city){
//            this.city = city;
//            return this;
//        }
//        public UserBuilder postalCode(String postalCode){
//            this.postalCode = postalCode;
//            return this;
//        }
//        public UserBuilder telephoneNumber(String telephoneNumber){
//            this.telephoneNumber = telephoneNumber;
//            return this;
//        }
//
//        public User build(){
//            return new User(this);
//        }
//    }

}
