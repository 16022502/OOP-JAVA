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
public class camCaoPhong extends quaCam{
    // thuoc tinh
    private String dacDiem;
    private double doChua;
    
    // phuong thuc khoi tao

  public  camCaoPhong(double hamLuongVitaminC ) {
        super(hamLuongVitaminC);
        this.dacDiem = "";
        this.doChua = 0;
    }
    
    // set and get method

    public String getDacDiem() {
        return dacDiem;
    }

    public void setDacDiem(String dacDiem) {
        this.dacDiem = dacDiem;
    }

    public double getDoNgot() {
        return doChua;
    }

    public void setDoNgot(double doChua) {
        this.doChua = doChua;
    }

    public double getHamLuongVitaminC() {
        return hamLuongVitaminC;
    }

    public void setHamLuongVitaminC(double hamLuongVitaminC) {
        this.hamLuongVitaminC = hamLuongVitaminC;
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
