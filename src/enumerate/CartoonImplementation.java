package enumerate;

import java.util.Random;

enum CartoonCharacter implements Generator<CartoonCharacter>{
    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;

    private final Random random = new Random(47);

    @Override
    public CartoonCharacter next() {
        return values()[random.nextInt(values().length)];
    }
}

public class CartoonImplementation {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(CartoonCharacter.SLAPPY.next());
        }
    }
}