public class Asal {
    public static void main(String[] args) {
        int bolen = 0;
        for(int i =1;i<=100;i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    bolen++;
                }
            }
            if (bolen == 2) {
                System.out.print(i+" ");
            }
            bolen =0;
        }
    }
}
