package posttest_3;
import java.util.*;
public class Main {
    static  ArrayList<Daging> Data = new ArrayList<>();
    static  ArrayList<Wagyu> data_wagyu = new ArrayList<>();
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
                case 1 -> nambah();
                case 2 -> lihat();
                case 3 -> update();
                case 4 -> hapus();
                case 5 -> System.exit(0);
                default -> {
                    System.out.println("=========================");
                    System.out.println("=   Pilihan tidak ada   =");
                    System.out.println("=========================");
                }
            }
        }
    }
    static void nambah(){
        System.out.println("========================");
        System.out.println("1. Nambah daging biasa");
        System.out.println("2. Nambah Daging wagyu");
        System.out.println("========================");
        System.out.print("Masukkan pilihan Anda >> "); int pilih = input.nextInt();
        switch(pilih){
            case 1 ->{
                System.out.print("Masukkan nama Daging >> ");
                String nama_Daging = input.next();
                System.out.print("Masukkan harga Daging >> ");
                int harga_Daging = input.nextInt();
                System.out.print("Masukkan berat Daging >> ");
                float berat_Daging = input.nextFloat();
                Daging data_baru = new Daging(harga_Daging,nama_Daging,berat_Daging);
                Data.add(data_baru);
            }
            case 2 -> {
                System.out.print("Masukkan nama Daging >> ");
                String nama_Daging = input.next();
                System.out.print("Masukkan harga Daging >> ");
                int harga_Daging = input.nextInt();
                System.out.print("Masukkan berat Daging >> ");
                float berat_Daging = input.nextFloat();
                Wagyu new_data = new Wagyu(harga_Daging,nama_Daging,berat_Daging, "Wagyu");
                data_wagyu.add(new_data);
            }
            default -> {
                System.out.println("=================");
                System.out.println("pilihan tidak ada");
                System.out.println("=================");
            }
        }
    }
    static void lihat(){
        System.out.println("=====================");
        System.out.println("1. Lihat daging biasa");
        System.out.println("2. Lihat daging wagyu");
        System.out.println("=====================");
        System.out.print("Masukkan pilihan anda >> "); int pilih = input.nextInt();
        switch(pilih){
            case 1 ->{
                for(int i =0; i < Data.size(); i++){
                    System.out.println("==================================");
                    System.out.println("1. NAMA  DAGING >>> " + Data.get(i).getNama());
                    System.out.println("2. HARGA DAGING >>> " + Data.get(i).getHarga());
                    System.out.println("4. BERAT DAGING >>> " + Data.get(i).getBerat());
                }
                System.out.println("");
                freeze(1);
            }
            case 2 -> {
                for(int i =0; i < Data.size(); i++){
                    System.out.println("==================================");
                    System.out.println("1. NAMA  DAGING >>> " + data_wagyu.get(i).getNama());
                    System.out.println("2. HARGA DAGING >>> " + data_wagyu.get(i).getHarga());
                    System.out.println("3. BERAT DAGING >>> " + data_wagyu.get(i).getBerat());
                    System.out.println("4. JENIS DAGING >>> " + data_wagyu.get(i).getJenis());
                }
                System.out.println("");
                freeze(1);
            }
            default -> {
                System.out.println("=====================");
                System.out.println("  Pilihan tidak ada  ");
                System.out.println("=====================");
            }
        }
        
    }
    static void update(){
        System.out.println("=====================");
        System.out.println("1. Lihat daging biasa");
        System.out.println("2. Lihat daging wagyu");
        System.out.println("=====================");
        System.out.print("Masukkan pilihan anda >> "); int pilih = input.nextInt();
        switch (pilih){
            case 1 -> {
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
                        freeze(1);
                    }
                }
            }
            case 2 -> {
                System.out.print("Masukkan nama daging >>> ");
                String nama_daging = input.next();
                for(int i = 0; i < data_wagyu.size();  i++){
                    if(data_wagyu.get(i).merek_daging.equals(nama_daging)){
                        System.out.print("Masukkan nama daging baru >> ");
                        Data.get(i).setNama(input.next());
                        System.out.print("Masukkan harga daging baru >> ");
                        Data.get(i).setHarga(input.nextInt());
                        System.out.print("Masukkan berat daging baru >> ");
                        Data.get(i).setberat(input.nextFloat());                
                        freeze(1);
                    }
                }
            }
            default -> {
                System.out.println("=====================");
                System.out.println("  Pilihan tidak ada  ");
                System.out.println("=====================");
            }
        }
        
    }
    static void hapus(){
         System.out.println("=====================");
        System.out.println("1. Lihat daging biasa");
        System.out.println("2. Lihat daging wagyu");
        System.out.println("=====================");
        System.out.print("Masukkan pilihan anda >> "); int pilih = input.nextInt();
        switch(pilih){
            case 1 -> {
                System.out.print("Masukkan nama daging >>> ");String nama_daging = input.next();
                for(int i = 0; i < Data.size();  i++){
                    if(Data.get(i).merek_daging.equals(nama_daging)){
                        Data.remove(i);
                    }
                }
            }
            case 2 -> {
                System.out.print("Masukkan nama daging >>> ");String nama_daging = input.next();
                for(int i = 0; i < data_wagyu.size();  i++){
                    if(data_wagyu.get(i).merek_daging.equals(nama_daging)){
                        data_wagyu.remove(i);
                    }
                }
            }
        }
        
    }
    
}
