package enumerate;

public class NonEnum {

    public static void main(String[] args) {
        Integer[] enumConstants = Integer.class.getEnumConstants();
        System.out.println(enumConstants);
    }
}
