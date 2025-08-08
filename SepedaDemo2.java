/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sepeda;

/**
 *
 * @author danis
 */
public class SepedaDemo2 {
    public static void main(String[] args) {
        Sepeda2 s1 = new Sepeda2();
        s1.kode="5001"; s1.merek="Polygon"; s1.jenis="XC"; s1.kecepatan=0;
        s1.gigi=0;
        s1.start();
        s1.tambahKecepatan(15); s1.kurangKecepatan(3);
        s1.tampilData();
        Sepeda2 s2 = new Sepeda2(2);
        s2.tampilData();
        Sepeda2 s3 = new Sepeda2(4, 25);
        s3.tampilData();
    }
}
