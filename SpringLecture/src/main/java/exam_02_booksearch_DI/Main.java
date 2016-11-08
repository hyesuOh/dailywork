package exam_02_booksearch_DI;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("키워드입력");
		Scanner s = new Scanner(System.in);
		String keyword = s.nextLine();
		
		String config = "classpath:applicationCtx.xml";
	
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(config);
		BookService service = ctx.getBean("bookService",BookService.class);
		
		ArrayList<BookEntity> blist = service.getListByKeyword(keyword);
		
		ArrayList<CommentEntity> clist =null;
	
		
		
		for (BookEntity entity : blist){
			System.out.println(entity.getBtitle()+" "+ entity.getBauthor());
			
			clist = service.getCommentList(entity.getBisbn());
			for(CommentEntity entity2 : clist){
				
				System.out.println("======>"+entity2.getComment());
			}
		}
		
		ctx.close();
		s.close();
	
	}

}
