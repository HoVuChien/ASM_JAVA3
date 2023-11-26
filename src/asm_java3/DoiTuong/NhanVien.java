/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_java3.DoiTuong;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private int id;
    private  String maNV,hoTen,goiitinh;
    private String namSinh;
    private  String diaChi;

    public NhanVien() {
    }

    public NhanVien(int id, String maNV, String hoTen, String goiitinh, String namSinh, String diaChi) {
        this.id = id;
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.goiitinh = goiitinh;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }
  public NhanVien( String maNV, String hoTen, String goiitinh, String namSinh, String diaChi) {
        
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.goiitinh = goiitinh;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGoiitinh() {
        return goiitinh;
    }

    public void setGoiitinh(String goiitinh) {
        this.goiitinh = goiitinh;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
  
}
