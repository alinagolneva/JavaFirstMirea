package Dog;

public class TestDog
{
    public static void main(String[] args) {
        Breed d1 = new Breed("Bob",12, "poodle" );
        System.out.println(d1.getBreed());
        System.out.println(d1.toString());
    }
}
