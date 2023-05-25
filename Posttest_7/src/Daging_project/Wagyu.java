package Daging_project;

public class Wagyu extends Daging{
    private final String jenis;
    Wagyu(int harga, String merk, float berat , String jenis){
        super(harga, merk, berat);
        this.jenis = jenis;
    }
    
    public final String getJenis(){
        return jenis;
    }
    @Override
    public void display(){
        System.out.println("==================================");
        System.out.println("1. NAMA  DAGING >>> " + this.merek_daging);
        System.out.println("2. HARGA DAGING >>> " + this.harga_daging);
        System.out.println("3. BERAT DAGING >>> " + this.berat_daging);
        System.out.println("4. JENIS DAGING >>> " + this.jenis);
    }
    
    public void dsp(){
        System.out.println("==================================");
        System.out.println("1. NAMA  DAGING >>> " + this.merek_daging);
        System.out.println("2. HARGA DAGING >>> " + this.harga_daging);
        System.out.println("3. BERAT DAGING >>> " + this.berat_daging);
    }
    public void display(boolean show){
        if(show) display();
        else dsp();
    }
}
