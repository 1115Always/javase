package enumerate;

enum Shrubbery {GROUND, CRAWLING, HANING}

public class EnumClass {

    public static void main(String[] args) {
        for (Shrubbery s : Shrubbery.values()) {
            System.out.println("-------------------------");
            System.out.println(s + " ordinal: " + s.ordinal());
            System.out.println(s.compareTo(Shrubbery.CRAWLING) + " ");
            System.out.println(s.equals(Shrubbery.CRAWLING) + " ");
            System.out.println(s == Shrubbery.CRAWLING);
            System.out.println(s.getDeclaringClass());
            System.out.println(s.name());
        }
    }
}
