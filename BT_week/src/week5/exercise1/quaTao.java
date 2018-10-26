/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.exercise1;

import java.util.Date;

/**
 *
 * @author QUANG
 */
public class quaTao extends hoaQua{
    // thuoc tinh
    private double doNgot;
    
    // phuong thuc khoi tao

    public quaTao() {
        System.out.println("Circle constructor");
    }
    


    public quaTao(double doNgot) {
        this.doNgot = doNgot;
    }

    public quaTao(double doNgot, String source, Date date, int sl, boolean st) {
        super(source, date, sl, st);
        this.doNgot = doNgot;
    }
    
        // phuong thuc get set

//    public double getDoNgot() {
//        return doNgot;
//    }
//
//    public void setDoNgot(double doNgot) {
//        this.doNgot = doNgot;
//    }

     double getDoNgot() {
        return doNgot;
    }

    public void setDoNgot(double doNgot) {
        this.doNgot = doNgot;
    }

    public String getNguonGocXuatXu() {
        return nguonGocXuatXu;
    }

    public void setNguonGocXuatXu(String nguonGocXuatXu) {
        this.nguonGocXuatXu = nguonGocXuatXu;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    
    
}
