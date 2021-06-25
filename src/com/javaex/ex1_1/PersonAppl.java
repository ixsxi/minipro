package com.javaex.ex1_1;

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

public class PersonAppl {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		List<Person> pList = new ArrayList<Person>();
		
		Reader fr = new FileReader("C:\\java Study\\workspace\\미니프로젝트\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String line = br.readLine();
			
			if(line == null) {
				break;
			}
			
			
			String[] pArray = line.split(",");
			
			String name = pArray[0];
			String hp = pArray[1];
			String com = pArray[2];
			
			 Person person = new Person(name,hp,com);
			
			pList.add(person);
			
			System.out.println(person);
		}
		
		while(true) {
			System.out.println("전화번호 관리 프로그램");
			System.out.println("");
			System.out.println("1.리스트  2.등록  3.삭제  4.검색  5.종료");
			System.out.println("------------------------------------------");
			System.out.print(">메뉴번호: ");
			  int num =sc.nextInt();
			  sc.nextLine();
			  
			if(num == 1) {
					for(int i =0; i<pList.size(); i ++) {
						System.out.print(i+1+".");
						System.out.println("  "+pList.get(i).getName()+"  "+pList.get(i).getPh()+"  "+pList.get(i).getCom());
					}
						
					
				
			}else if(num == 2) {
				
				Person newperson = new Person();
				
				System.out.println("<.등록>");
				System.out.print(">이름:");
				newperson.setName(sc.nextLine());
				System.out.print(">휴대전화:");
				newperson.setPh(sc.nextLine());
				System.out.print(">회사전화:");
				newperson.setCom(sc.nextLine());
				
				pList.add(newperson); // 리스트 추가 꼭 해주기
				
				System.out.println("등록됨");
			}else if( num ==3 ) {
				pList.remove(sc.nextInt() -1  );
				System.out.println("삭제함");
			}else if( num == 4) {
				System.out.println(">이름:");
				 String serch = sc.nextLine();
				
				 int count = 1;
				 for(Person pp : pList) {
					 if(pp.getName().contains(serch)) {
						 System.out.println(count+"."+pp.getName()+pp.getPh()+pp.getCom());
						 
						 count  ++;
					 }
				 }
				 
			}else if(num == 5) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("다시입력하시오");
			}
			
		}// ***************와일드 문 끝 **********************
		
		 Writer fw = new FileWriter("C:\\java Study\\workspace\\미니프로젝트\\PhoneDB.txt");
		 BufferedWriter bw = new BufferedWriter(fw);
		 
		 for(Person pp :pList) {
			 System.out.println(pp.getName()+pp.getPh()+pp.getCom());
			 bw.newLine();
		 }
		 bw.close();
		
		br.close();
		sc.close();
	}
	

}
