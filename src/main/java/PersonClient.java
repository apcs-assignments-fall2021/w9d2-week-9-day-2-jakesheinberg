public class PersonClient {
    public static void main(String[] args) {
        Person p = new Person("Nathan","Daddy");
        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());
    }
}