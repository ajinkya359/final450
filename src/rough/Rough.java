package rough;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Rough{
	public static ArrayList<Integer> return_input_array(String str) throws IOException{
		Path filePath = Paths.get(str);
		Scanner scanner = new Scanner(filePath);
		ArrayList<Integer> integers = new ArrayList<>();
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				integers.add(scanner.nextInt());
			} else {
				scanner.next();
				
			}
		}
		scanner.close();
		return integers;
	}
	public static void main(String[] args) throws IOException{
		ArrayList<Integer> new_list=return_input_array("src\\rough\\new.txt");
		ArrayList<Integer> old_list=return_input_array("src\\rough\\old.txt");
		ArrayList<Integer> ans=new ArrayList<>();
		for(int x:new_list)
		{
			if(!old_list.contains(x))ans.add(x);
		}
		for(int x:old_list){
			if(!new_list.contains(x))ans.add(x);
		}
		Collections.sort(ans);
		for(int x: ans)
		System.out.println(x);
	}
}