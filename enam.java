
public class enam {
    public static void main(String[] args) {
        //variabel
        float jumlah=0, r=1;
        double hasil;
        //perulangan
        while (r<=10){
            jumlah = jumlah + r;
            r++;
        }

        jumlah = jumlah / (r-1);
        System.out.println("HASILNYA :  " +jumlah);
        System.out.println("DEMIKIAN !!");
    }
}
