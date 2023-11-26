/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_java3.QuanLy;

import asm_java3.DoiTuong.*;
import asm_java3.KetNoi.BanHangKetNoi;
import asm_java3.KetNoi.HoaDonKetNoi;
import asm_java3.KetNoi.SanPhamKetNoi;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QLBanHang {
    HoaDonKetNoi knHD = new HoaDonKetNoi();
    SanPhamKetNoi KNSP = new SanPhamKetNoi();
    BanHangKetNoi bh = new BanHangKetNoi();
    public ArrayList<HoaDon> getHd(){
    return knHD.getAll();
    }
    public ArrayList<SanPham> getSP(){
    return KNSP.getAll();
    }
    public ArrayList<HDCT> gethdct(){
    return bh.getall();
    }
    public String add(HDCT hd){
        if (bh.add(hd)==true) {
            return "Them thanh Cong";
        } else {
             return "Them that BAi";
        }
    }
    public ArrayList<HDCT> tim(int id){
        
    
      ArrayList<HDCT> list = bh.tim(id);
       return  list;
    }
}
