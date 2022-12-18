public class Xor {
    public static void main(String[] args) {
        int x=4;
        int y=5;
        int limit=3;
        System.out.println(x<<1);
    }

    static int findXor(int x, int y,int limit) {
        int xor = 0;
        for (int i = 0; i < limit; i++) {
            xor ^= x ^ y;
            x = x << 1;
            y = y << 1;
        }
        return xor;
    }
}
