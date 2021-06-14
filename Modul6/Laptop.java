
package Modul6;
public class Laptop extends Komputer implements Mouse, Keyboard, Printer {
    @Override
   void hidupkan_os(){
       System.out.println("Hidupkan Laptop");
   } 
    @Override
   void matikan_os(){
       System.out.println("Matikan Laptop");
   }
   @Override
   public void klik_kanan(){
       System.out.println("Klik Kanan");
   }
   @Override
   public void klik_kiri(){
        System.out.println("Klik Kiri");
   }
   @Override
   public void tekan_enter(){
       System.out.println("Tekan Enter");
   }
   @Override
   public void cetak_data(){
       System.out.println("Cetak Data");
   }
}
