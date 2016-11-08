package exam_01_composition;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
			//입력
	Scanner s = new Scanner(System.in);
	System.out.print(" 검색할 키워드 : ");
	String keyword = s.nextLine();
	
	BookService service = new BookService(); //  로직처리를 위한 서비스 객체
		
	//로직 수행.
	ArrayList<BookEntity> list = service.getListByKeyword(keyword);
	
	for(BookEntity entity : list){ // 하나씩 끄집어내어서 
		System.out.println(entity.getBtitle() + " : " + entity.getBauthor());
	}
	
	s.close();
	}

	
	
}
