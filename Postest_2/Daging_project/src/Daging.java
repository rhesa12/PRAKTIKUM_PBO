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
    public String getNama(){
        return merek_daging;
    }
    public int getHarga(){
        return harga_daging;
    }
    public String getJenis(){
        return jenis_daging;
    }
    public float getBerat(){
        return berat_daging;
    }
}
