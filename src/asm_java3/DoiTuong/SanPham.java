/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_java3.DoiTuong;

/**
 *
 * @author Admin
 */
public class SanPham {
    private int id;
     private String maSP,TenSP;
     private int soLuong,gia,maDm;
     private String trangThai,mauSac,ngaytao;

    public SanPham() {
    }

    public SanPham(int id, String maSP, String TenSP, int soLuong, int gia, int maDm, String trangThai, String mauSac, String ngaytao) {
        this.id = id;
        this.maSP = maSP;
        this.TenSP = TenSP;
        this.soLuong = soLuong;
        this.gia = gia;
        this.maDm = maDm;
        this.trangThai = trangThai;
        this.mauSac = mauSac;
        this.ngaytao = ngaytao;
    }
  public SanPham( String maSP, String TenSP, int soLuong, int gia, int maDm, String trangThai, String mauSac, String ngaytao) {
       
        this.maSP = maSP;
        this.TenSP = TenSP;
        this.soLuong = soLuong;
        this.gia = gia;
        this.maDm = maDm;
        this.trangThai = trangThai;
        this.mauSac = mauSac;
        this.ngaytao = ngaytao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getMaDmuc() {
        return maDm;
    }

    public void setMaDm(int maDm) {
        this.maDm = maDm;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    @Override
    public String toString() {
        return"id=" + id + ", maSP=" + maSP + ", TenSP=" + TenSP + ", soLuong=" + soLuong + ", gia=" + gia + ", maDm=" + maDm + ", trangThai=" + trangThai + ", mauSac=" + mauSac + ", ngaytao=" + ngaytao ;
    }

   

    
  
}
