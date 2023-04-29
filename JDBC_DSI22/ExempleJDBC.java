import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ExempleJDBC {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/stockdb";
		String user="root";
		String password="";
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		PreparedStatement ps=null;
		String req1="SELECT * FROM produit";
		String req2="INSERT INTO produit(libelle, prix, quantite) VALUES ('souris',500,5)";	
		String req3="DELETE FROM produit WHERE libelle='souris'";
		String req4="UPDATE produit SET quantite='1000' WHERE id='1'";
		String req5="UPDATE produit SET quantite=? WHERE id=?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("chargement driver ok");
			con=DriverManager.getConnection(url, user, password);
			System.out.println("conneion OK");
			
		} catch (ClassNotFoundException e) {
			System.err.println("Problème de chargement du driver!!!"+e.getMessage());;
		} catch (SQLException e) {
			System.err.println("pb de coonnecton à la base!!!");
		}
		
		try {
			stmt=con.createStatement();
			stmt.executeUpdate(req4);
		} catch (SQLException e) {
			System.err.println("Error creating SQL statement: " +e.getMessage());

		}
		
		try {
			ps=con.prepareStatement(req5);
			ps.setInt(1, 7777);
			ps.setInt(2, 2);
			ps.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			rs=stmt.executeQuery(req1);
			while (rs.next()){
				System.out.println(rs.getInt("id")+"\t"+rs.getString("libelle")+"\t"+rs.getDouble(3)+"\t"+rs.getInt(4));
			}
		} catch (SQLException e) {
			System.err.println("Error executing query: " +e.getMessage());
		}

	}

}
