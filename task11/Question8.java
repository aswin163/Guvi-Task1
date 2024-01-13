package task11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

//Q8. Program for file not found exception

public class Question8 {

	public static void main(String[] args) {
		
		Path filename = Path.of("E:\\Java\\src\\task11\\abc1.txt");
		FileOutputStream file = new FileOutputStream("abc1.txt"); // File doesn't exist, so it will throw exception.
		
	}

}
