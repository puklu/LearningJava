package LabExercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day3ex5 {


	public static void main(String[] args) throws IOException {
	    
		String line="";
		 
		String dataFile=  "C:\\Users\\VivekPunia\\Documents\\Selenium\\csvFileDemo.csv";
		
		BufferedReader br = new BufferedReader(new FileReader(dataFile));
		
		while((line=br.readLine())!=null) {
			String[] data = line.split(",");
			System.out.println(data[0]+data[1]+data[2]);
		}
		
		

	}

}
