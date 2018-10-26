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
public class quaCam extends hoaQua {
    // instance variables

    protected double hamLuongVitaminC;

    // constructor method
    public quaCam() {
        this.hamLuongVitaminC = 0;
    }
//    
//    public quaCam(double vC) {
//        this.hamLuongVitaminC = vC;
//    }

    public quaCam(double hamLuongVitaminC) {
        this.hamLuongVitaminC = hamLuongVitaminC;
    }
    
    
    
    
    
    // get + set method

    public double getHamLuongVitaminC() {
        return hamLuongVitaminC;
    }

    public void setHamLuongVitaminC(double hamLuongVitaminC) {
        this.hamLuongVitaminC = hamLuongVitaminC;
    }

    @Override
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

    @Override
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
