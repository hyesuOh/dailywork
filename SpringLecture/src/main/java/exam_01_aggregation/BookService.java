package exam_01_aggregation;

import java.util.ArrayList;

public class BookService {
	
	private BookDAO dao;
	public BookService(BookDAO dao){
		this.dao= dao;
	}
	
	public ArrayList<BookEntity> getListByKeyword(String keyword){
		// 로직과 디비 처리가 나옴
		BookDAO dao = new BookDAO();
		ArrayList<BookEntity> list = dao.selectAll(keyword);
		return list;
	}
}
