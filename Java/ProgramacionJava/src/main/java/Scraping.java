import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Scraping {

    public static void main(String[] args) {

        try {

            Document doc = Jsoup.connect("https://www.pccomponentes.com/intel-core-i5-12400f-25-ghz?srsltid=AfmBOop9liktcOaffgv8rTSoYu_NwJppH5hoY2IPjHZYPauOiA3TGXFT").get();

            String precio = doc.select(".price").text();

            String url = "jdbc:postgresql://localhost:5432/tu_base";
            String user = "postgres";
            String password = "1234";

            Connection conn = DriverManager.getConnection(url, user, password);

            PreparedStatement ps = conn.prepareStatement(
                    "UPDATE componente SET precio = ? WHERE id = ?");

            ps.setString(1, precio);
            ps.setInt(2, 1);

            ps.executeUpdate();

            System.out.println("Precio actualizado: " + precio);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}