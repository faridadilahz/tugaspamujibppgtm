/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pengenalanClass;

/**
 *
 * @author FARID
 */
public class MainApp {

    public static void main(String[] args) {
        Hewan anjing = new Hewan();
        anjing.jenisKelamin = "Jantan";
        anjing.umur = 5;
        anjing.warnaBulu = "Cokelat";
        System.out.println("Anjing " + anjing.jenisKelamin + " berumur "
                + anjing.umur + " tahun berbulu " + anjing.warnaBulu);

//cara memanggi prosedur
        anjing.memakan();
        System.out.println(anjing.melompat("kursi"));
    }
}
