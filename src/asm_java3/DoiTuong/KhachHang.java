/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_java3.DoiTuong;

/**
 *
 * @author Admin
 */
public class KhachHang {
     private int id;
    private String maKH,hoTen,daiChi;
    private int namsinh;
    private String gioiTinh;

    public KhachHang() {
    }
public KhachHang(int id,String maKH, String hoTen, String daiChi, int namsinh, String gioiTinh) {
          this.id=id; 
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.daiChi = daiChi;
        this.namsinh = namsinh;
        this.gioiTinh = gioiTinh;
    }
    public KhachHang(String maKH, String hoTen, String daiChi, int namsinh, String gioiTinh) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.daiChi = daiChi;
        this.namsinh = namsinh;
        this.gioiTinh = gioiTinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDaiChi() {
        return daiChi;
    }

    public void setDaiChi(String daiChi) {
        this.daiChi = daiChi;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
}
