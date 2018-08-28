/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author ZIDANE
 */
class Matpel {
    private String nama;
    private int nilai;
    
    public Matpel(String nama,int nilai){
        this.nama = nama;
        this.nilai = nilai;
    }
    
    public void info(){
        System.out.println("Nama Mapel : "+this.nama);
        System.out.println("Nilai      : "+this.nilai);
    }
    
    
}
