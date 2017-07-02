package sample;

public class User {

    private String firstName;   //required
    private String lastName;    //required
    private int age;            //optional
    private String phone;       //optional
    private String city;        //optional
    private String address;     //optional

    public User(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age ;
        this.phone = builder.phone;
        this.city = builder.city;
        this.address = builder.address;
    }

    public void info(){
        System.out.println("Firstname: " + firstName);
        System.out.println("Lastname: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("City: " + city);
        System.out.println("Address: " + address + '\n');
    }

    //Builder
    public static class Builder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String city;
        private String address;

        public Builder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public Builder city(String city){
            this.city = city;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

}
