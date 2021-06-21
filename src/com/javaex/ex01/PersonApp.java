package com.javaex.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonApp {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		
		 Reader fr = new FileReader("C:\\java Study\\workspace\\미니프로젝트\\PhoneDB.txt");
		 BufferedReader bf = new BufferedReader(fr);
		 
		 
		 //리스트 생성
		
		 
		List<Person> pList = new ArrayList<Person>();
		
		String line = "";
		
		while(true) {
			line = bf.readLine();
			
			if(line == null) {
				break;
			}
			
			String[] pinfo = line.split(",");
			
			String name = pinfo[0];
			String hp = pinfo[1];
			String com = pinfo[2];
			
			Person user = new Person(name,hp,com);
			
			pList.add(user);
			
			System.out.println(user);
			
		}
		
		System.out.println("******************************************");
		System.out.println("*          전화번호 관리 프로그램        *");
		System.out.println("******************************************");
		
		
		while(true) {
			System.out.println("");
			System.out.println("1.리스트  2.등록  3.삭제  4.검색  5.종료");
			System.out.println("------------------------------------------");
			System.out.print(">메뉴번호: ");
			
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.println("<1.리스트>");
				
				/*
				for(Person p : pList) {
					System.out.println(p.getName()+p.getPh()+p.getCom());
				}*/
				
				for(int i =0; i<pList.size(); i++) {
					System.out.print(i+1+".  ");
					System.out.print(pList.get(i).getName()+"    ");
					System.out.print(pList.get(i).getPh()+"    ");
					System.out.println(pList.get(i).getCom()+"    ");
				}
			
					
				}else if(num == 2) {
				
					
					System.out.println("<2.등록>");
					
					Person person = new Person();
					
					System.out.print("이름:");
					person.setName(sc.next());
					
					System.out.print("휴대전화:");
					person.setPh(sc.next());
					
					System.out.print("회사전화:");
					person.setCom(sc.next());
					
					pList.add(person);
					
					System.out.println("등록되었습니다.");
					
			}else if(num ==3) {
				System.out.println("<3.삭제>");
				
				pList.remove(sc.nextInt());
				
				System.out.println("삭제되었습니다.");
			}else if(num==5) {
				
				
				
				System.out.println("종료");
				break;
			}else if(num==4){
				System.out.println("<4.검색>");
				System.out.println("검색:");
				String name =sc.next();
				
				for(Person pp : pList) {
					if(pp.getName().contains(name)) {
						System.out.println(pp.getName() + pp.getPh() + pp.getCom());
					}
					
				}
				
			}else {
				System.out.println("다시입력해라");
			}
			
			Writer fw = new FileWriter("C:\\java Study\\workspace\\미니프로젝트\\PhoneDB.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(Person pp : pList) {
				bw.write(pp.getName()+","+pp.getPh()+","+pp.getCom());
				bw.newLine();
			}
		
			
			bw.close();
		}
		
	}

}
