/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan26.waktusaatini;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 *
 * @author lenovo
 */
public class PBO310117122Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
     private String getTanggal() {
        DateFormat dateFormat = new SimpleDateFormat("E, dd MM yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    private String getWaktu() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PBO310117122Latihan26WaktuSaatIni tgl = 
                new PBO310117122Latihan26WaktuSaatIni();
        System.out.println("Hari ini adalah hari : "+tgl.getTanggal() + " " 
                + tgl.getWaktu());
       
    } 
}
