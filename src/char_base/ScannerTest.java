package char_base;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;

public class ScannerTest {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("test01.dat"));
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
			
		}
		sc.close();
		
		/*
		 * try (Scanner sc = new Scanner(new File("test01.dat"));) {
		 * 
		 * while(true) {
		 * 
		 * System.out.println(sc.nextLine()); }
		 * 
		 * } catch (NoSuchElementException e) {
		 * 
		 * System.out.println(); }
		 */
		// System.out.println("종료");
	}

}
