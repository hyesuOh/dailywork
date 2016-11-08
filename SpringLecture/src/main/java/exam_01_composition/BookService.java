package exam_01_composition;

import java.util.ArrayList;

public class BookService {
	
	public ArrayList<BookEntity> getListByKeyword(String keyword){
		// 로직과 디비 처리가 나옴
		BookDAO dao = new BookDAO();
		ArrayList<BookEntity> list = dao.selectAll(keyword);
		return list;
	}
}
