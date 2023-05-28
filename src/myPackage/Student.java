package myPackage;

import java.sql.*;

public class Student {
    public void createDatabase(){
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String userName = "root";
            String password = "makemake";
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, userName, password);
            Statement stm = conn.createStatement();
            String query = "create database DB";
            System.out.println("Database created successfully : ");
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public void createTable() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String db = "DB";
            String userName = "root";
            String password = "mak44ema44ke";
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url+db, userName, password);
            Statement stm = conn.createStatement();
            String query = "create Table student (sid int(3), sname varchar(200), semail varchar(200))";
            stm.execute(query);
            System.out.println("Table created successfully : ");
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void createData() {

        try {
            String url = "jdbc:mysql://localhost:3306/";
            String db = "DB";
            String userName = "root";
            String password = "mak44ema44ke";
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url+db, userName, password);
            String query = "insert into student (sid, sname, semail) VALUES (?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1,5);
            pstm.setString(2, "shailesh");
            pstm.setString(3,"yadav.3@gmail.com");
            pstm.execute();
            System.out.println("insertion successfully : ");
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public void readData() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String db = "DB";
            String userName = "root";
            String password = "mak44ema44ke";
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url+db, userName, password);
            String query = "select * from student";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next())
            {
                System.out.println("ID : "+rs.getInt(1));
                System.out.println("Name : "+rs.getString(2));
                System.out.println("Email : "+rs.getString(3));
            }

            System.out.println("Done reading successfully : ");
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public void updateData() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String db = "DB";
            String userName = "root";
            String password = "mak44ema44ke";
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url+db, userName, password);
            String query = "update student set sid = ? where sname = ?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1,3);
            pstm.setString(2, "shailesh");
            pstm.execute();
            System.out.println("updation successfully : ");
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void deleteData() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String db = "DB";
            String userName = "root";
            String password = "mak44ema44ke";
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url+db, userName, password);
            String query = "delete from student where sname = ?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1,"shailesh");
            pstm.execute();
            System.out.println("Deleted successfully : ");
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
