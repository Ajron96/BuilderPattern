package sample;

public class Main {

    public static void main(String[] args) {

        User users[] = new User[3];

        //USER 1
        users[0] = new User.Builder("Ireneusz","Lewczuk").build();

        //USER 2
        users[1] = new User.Builder("Ireneusz", "Lewczuk")
                            .age(21)
                            .city("Ostroleka")
                            .build();

        //USER 3
        users[2] = new User.Builder("Ireneusz","Lewczuk")
                            .age(21)
                            .phone("123456789")
                            .city("Ostroleka")
                            .address("Zyndrama St")
                            .build();

        int i = 1;

        //show users's info
        for(User user : users){
            System.out.println("USER " + i++);
            user.info();
        }

    }
}
