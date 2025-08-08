/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sepeda;

/**
 *
 * @author danis
 */
public class Sepeda3 {
    public String kode;
    protected String merek;
    String jenis;
    public float kecepatan;
    public int gigi;
    public static int jumTotalSepeda;
    public Sepeda3(){
        System.out.println("Objek terbentuk menggunakan konstruktor default");
        kode = merek = jenis ="KOSONG";
        kecepatan = gigi = 0;
    }
    public Sepeda3(int g){
        System.out.println("Objek terbentuk menggunakan konstruktor berparameter 1");
        kode = merek = jenis ="KOSONG";
        kecepatan = 0;
        gigi = g;
    }
    public Sepeda3(int g,float v){
        System.out.println("Objek terbentuk menggunakan konstruktor berparameter 2");
        kode = merek = jenis ="KOSONG";
        kecepatan = v;
        gigi = g;
    }
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
    
    public static void tambahJumTotalSepeda(){
        jumTotalSepeda++;
    }
    
    public static void main(String[] args) {
        Sepeda3 s1 = new Sepeda3();
        Sepeda3.tambahJumTotalSepeda();
        s1.kode="5001"; s1.merek="Polygon"; s1.jenis="XC"; s1.kecepatan=0;
        s1.gigi=0;
        s1.start();
        s1.tambahKecepatan(15); s1.kurangKecepatan(3);
        s1.tampilData();
        Sepeda3 s2 = new Sepeda3(2);
        Sepeda3.tambahJumTotalSepeda();
        s2.tampilData();
        Sepeda3 s3 = new Sepeda3(4, 25);
        Sepeda3.tambahJumTotalSepeda();
        s3.tampilData();
        System.out.println("Jumlah tottal objek sepeda yang dibuat = "+Sepeda3.jumTotalSepeda);
        
    }
}
