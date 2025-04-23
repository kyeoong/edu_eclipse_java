package och11_ex03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;
// 어마무시 쓰고 계속 쓴다 Properties 알아야 된다 별 2개 **
// jsp에서 힘들다 , 제대로 알아둘것
public class PropertiesEx01 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties pt = new Properties();
		String path = PropertiesEx01.class.getResource("database.properties").getPath();
		System.out.println("1 path : " + path);
		
		path = URLDecoder.decode(path, "utf-8");
		System.out.println("2 path : " + path);
		
		pt.load(new FileReader(path)); // path => deCoding 이며 FileReader로 읽어서 pt.load로 메모리에 올린다  => 메모리에 Load 되면 속성을 꺼내쓸 수 있다
		String driver = pt.getProperty("driver");   // =를 기준으로 앞에 키  뒤는 벨류
		String url = pt.getProperty("url");
		String userName = pt.getProperty("userName");
		String password = pt.getProperty("password");
		
		System.out.println("드라이버 = " + driver);
		System.out.println("url = " + url);
		System.out.println("userName = " + userName);        
		System.out.println("password = " + password);
	}

}
