/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum4;

/**
 *
 * @author user
 */
public class BangunruangBeraksi {
    public static void main(String[] args){
        Bangunruang bgr = new Bangunruang(5);
        Bangunruang bgr1 = new Bangunruang(5,6,7);
        
        System.out.println("volume Kubus : " + bgr.VolumeKubus());
        System.out.println("volume balok : " + bgr.VolumeBalok());
        
        System.out.println(" ");
        
        System.out.println("Luas Permukaan Kubus : " + bgr.LuasPermukaanKubus());
        System.out.println("Luas Permukaan Balok : " + bgr.LuasPermukaanBalok());
    }
}
