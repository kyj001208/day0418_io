package char_base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {

		File file = new File("test01.dat");

		if (!file.exists()) { // 파일이 존재하지 않으면 생성하라는 조건문

			file.createNewFile();
		}

		// Reader in =new FileReader("");

		// BufferedReader br=new BufferedReader(null); //8192

		BufferedReader br = new BufferedReader(new FileReader(file));

		while (true) {

			String str = br.readLine();

			if (str == null)break;
			System.out.println(str);

		}
		br.close();

	}

}
