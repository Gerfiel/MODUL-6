package Modul6;
public class KomputerCetak {
    public static void main(String[] args) {
        Komputer [] komp = new Komputer[3];
        komp[0]= new PC();
        komp[1]= new Laptop();
        komp[2]= new Netbook();
        
        for (Komputer komp1 : komp) {
            komp1.hidupkan_os();
            komp1.matikan_os();
            komp1.klik_kanan();
            komp1.klik_kiri();
            komp1.tekan_enter();
            komp1.cetak_data();
        }
    }
    
}
