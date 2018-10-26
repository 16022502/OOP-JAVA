/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan3;

/**
 *
 * @author QUANG
 */
public class phanSo {

    private int tu;
    private int mau;
    
    public phanSo() {
        
    }

    public int ucln(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0){
            return 1;
        } else {
            while (a != b) {                
                if(a > b) a = a -b;
                else b -=a;
            }
        }
        return a;
    }
    
    public void rutGon(){
        int uc = ucln(tu, mau);
        this.tu = getTu()/uc;
        this.mau = getMau()/uc;
    }

    
    public phanSo(int t, int m){
        this.tu = t;
        this.mau = m;
    }
    
    public phanSo cong( phanSo ps){
        phanSo tong = new phanSo();
        tong.tu = tu* ps.mau + ps.tu * mau;
        tong.mau = mau * ps.mau;
       tong.rutGon();
        return tong;
    }
    
    public phanSo tru( phanSo ps){
        phanSo hieu = new phanSo();
        hieu.tu = tu* ps.mau - ps.tu * mau;
        hieu.mau = mau * ps.mau;
        hieu.rutGon();
        return hieu;
    }
    
    public phanSo nhan( phanSo ps){
        phanSo tich = new phanSo();
        tich.tu = tu * ps.tu;
        tich.mau = mau * ps.mau;
        tich.rutGon();
        return tich;
    }
    
    public phanSo chia( phanSo ps){
        phanSo thuong = new phanSo();
        thuong.tu = tu * ps.mau;
        thuong.mau = mau * ps.tu;
       thuong.rutGon();
        return thuong;
    }
    
    public boolean equals(phanSo ps){
       ps.rutGon();
        if( tu * ps.mau == ps.tu * mau) return true;
        else return false;
    }
    
    public void print( ){
        System.out.println(tu +"/" + mau);
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    
    public static void main(String[] args) {
        phanSo ps1 = new phanSo(1, 2);
        phanSo ps2 = new phanSo(3, 5);
        
        (ps1.cong(ps2)).print();
        (ps1.tru(ps2)).print();
        (ps1.nhan(ps2)).print();
        (ps1.chia(ps2)).print();
        
        if(ps1.equals(ps2)) {
            System.out.println("ps1 = ps2");
        }else System.out.println("ps1 != ps2");
            
        
    }
    
}
