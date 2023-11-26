/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_java3.KetNoi;

import asm_java3.DoiTuong.HDCT;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class BanHangKetNoi {
    Connec con;
    public ArrayList<HDCT> getall(){
    String sql = "select * from HoaDonChiTiet";
    ArrayList<HDCT> list = new ArrayList<>();
    try(Connection connec = con.getConnection(); PreparedStatement pst = connec.prepareStatement(sql)){
    ResultSet rs = pst.executeQuery();
    while(rs.next()){
    Integer id = rs.getInt("id");
    Integer idhd = rs.getInt("id_hoa_don");
    Integer idsp = rs.getInt("id_san_pham");
    Integer sl = rs.getInt("so_luong");
    Integer gia = rs.getInt("don_gia");
    Date ngay = rs.getDate("ngay_tao");
    String ten = rs.getString("ten_san_pham");
    HDCT hdct = new HDCT(id,idhd,idsp,sl,gia,ngay,ten);
    list.add(hdct);
    
    }
    }catch(Exception ex){
    ex.printStackTrace();;
    }
    return list;
    }
    public Boolean add(HDCT hd){
    String sql = "insert into HoaDonChiTiet values(?,?,?,?,?,?)";
    try(Connection connec = con.getConnection(); PreparedStatement pst = connec.prepareStatement(sql)){
   
    pst.setObject(1, hd.getIdhd());
    pst.setObject(2, hd.getIdsp());
    pst.setObject(3, hd.getSl());
    pst.setObject(4, hd.getGia());
    pst.setObject(5, hd.getNgaytao());
    pst.setObject(6, hd.getGia());   
    pst.setObject(6, hd.getTensp());
    int kq = pst.executeUpdate();
    return kq>0;
    }catch(Exception ex){
    ex.printStackTrace();;
    }
    return false;
    }
    public ArrayList<HDCT> tim(int idi){
     String sql = "select * from HoaDonChiTiet where id_hoa_don ="+idi;
    ArrayList<HDCT> list = new ArrayList<>();
    try(Connection connec = con.getConnection(); PreparedStatement pst = connec.prepareStatement(sql)){
    ResultSet rs = pst.executeQuery();
    while(rs.next()){
    Integer id = rs.getInt("id");
    Integer idhd = rs.getInt("id_hoa_don");
    Integer idsp = rs.getInt("id_san_pham");
    Integer sl = rs.getInt("so_luong");
    Integer gia = rs.getInt("don_gia");
    Date ngay = rs.getDate("ngay_tao");
    String ten = rs.getString("ten_san_pham");
    HDCT hdct = new HDCT(id,idhd,idsp,sl,gia,ngay,ten);
    list.add(hdct);
    
    }
    }catch(Exception ex){
    ex.printStackTrace();;
    }
    return list;

    
    }
}
