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
public class hoaQua {
    // instance variables
    protected String nguonGocXuatXu;
    protected Date ngayNhap;
    protected int soLuong;
    protected boolean status;
    
    // constructor method
    public hoaQua(){
        this.nguonGocXuatXu = "";
        this.ngayNhap = null;
        this.soLuong = 0;
        this.status = true;
        System.out.println("Point constructor");
    }
    
    public hoaQua(String source, Date date, int sl, boolean  st){
        this.nguonGocXuatXu = source;
        this.ngayNhap = date;
        this.soLuong = sl;
        this.status = st;
    }
    // Get Set method
    protected String getNguonGocXuatXu() {
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
