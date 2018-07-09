package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//Dao
public class BookKeepingDao {

	//ログインメソッド
	public static String getPassword(String userid){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String password = null;

		try{

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bookkeeping?useSSL=false",
					"root",
					"sogekingM0712");

			String sql = "SELECT userpass FROM user WHERE userid = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,userid);
			rs = pstmt.executeQuery();

			rs.next();
			password = rs.getString("userpass");

		} catch (SQLException e){
			System.out.println("ログイン失敗");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if( rs != null){
					rs.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if( pstmt != null){
					pstmt.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if( con != null){
					con.close();
				}
			} catch (SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}
		return password;
	}



	//新規ユーザ登録メソッド
	public static void newUser(String userid,String userpass,String username){
		Connection con = null;
		PreparedStatement pstmt = null;

		try{

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bookkeeping?useSSL=false",
					"root",
					"sogekingM0712");

			String sql = "INSERT INTO user VALUES(?,?,?)";

			pstmt = con.prepareStatement(sql);

			pstmt.setString(1,userid);
			pstmt.setString(2,userpass);
			pstmt.setString(3,username);

			pstmt.executeUpdate();


		} catch (SQLException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if( pstmt!= null){
					pstmt.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if( pstmt != null){
					pstmt.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}

			try {
				if( con != null){
					con.close();
				}
			} catch (SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}
	}
}
