import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class testjdbc {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost/Bookdb";
		String Utilisateur="root";
		String motDepasse="";
		String req="INSERT INTO `booktable`(`ISBN`, `Title`, `EditionNumber`, `Author`) VALUES ('999','tets','3','KAMEL BEN SALAH')";
		String req1="UPDATE `booktable` SET `EditionNumber`='4' WHERE ISBN=999";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, Utilisateur,motDepasse);
			Statement stmt = con.createStatement();
			stmt.executeUpdate(req);
			stmt.executeUpdate(req1);
			ResultSet rs=stmt.executeQuery("select * from BookTable");
			
			/*ResultSetMetaData rsmd= (ResultSetMetaData) rs.getMetaData();
			int numcols=rsmd.getColumnCount();
			System.out.println("Les Colonnes sélectionnées de la table BookTable sont:");
			for(int i=1;i<=numcols;i++){
				System.out.println(rsmd.getColumnLabel(i));
			}*/
			while(rs.next()) {
				System.out.println("Livre Num :"+rs.getInt(1)+"\t Titre :"+rs.getString(2));
			}
			
			rs.close();
			stmt.close();
			con.close();
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
