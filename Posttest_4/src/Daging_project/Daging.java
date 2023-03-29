package posttest_3;

import static posttest_3.Main.data_wagyu;

public class Daging {
    int harga_daging;
    String merek_daging;
    Float berat_daging;
    Daging(int harga, String merk, float berat){
        this.berat_daging = berat;
        this.harga_daging = harga;
        this.merek_daging = merk;
    }
    void display(){
        System.out.println("==================================");
        System.out.println("1. NAMA  DAGING >>> " + this.merek_daging);
        System.out.println("2. HARGA DAGING >>> " + this.harga_daging);
        System.out.println("3. BERAT DAGING >>> " + this.berat_daging);
    }
    public void setberat(float berat){
        this.berat_daging = berat;
    }
    public void setHarga(int harga){
        this.harga_daging = harga;
    }
    
    public void setNama(String nama){
        this.merek_daging = nama;
    }
    public String getNama(){
        return merek_daging;
    }
    public int getHarga(){
        return harga_daging;
    }
    public float getBerat(){
        return berat_daging;
    }
}
