/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan3.bai3;

/**
 *
 * @author QUANG
 */
public class lapTrinhVien {
    // access Modifier
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    String Address; // =  default: truy cập trong nội bộ package
    protected String ngonNgu; // thang phan goi trong lop con
    public  String chuyenNganh;
    
    public void code(String lang){
        
    }
        
  
    
    
}
