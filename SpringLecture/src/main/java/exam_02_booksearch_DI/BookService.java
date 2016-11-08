package exam_02_booksearch_DI;

import java.util.ArrayList;

public class BookService {
	
	private BookDAO dao;
	public BookDAO getDao() {
		return dao;
	}

	public void setDao(BookDAO dao) {
		this.dao = dao;
	}

	public BookService() {
	
	}
	public BookService(BookDAO dao) {
		this.dao=dao;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	private String keyword;
	
	public ArrayList<BookEntity> getListByKeyword(String keyword){
		// 로직과 디비 처리가 나옴
		return dao.selectAll(keyword);
	}

	public ArrayList<CommentEntity> getCommentList(String bisbn) {
		
		return dao.selectComment(bisbn);
	}
}
