package pengenalanClass;

public class Hewan {

    public String jenisKelamin;
    public int umur;
    public String warnaBulu;
//constructor default

    public Hewan() {
    }
//constructor dengan parameter

    public Hewan(String jenisKelamin, int umur, String warnaBulu) {
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
        this.warnaBulu = warnaBulu;
    }
    
    public void memakan() {
        System.out.println("Anjing sedang memakan daging.");
    }
    
    public String melompat(String parameter) {
        String perilaku = "Anjing melompati " + parameter + ".";
        return perilaku;
    }

    
}
