import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Entreprise {
  private Connection con;
  private String url;
  private String pwd;
  private String user;
  
  public Entreprise() {
	    url="jdbc:mysql://localhost/entreprisedb";
	    user="root";
	    pwd="";
	    this.connexion();
  }
  
   public void connexion() {
	   try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   this.con = DriverManager.getConnection(url, user,pwd);
		   System.out.println("Driver com.mysql.jdbc.Driver chargé");
	   }catch(ClassNotFoundException e) {
		   System.out.println(e.getMessage());
	   }catch(SQLException e) {
		   System.out.println("la connexion à la base de données '\na pas pu être établie");
   		}catch(NullPointerException e) {
   			System.out.println(e.getMessage());
   		}
   }
   
   public void deconnexion() {
	   try {
		   this.con.close();
		   System.out.println("Deconnexion effectuer");
	   }catch(SQLException e) {
		   System.out.println(e.getMessage());
	   }
   }
   
   public void interrogation() {
	   try {
		   Statement stm=this.con.createStatement();
		   ResultSet res=stm.executeQuery("SELECT nom FROM emp");
		   while(res.next()) {
			   System.out.println("Nom :"+res.getString(1));
		   }
	   }catch(SQLException e) {
		   System.out.println(e.getMessage());
	   }
   }
   
   public void GetAffaire() {
	   try {
		   Statement stmt=this.con.createStatement();
		   ResultSet resultat=stmt.executeQuery("SELECT * from affaire");
		   while(resultat.next()) {
			   System.out.println("NOAFF :"+resultat.getInt(1)+"\t NOM :"+resultat.getString(2)+"\t BUDGET :"+resultat.getInt(3));
		   }
	   }catch(SQLException e) {
		   System.out.println(e.getMessage());
	   }
   }
   
  public void createTableAffaire() {
	   try {
		   Statement stm=this.con.createStatement();
		   stm.executeUpdate("create table affaire (NOAFF numeric(3), NOM varchar(10),BUDGET numeric (8,2))");
	   }catch(SQLException e) {
		   System.out.println(e.getMessage());
	   }
   }
   
   public void dropTable(String nom) {
	   try {
		   Statement prestm=this.con.createStatement();
		   prestm.executeUpdate("DROP TABLE "+nom);
	   }catch(SQLException e) {
		   System.out.println(e.getMessage());
	   }
	  
   }
   
   public void insertionDansAffaire(int no_aff, String nom, int budget) {
	   try {
		   PreparedStatement pre=this.con.prepareStatement("INSERT INTO affaire VALUES (?,?,?)");
		   pre.setInt(1, no_aff);
		   pre.setString(2, nom);
		   pre.setInt(3, budget);
		   pre.executeUpdate();
	   }catch(SQLException e) {
		   System.out.println(e.getMessage());
	   }
   }
   
   public static void main(String args []) {
	  Entreprise e=new Entreprise();
	   e.interrogation();
	 // e.createTableAffaire();
	  e.insertionDansAffaire(101, "ALPHA", 250000);
	  e.insertionDansAffaire(102, "BETA", 175000);
	  e.insertionDansAffaire(103, "GAMMA", 95000);
	  e.GetAffaire();
	 //e.dropTable("affaire");
	 // e.deconnexion();
   }
   
}
