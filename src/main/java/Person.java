public class Person {
    private String firstName;
    private String lastName;

    public Person (String a, String b){
        firstName=a;
        lastName=b;}
        public void doSomething(){
            System.out.println("I am watching Netflix");
        }

    public String toString() {
        return (firstName+lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

