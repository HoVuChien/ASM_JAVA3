/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_java3.KetNoi;

import asm_java3.DoiTuong.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SanPhamKetNoi {
    Connec con;
    public ArrayList<SanPham> getAll(){
    String sql=" select* from SanPham";
    ArrayList<SanPham> list = new ArrayList<>();
        try(Connection conn = con.getConnection();PreparedStatement pst = conn.prepareStatement(sql)) {
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
            Integer id = rs.getInt("id");
            String ma = rs.getString("ma_san_pham");
            String ten = rs.getString("ten_san_pham");
            Integer sl = rs.getInt("so_luong_ton");
            Integer gia = rs.getInt("gia_ban");
            Integer madm = rs.getInt("ma_danh_muc");
            String tt = rs.getString("trang_thai");
            String mau = rs.getString("mau_sac");
            String ngya = rs.getString("ngay_tao");
            SanPham sp = new SanPham(id,ma,ten,sl,gia,madm,tt,mau,ngya);
            list.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();;
        }
    return list;
    }
    public Boolean add(SanPham sp){
     String sql="INSERT INTO SanPham (ma_san_pham, ten_san_pham, so_luong_ton, gia_ban, ma_danh_muc, trang_thai, mau_sac, ngay_tao)" +
"VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        try(Connection conn = con.getConnection();PreparedStatement pst = conn.prepareStatement(sql)) {
           pst.setObject(1, sp.getMaSP());
           pst.setObject(2, sp.getTenSP());
           pst.setObject(3, sp.getSoLuong());
           pst.setObject(4, sp.getGia());
           pst.setObject(5, sp.getMaDmuc());
           pst.setObject(6, sp.getTrangThai());
           pst.setObject(7, sp.getMauSac());
           pst.setObject(8, sp.getNgaytao());
           int kq = pst.executeUpdate();
           return kq>0;
        } catch (Exception e) {
            e.printStackTrace();;
        }
    return false;
    }
    public Boolean dele(String ma){
    String sql="delete SanPham where ma_san_pham=?";
        try(Connection conn = con.getConnection();PreparedStatement pst = conn.prepareStatement(sql)) {
           pst.setObject(1, ma);        
           int kq = pst.executeUpdate();
           return kq>0;
        } catch (Exception e) {
            e.printStackTrace();;
        }
    return false;
    }
    public ArrayList<SanPham> tim(String mas){
     String sql="select* from SanPham where ten_san_pham like '%"+mas+"'";
    ArrayList<SanPham> list = new ArrayList<>();
        try(Connection conn = con.getConnection();PreparedStatement pst = conn.prepareStatement(sql)) {
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
            Integer id = rs.getInt("id");
            String ma = rs.getString("ma_san_pham");
            String ten = rs.getString("ten_san_pham");
            Integer sl = rs.getInt("so_luong_ton");
            Integer gia = rs.getInt("gia_ban");
            Integer madm = rs.getInt("ma_danh_muc");
            String tt = rs.getString("trang_thai");
            String mau = rs.getString("mau_sac");
            String ngya = rs.getString("ngay_tao");
            SanPham sp = new SanPham(id,ma,ten,sl,gia,madm,tt,mau,ngya);
            list.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();;
        }
    return list;
    
    }
}
