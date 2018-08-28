/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudiKasusKonsepInheritance;

/**
 *
 * @author ZIDANE
 */
public class barang {
    public String nama_brg,merk_barang,id_brg,harga_brg;
    
    public barang(String id_brg,String harga_brg, String nama_brg,String merk_brg){
        this.id_brg = id_brg;
        this.harga_brg = harga_brg;
        this.nama_brg = nama_brg;
        this.merk_barang = merk_brg;
    }
    
    public void info(){
        System.out.println("ID Barang     : "+this.id_brg);
        System.out.println("Harga Barang  : "+this.harga_brg);
        System.out.println("Nama Barang   : "+this.nama_brg);
        System.out.println("Merk Barang   : " +this.merk_barang);
        System.out.println("===============");
    }
}
