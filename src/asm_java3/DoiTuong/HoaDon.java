/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_java3.DoiTuong;

/**
 *
 * @author Admin
 */
public class HoaDon {
     private int id;
    private String maHD,ngayTao,ten;
    private int idKH;
    private float tongTien;
    private String trangThai;
    private int idNV;

    public HoaDon() {
    }

    public HoaDon(int id, String maHD, String ngayTao, String ten, int idKH, float tongTien, String trangThai, int idNV) {
        this.id = id;
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.ten = ten;
        this.idKH = idKH;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
        this.idNV = idNV;
    }
   public HoaDon( String maHD, String ngayTao, String ten, int idKH, float tongTien, String trangThai, int idNV) {
   
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.ten = ten;
        this.idKH = idKH;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
        this.idNV = idNV;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getIdKH() {
        return idKH;
    }

    public void setIdKH(int idKH) {
        this.idKH = idKH;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getIdNV() {
        return idNV;
    }

    public void setIdNV(int idNV) {
        this.idNV = idNV;
    }
   
}
