package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class PersonApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		
		
		System.out.println("*********************************");
		System.out.println("*   전화번호 관리 프로그램      *");
		System.out.println("*********************************");

			// 파일 읽기
		Reader fr = new FileReader("C:\\java Study\\workspace\\ppp\\PhoneDB.txt"); 
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		
		line = br.readLine();// 한줄씩읽어라
		
		while(true) {
			if(line == null) {
				break;
			}
			
		 String[] pInfo = line.split(",");
		 
		 String name = pInfo[0];
		 String hp = pInfo[1];
		 String comp = pInfo[2];
		 
		 Person user = new Person(name,hp,comp);
		 
		 
		
			
		}
		
		
		
	
	}

}
