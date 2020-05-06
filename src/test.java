import dao.Join1_DAO;

public class test {





public static void main(String[] args) {
	Join1_DAO dao = new Join1_DAO();
	String id = "sdsd";
	String pw = "sdsd";
	boolean flg = dao.isExist_id(id, pw);
	System.out.println("flg");
}



}
