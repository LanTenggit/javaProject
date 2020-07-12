package pragram1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.transform.Result;

public class Jdbc {

	/**
	 * @param args
	 */
	public static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String url = "jdbc:sqlserver://127.0.0.1:1433;DataBaseName=Shanguosha";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Connection con = null;
         PreparedStatement pre=null;
         PreparedStatement pre1=null;
         PreparedStatement pre2=null;
         ResultSet rs=null;
         	try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,"sa","123456");
			//添加数据
			pre=con.prepareStatement("insert into shuguo values(?,?,?,?)");
			pre.setString(1, "马超");
			pre.setInt(2, 4);
			pre.setString(3, "忠勇");
			pre.setInt(4, 92);
			int num=pre.executeUpdate();
			if(num>0){
				System.out.println("添加成功！");
			}
			//修改数据
//			pre1=con.prepareStatement("update Shuguo set name=? where name=?");
//			pre1.setString(1,"关羽");
//			pre1.setString(2,"马超");
//			int num1=pre1.executeUpdate();
//			if (num1>0) {
//				System.out.println("修改成功！");
//			}
			//查询数据
			pre2=con.prepareStatement("select * from shuguo" );
			rs=pre2.executeQuery();
			 while (rs.next()) {
				rs.getString("name");
				rs.getInt("hp");
				rs.getString("skill");
				rs.getInt("emotion");
				System.out.println("姓名:"+rs.getString("name")+"\t"+"血量："+rs.getInt("hp")+"\t"+"性格:"+rs.getString("skill"));
			}
			 
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				pre.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

}
