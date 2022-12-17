/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class MainKendaraan extends Kendaraan {

    @Override
    public void jalankan() {
        System.out.println("Matic");
 
    }
    public String getMesin() {
        return super.getMesin(); 
    }

    public void setMesin(String mesin) {
            System.out.println("Besar mesin :"+mesin);
 
    }
    
    public static void main(String[]args){
       //
       MainKendaraan mainKendaraan = new MainKendaraan();
        mainKendaraan.setMesin("150 cc");
        System.out.println(mainKendaraan.getMesin());
    }
    
}
