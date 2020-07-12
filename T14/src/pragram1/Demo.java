package pragram1;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.xml.transform.Result;

public class Demo {

	/**
	 * @param args
	 */
	
	public static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String url="jdbc:sqlserver://127.0.0.1:1433;DataBaseName=StudentInfor";
    static Connection con=null;
    static java.sql.Statement sta=null;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreparedStatement pre=null;
		PreparedStatement pre1=null;
		ResultSet rs=null;
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,"sa","123456");
			sta= con.createStatement();
			
			//删除
//			pre=con.prepareStatement("delete from Student where StuID=?");
//			pre.setInt(1, 4);
//			if (pre.executeUpdate()>0) {
//				System.out.println("删除成功！");
//			}
			
			//添加
//			int num=sta.executeUpdate("insert into Student values('王六',20151122245,122345421,21)");
//			if (num>0) {
//				System.out.println("数据添加成功!");
//			}
			
			//查询
			pre=con.prepareStatement("	select* from Student ");
			rs=pre.executeQuery();
			while (rs.next()) {
				rs.getString("StuName");
				rs.getInt("StuAge");
				System.out.println("姓名："+rs.getString("StuName")+"\t"+"年纪："+rs.getInt("StuAge"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
         
		}finally{
			try {
				rs.close();
				pre.close();
				sta.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		System.out.println("连接成功！");
       
	}
}
