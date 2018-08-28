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
class pembeli extends barang{
    public String nama_pembeli, alamat, nama_kasir,tanggal,no_telp,id_pembeli;
    
    public pembeli(String id_pembeli,String no_telp, String nama_pembeli,String alamat,String id_brg, String harga_brg,String nama_brg,String merk_brg,String tanggal,String nama_kasir){
        super(id_brg,harga_brg,nama_brg,merk_brg);
        this.id_pembeli = id_pembeli;
        this.no_telp = no_telp;
        this.nama_pembeli = nama_pembeli;
        this.alamat = alamat;
        this.nama_kasir = nama_kasir;
        this.tanggal = tanggal;
    }
    public void info(){
        System.out.println("ID Pembeli    : "+this.id_pembeli);
        System.out.println("Nomor Telepon : "+this.no_telp);
        System.out.println("Nama Pembeli  : "+this.nama_pembeli);
        System.out.println("Alamat        : "+this.alamat);
        System.out.println("================");
        System.out.println("Nama Kasir    : "+this.nama_kasir);
        System.out.println("Tanggal       : "+this.tanggal);
        System.out.println("================");
        super.info();
       
    }
    
    
}
