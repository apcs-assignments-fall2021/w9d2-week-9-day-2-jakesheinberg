public class NinthGrader extends Student { // SOME CODE NEEDED IN THIS LINE
    public NinthGrader(String firstName, String lastName) {
        super(firstName,lastName);

    }
    public NinthGrader(){
        super("jerry", "seinfeld");
    }

    public void doSomething(){
        System.out.println("I am preparing for a harkness");
    }

    public String toString(){
        return(getFirstName() + getLastName() + "freshman");
    }
}
