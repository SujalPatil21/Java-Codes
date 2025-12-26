import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args)throws Exception{


        String sql = "SELECT * FROM public.product ";

        String url = "DB";
        String username = "DB_NAME";
        String password = "PASSWORD";

        Connection con = DriverManager.getConnection(url,username,password);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);


        while (rs.next()) {
            int productId = rs.getInt("product_id");
            String productName = rs.getString("product_name");

            System.out.println(productId + " : " + productName);
        }

        rs.close();
        st.close();
        con.close();
    }
}
