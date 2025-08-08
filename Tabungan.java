/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testabungan;

/**
 *
 * @author danis
 */
public class Tabungan {
    public int saldo;
    public Tabungan(int s){
        saldo = s;
    }
    
    int getSaldo(){
        return saldo;
    }
   
    public void simpanUang(int jumlah){
        saldo = jumlah + saldo;
    }
    
    public boolean ambilUang(int j){
        if(j <= saldo){
            saldo = saldo - j;
            return true;
            
        } else {
            return false;
        }
    }
}
