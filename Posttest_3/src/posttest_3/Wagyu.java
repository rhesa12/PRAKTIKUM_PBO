package posttest_3;

public class Wagyu extends Daging{
    private String jenis;
    Wagyu(int harga, String merk, float berat , String jenis){
        super(harga, merk, berat);
        this.jenis = jenis;
    }
        
    public void setjenis(String jenis){
        this.jenis = jenis;
    }
    
     public String getJenis(){
        return jenis;
    }
    
}
