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
public class DanhMucKetNoi {

    Connec con;

    public ArrayList<DanhMuc> getAll() {
        String sql = " select * from DanhMuc";
        ArrayList<DanhMuc> list = new ArrayList<>();
        try (Connection conn = con.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String ma = rs.getString("ma");
                String ten = rs.getString("ten_danh_muc");
                DanhMuc dm = new DanhMuc(id,ma, ten);
                list.add(dm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Boolean add(DanhMuc dm) {
        String sql = "  INSERT INTO DanhMuc (ma, ten_danh_muc)"+"VALUES(?, ?)";
        try (Connection conn = con.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setObject(1, dm.getMaDanhMuc());
            pst.setObject(2, dm.getTenDanhMuc());
            int kq = pst.executeUpdate();
            return kq>0;
        
    }
    catch(Exception e){      
    e.printStackTrace();
    }
    return false;
}
    public Boolean delete(String ma){
     String sql = "delete DanhMuc where ma=?";
        try (Connection conn = con.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setObject(1, ma);          
            int kq = pst.executeUpdate();
            return kq>0;
        
    }
    catch(Exception e){      
    e.printStackTrace();
    }
    return false;
    }
    public ArrayList<DanhMuc> tim(String name){
    String sql = "Select * from DanhMuc where ten_danh_muc like '%"+name+"%'";
        ArrayList<DanhMuc> list = new ArrayList<>();
        try (Connection conn = con.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                    Integer id = rs.getInt("id");
                String ma = rs.getString("ma");
                String ten = rs.getString("ten_danh_muc");
                DanhMuc dm = new DanhMuc(id,ma, ten);
                list.add(dm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
