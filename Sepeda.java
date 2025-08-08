/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sepeda;

/**
 *
 * @author danis
 */
public class Sepeda {
    public String kode;
    protected String merek;
    String jenis;
    public float kecepatan;
    public int gigi;
    public void start(){
        gigi = 1; kecepatan = 0;
    }
    
    private void kurangiGigi(){
        gigi--;
    }
    
    private void tambahGigi(){
        gigi++;
    }
    public void tambahKecepatan(float v){
        kecepatan +=v;
        if (v>10) {
            tambahGigi();
        }
    }
    public void kurangKecepatan(float v){
        kecepatan -=v;
        if (v>5.5) {
            kurangiGigi();
        }
    }
    public void stop(){
        kecepatan = 0; gigi = 0;
    }
    
    public void tampilData(){
        System.out.println("KODE = "+ kode);
        System.out.println("MEREK = "+ merek);
        System.out.println("JENIS = "+ jenis);
        System.out.println("KECEPATAN = "+kecepatan);
        System.out.println("GIGI = "+gigi);
    }
    
    public static void main(String[] args) {
        Sepeda s1 = new Sepeda();
        s1.kode="5001"; s1.merek="Polygon"; s1.jenis="XC"; s1.kecepatan=0;
        s1.gigi=0;
        s1.start();
        s1.tambahKecepatan(15); s1.kurangKecepatan(3);
        s1.tampilData();
    }
}
