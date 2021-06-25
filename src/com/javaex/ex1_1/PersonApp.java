package com.javaex.ex1_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		//********폰디비 파일 불러오기 ***********
		Reader rf = new FileReader("C:\\java Study\\file\\PhoneDB_원본.txt");
		BufferedReader br = new BufferedReader(rf);
		
		//******************************************
		
		
		// ******************리스트 생성 ******************
		List<Person> pList = new ArrayList<Person>();
		
		String line = ""; // 가변 추후 읽을때 필요한 변수
		
		while(true) {
			
			line = br.readLine();
			
			if(line == null) {
				break;
			}
			
			String[] pInfo = line.split(",");
			
			 String name = pInfo[0];
			 String hp = pInfo[1];
			 String com = pInfo[2];
			 
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
			
			int num =sc.nextInt();
			
			if(num==1) {
				for(Person pp : pList) {
					System.out.println(pp.getName()+pp.getPh()+pp.getCom());
				}
			}else if(num==2) {
				
				Person newuser = new Person();
				
				System.out.println("<2.등록>");
				System.out.print("이름:");
				newuser.setName(sc.next());
				System.out.print("휴대전화");
				newuser.setPh(sc.next());
				System.out.print("회사전화");
				newuser.setCom(sc.next());
				
				pList.add(newuser);
				
				System.out.println("등록되었음");

				
			}else if(num ==3) {
				System.out.println("<삭제>");
				System.out.print(">번호:");
				pList.remove(sc.nextInt() -1);
				System.out.println("삭제되었습니다.");

			}else if(num == 4) {
				System.out.println("<4.검색>");
				System.out.println("검색:");
				String name =sc.next();
				
				for(Person pp : pList) {
					if(pp.getName().contains(name)) {
						System.out.println(pp.getName() + pp.getPh() + pp.getCom());
					}
				}
			}
			
			
		}
		
		
		
		
		
		
	
	}

}
