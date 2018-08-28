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
 class superclass extends Matpel {
    private String nama_guru;
    
    public superclass(String nama_guru, String nama, int nilai)
    {
        super(nama, nilai);
        this.nama_guru = nama_guru;
    }
    
    public void info()
    {
        System.out.println("Nama Guru  : "+this.nama_guru);
        super.info();
    }
    
    
}
