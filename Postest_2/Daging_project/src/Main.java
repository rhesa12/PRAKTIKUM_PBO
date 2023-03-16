import java.io.*;
import java.util.*;
public class Main {
    static  ArrayList<Daging> Data = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static void freeze(int sec){
        try {
            Thread.currentThread().sleep(sec * 2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        while(true){
            System.out.println("===================");
            System.out.println("=   Data Daging   =");
            System.out.println("===================");
            System.out.println("= 1. Nambah  data =");
            System.out.println("= 2. Dsiplay data =");
            System.out.println("= 3. Update  data =");
            System.out.println("= 4. Delete  data =");
            System.out.println("= 5. Keluar       =");
            System.out.println("===================");
            System.out.print("Masukkan pilihan anda >> ");
            int pilihan = input.nextInt();
            switch(pilihan){
                case 1:
                    nambah();
                    break;
                case 2:
                    lihat();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    hapus();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("=========================");
                    System.out.println("=   Pilihan tidak ada   =");
                    System.out.println("=========================");
                    break;
            }
        }
    }
    static void nambah(){
        System.out.print("Masukkan nama Daging >> ");
        String nama_Daging = input.next();
        System.out.print("Masukkan harga Daging >> ");
        int harga_Daging = input.nextInt();
        System.out.print("Masukkan berat Daging >> ");
        float berat_Daging = input.nextFloat();
        System.out.print("Masukkan Jenis Daging >> ");
        String jenis_daging = input.next();
        Daging data_baru = new Daging(harga_Daging, nama_Daging, jenis_daging, berat_Daging);
        Data.add(data_baru);
        freeze(1);
    }
    static void lihat(){
        for(int i =0; i < Data.size(); i++){
            System.out.println("==================================");
            System.out.println("1. NAMA  DAGING >>> " + Data.get(i).getNama());
            System.out.println("2. HARGA DAGING >>> " + Data.get(i).getHarga());
            System.out.println("3. JENIS DAGING >>> " + Data.get(i).getJenis());
            System.out.println("4. BERAT DAGING >>> " + Data.get(i).getBerat());
        }
        System.out.println("");
        freeze(1);
    }
    static void update(){
        System.out.print("Masukkan nama daging >>> ");
        String nama_daging = input.next();
        for(int i = 0; i < Data.size();  i++){
            if(Data.get(i).merek_daging.equals(nama_daging)){
                System.out.print("Masukkan nama daging baru >> ");
                Data.get(i).setNama(input.next());
                System.out.print("Masukkan harga daging baru >> ");
                Data.get(i).setHarga(input.nextInt());
                System.out.print("Masukkan berat daging baru >> ");
                Data.get(i).setberat(input.nextFloat());
                System.out.print("Masukkan jenis daging baru >> ");
                Data.get(i).setjenis(input.next());
                freeze(1);
            }
        }
    }
    static void hapus(){
        System.out.print("Masukkan nama daging >>> ");
        String nama_daging = input.next();
        for(int i = 0; i < Data.size();  i++){
            if(Data.get(i).merek_daging.equals(nama_daging)){
                Data.remove(i);
            }
        }
    }
}
