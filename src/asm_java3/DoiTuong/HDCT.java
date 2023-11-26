/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_java3.DoiTuong;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class HDCT {
    private int id,idhd,idsp,sl,gia;
    private Date ngaytao;
    private String tensp;

    public HDCT() {
    }

    public HDCT(int id, int idhd, int idsp, int sl, int gia, Date ngaytao, String tensp) {
        this.id = id;
        this.idhd = idhd;
        this.idsp = idsp;
        this.sl = sl;
        this.gia = gia;
        this.ngaytao = ngaytao;
        this.tensp = tensp;
    }
    public HDCT( int idhd, int idsp, int sl, int gia, Date ngaytao, String tensp) {
        
        this.idhd = idhd;
        this.idsp = idsp;
        this.sl = sl;
        this.gia = gia;
        this.ngaytao = ngaytao;
        this.tensp = tensp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdhd() {
        return idhd;
    }

    public void setIdhd(int idhd) {
        this.idhd = idhd;
    }

    public int getIdsp() {
        return idsp;
    }

    public void setIdsp(int idsp) {
        this.idsp = idsp;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }
    
}
