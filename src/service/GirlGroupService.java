package service;

import DB.DBConn;
import dto.GirlDto;
import main.GirlGroupMain;
import view.UserView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class GirlGroupService {


    public int insertData(GirlDto dto){
        int result = 0;
        Connection conn = DBConn.getConnection();
        PreparedStatement pstmt = null;
        String sql;
        try{
            sql = "insert into girlgroup(g_id, g_name, debut, e_name) values (?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, dto.getGirlId());
            pstmt.setString(2, dto.getGirlName());
            pstmt.setString(3, dto.getDebut());
            pstmt.setString(4,dto.getEnterName());
            result = pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return result;
    }
    public int updateData(GirlDto dto){
        int result = 0;
        Connection conn = DBConn.getConnection();
        PreparedStatement pstmt = null;
        String sql;
        try{
            sql = "update telbook set g_id=?, g_name=?, debut?, e_name=? where g_id=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, dto.getGirlId());
            pstmt.setString(2, dto.getGirlName());
            pstmt.setString(3, dto.getDebut());
            pstmt.setString(4,dto.getEnterName());
            result = pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return result;
    }
    public int deleteData(int g_id){
        int result = 0;
        Connection conn = DBConn.getConnection();
        PreparedStatement pstmt = null;
        String sql;
        try{
            sql = "delete from telbook where id=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, g_id);
            result = pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return result;
    }
    public List<GirlDto> getListAll(){
        List<GirlDto> dtoList = new ArrayList<>();
        Connection conn = DBConn.getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql;
        try{
            sql = "select * from telbook order by g_name";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()){
                GirlDto dto = new GirlDto();
                dto.setGirlId(rs.getInt("g_id"));
                dto.setGirlName(rs.getString("g_name"));
                dto.setDebut(rs.getString("debut"));
                dto.setEnterName(rs.getString("e_name"));

                dtoList.add(dto);
            }
            rs.close();
            pstmt.close();
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return dtoList;
    }
    public List<GirlDto> getListOne(int g_id) {
        List<GirlDto> dtoList = new ArrayList<>();
        Connection conn = DBConn.getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql;
        try {
            sql = "select * from telbook where g_id=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, g_id);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                GirlDto dto = new GirlDto();
                dto.setGirlId(rs.getInt("g_id"));
                dto.setGirlName(rs.getString("g_name"));
                dto.setDebut(rs.getString("debut"));
                dto.setEnterName(rs.getString("e_name"));
                dtoList.add(dto);
            }
            rs.close();
            pstmt.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return dtoList;
    }
}
