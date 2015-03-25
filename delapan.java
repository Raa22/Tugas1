public class delapan {
    public static void main(String[] args) {
        //variabel
        int awal = 1;
        int akhir = 110;
        //proses
        for(awal=1; awal<=110; awal++){
            if(awal % 5 == 0){
                System.out.print("UUUYEEEE ");
            }else {
                System.out.print(awal + " ");
            }
            if (awal%11==0){
                System.out.print("\n");
            }
        }
    }
}
