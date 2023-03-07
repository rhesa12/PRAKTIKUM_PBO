public class Daging {
    int harga_daging;
    String merek_daging;
    String jenis_daging;
    Float berat_daging;
    Daging(int harga, String merk, String jenis, float berat){
        this.berat_daging = berat;
        this.harga_daging = harga;
        this.jenis_daging = jenis;
        this.merek_daging = merk;
    }

    void tampilan(){
        System.out.println("==================================");
        System.out.println("1. NAMA  DAGING >>> " + this.merek_daging);
        System.out.println("2. HARGA DAGING >>> " + this.harga_daging);
        System.out.println("3. JENIS DAGING >>> " + this.jenis_daging);
        System.out.println("4. BERAT DAGING >>> " + this.berat_daging);
    }

    public void setberat(float berat){
        this.berat_daging = berat;
    }
    public void setHarga(int harga){
        this.harga_daging = harga;
    }
    public void setjenis(String jenis){
        this.jenis_daging = jenis;
    }
    public void setNama(String nama){
        this.merek_daging = nama;
    }
}
