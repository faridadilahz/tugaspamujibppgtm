///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package proyekbaru;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author FARID
// */
//public class ProyekBaru {
//
//    private static int pertanyaan;
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) throws IOException {
//        // TODO code application logic here
//        //A. CLASS SCANNER
////        System.out.println("Hallo" + " " + "Dunia");
////        System.out.println(2 + " " + 5);
////        System.out.println(2 + 5);
////        System.out.println("Angka" + " " + 5);
////        System.out.println("2+5" + "=" + 2 + 5);
////        System.out.println("2+5" + "=" + (2 + 5));
////        System.out.println("");
////        String namaDepan = "";
////        String namaBelakang = "";
////        Scanner input = new Scanner(System.in);
////        System.out.println("Nama Depan : ");
////        //membaca inputan user
////        namaDepan = input.next();
////        System.out.println("Nama Belakang : ");
////        //membaca inputan user
////        namaBelakang = input.next();
////        System.out.println("Nama Saya adalah :");
////        System.out.println(namaDepan + " " + namaBelakang);
////        System.out.println("");
//
//        //B. CLASS BUFFEREADER
////            String namaDepan = "";
////            String namaBelakang = "";
////
////            //buat objek dari inputStream
////            InputStreamReader ireader
////                    = new InputStreamReader(System.in);
////            //buat objek bufferreader
////            BufferedReader breader
////                    = new BufferedReader(ireader);
////
////            System.out.println("Nama Depan: ");
////            //membaca inputan user
////            namaDepan
////                    = breader.readLine();
////            System.out.println("Nama Belakang : ");
////
////            //membaca inputan user
////            namaBelakang
////                    = breader.readLine();
////            System.out.println("Nama Saya Adalah :");
////            System.out.println(namaDepan + " " + namaBelakang);
////            System.out.println();
//// 3. Class Joption Pane
////        String nama
////                = JOptionPane.showInputDialog("Masukkan Nama: ");
////        System.out.println("Nama : " + nama);
////        String a
////                = JOptionPane.showInputDialog("Masukkan nilai untuk variabel a : ");
////        String b
////                = JOptionPane.showInputDialog("Masukkan nilai untuk variabel b : ");
////        System.out.println("Hasil :" + Integer.parseInt(b) * (Integer.parseInt(a)));
////        System.out.println();
//        //D. METHOD SHOWMESSAGE DIALOG
////        String nama = "Budi";
////        String jurusan = "Sistem Informasi";
////        JOptionPane.showMessageDialog(null, "Halo " + nama + ",jurusan Kamu " + jurusan);
////        System.out.println();
//        //a. JOptionPane.INFORMATION_MESSAGE
////        JOptionPane.showMessageDialog(null, "Sebuah Informasi.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
////b. JOptionPane.ERROR_MESSAGE
////        JOptionPane.showMessageDialog(null, "Sebuah Error!", "Error!", JOptionPane.ERROR_MESSAGE);
//        //c. JOptionPane.WARNING_MESSAGE
////        JOptionPane.showMessageDialog(null, "Sebuah Peringatan.", "Peringatan", JOptionPane.WARNING_MESSAGE);
//        //d. JOptionPane.QUESTION_MESSAGE
////        JOptionPane.showMessageDialog(null, "Sebuah Pertanyaan.", "Pertanyaan", JOptionPane.QUESTION_MESSAGE);
//        //e. JOptionPane.PLAIN_MESSAGE
////        JOptionPane.showMessageDialog(null, "Sebuah Plain Message.", "Plain Message", JOptionPane.PLAIN_MESSAGE);
//        //f. Method ShowConfirmDialog
//        JOptionPane.showConfirmDialog(null, "Pilih Yes atau No?", "Pertanyaan",JOptionPane.YES_NO_OPTION);
//        if(JOptionPane.YES_OPTION == pertanyaan){
//            JOptionPane.showMessageDialog(null, "Kamu memilih Yes.");
//        }else if(JOptionPane.NO_OPTION == pertanyaan){
//            JOptionPane.showMessageDialog(null, "Kamu memilih No.");
//        }
//    }
//}
