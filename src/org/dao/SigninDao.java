package org.dao;

/**
 * Created by wcy on 2016/4/9.
 */

import org.db.DBconn;
import org.model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SigninDao {
    Connection conn;
    public Login checkUser(String username, String password){
        try{
            conn=DBconn.getConn();
            PreparedStatement ps=conn.prepareStatement("select * from [userinfo] where username=?"+" and password=?");
            ps.setString(1,username);
            ps.setString(2,password);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                Login user=new Login();
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setRoot(rs.getInt(4));
                return user;
            }
            return null;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            DBconn.CloseConn();
        }
    }
    public boolean insertUser(String username,String password,int root){
        try{
            conn=DBconn.getConn();
            PreparedStatement ps=conn.prepareStatement("select * from [userinfo] where username=?");
            ps.setString(1,username);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                return false;
            }
            PreparedStatement ps1=conn.prepareStatement("insert into [userinfo](username,password,root) values (?,?,?)");
            ps1.setString(1,username);
            ps1.setString(2,password);
            ps1.setInt(3,root);
            ps1.executeUpdate();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {
            DBconn.CloseConn();
        }
    }
    public boolean addLy(int userId,String title,String content){
        try{
            conn=DBconn.getConn();
            PreparedStatement ps=conn.prepareStatement("insert into [LyTable](userId,title,arcontent,lydate) values (?,?,?,getDate())");
            ps.setInt(1,userId);
            ps.setString(2,title);
            ps.setString(3,content);
            ps.executeUpdate();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {
            DBconn.CloseConn();
        }
    }
    public List all(){
        try{
            List list=new ArrayList();
            conn=DBconn.getConn();
            PreparedStatement ps=conn.prepareStatement("select x.id,y.username,x.title,x.arcontent,x.lydate from [LyTable] as x,[userinfo] as y " +
                    "where x.userId=y.id ");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Result result=new Result();
                result.setId(rs.getInt(1));
                result.setUsername(rs.getString(2));
                result.setTitle(rs.getString(3));
                result.setContent(rs.getString(4));
                result.setDate(rs.getTimestamp(5));
                list.add(result);
            }
            return list;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            DBconn.CloseConn();
        }
    }
    public List person(int userId){
        try{
            List list=new ArrayList();
            conn=DBconn.getConn();
            PreparedStatement ps=conn.prepareStatement("select x.id,y.username,x.title,x.arcontent,x.lydate from [LyTable] as x,[userinfo] as y " +
                    "where x.userId=y.id and x.userId=?");
            ps.setInt(1,userId);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Result result=new Result();
                result.setId(rs.getInt(1));
                result.setUsername(rs.getString(2));
                result.setTitle(rs.getString(3));
                result.setContent(rs.getString(4));
                result.setDate(rs.getTimestamp(5));
                list.add(result);
            }
            return list;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            DBconn.CloseConn();
        }
    }
    public Result details(int id){
        try{
            conn=DBconn.getConn();
            PreparedStatement ps=conn.prepareStatement("select x.id,y.username,x.title,x.arcontent,x.lydate from [LyTable] as x,[userinfo] as y " +
                    "where x.userId=y.id and x.id=?");
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            Result result=new Result();
            if(rs.next()){
                result.setId(rs.getInt(1));
                result.setUsername(rs.getString(2));
                result.setTitle(rs.getString(3));
                result.setContent(rs.getString(4));
                result.setDate(rs.getTimestamp(5));
            }
            return result;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            DBconn.CloseConn();
        }
    }
    public boolean exist(String title){
        try{
            conn=DBconn.getConn();
            PreparedStatement ps=conn.prepareStatement("select * from [LyTable] where title=?");
            ps.setString(1,title);
            ResultSet rs=ps.executeQuery();
            Result result=new Result();
            if(rs.next()){
               return false;
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {
            DBconn.CloseConn();
        }
    }
}
