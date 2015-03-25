public class sepuluh {
    public static void main(String[] args) {
        //variabel
        int pager = 5;
        //proses
        for (int r = 1; r <= pager; r++) {
            if (r % 2 == 0) {
                System.out.print(" ");
            }
            for (int t = 1; t <= pager; t++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }

    }
}