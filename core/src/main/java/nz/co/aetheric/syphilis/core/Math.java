package nz.co.aetheric.syphilis.core;

public class Math {

    public static int triangle(int factor, int level) {
        return level * ( level + 1 ) / 2 * factor;
    }
}
