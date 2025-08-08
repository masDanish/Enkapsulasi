/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sepeda;

/**
 *
 * @author danis
 */
public class SepedaDemo3 {
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
