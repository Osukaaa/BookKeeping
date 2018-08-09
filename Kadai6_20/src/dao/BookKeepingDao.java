package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.*;


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



	//収入一覧表示メソッド
	public static ArrayList<Income_Spending> incomeList(){

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Income_Spending> incomeList = new ArrayList<Income_Spending>();

		try{

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bookkeeping?useSSL=false",
					"root",
					"sogekingM0712");

			String sql = "SELECT income_spending_kindid,date,income_spending_typeid,money FROM income_spending"
					+ "WHERE income_spending_kindid = 1";

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while(rs.next() == true){

				int kindid = rs.getInt("income_spending_kindid");
				String date = rs.getString("date");
				int typeid = rs.getInt("income_spending_typeid");
				int money = rs.getInt("money");

				incomeList.add(new Income_Spending(kindid,date,typeid,money));
			}

		} catch (SQLException e){
			System.out.println("DB切断時にエラーが発生しました。");

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
		return incomeList;
	}






	//支出一覧表示メソッド
		public static ArrayList<Income_Spending> spendingList(){

			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			ArrayList<Income_Spending> spendingList = new ArrayList<Income_Spending>();

			try{

				Class.forName("com.mysql.jdbc.Driver");

				con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/bookkeeping?useSSL=false",
						"root",
						"sogekingM0712");

				String sql = "SELECT income_spending_kindid,date,income_spending_typeid,money FROM income_spending"
						+ "WHERE income_spending_kindid = 2";

				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();

				while(rs.next() == true){

					int kindid = rs.getInt("income_spending_kindid");
					String date = rs.getString("date");
					int typeid = rs.getInt("income_spending_typeid");
					int money = rs.getInt("money");

					spendingList.add(new Income_Spending(kindid,date,typeid,money));
				}

			} catch (SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");

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
			return spendingList;
		}
}
