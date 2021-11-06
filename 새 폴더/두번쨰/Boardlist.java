package 두번쨰;

public class Boardlist {

	// 게시판 상세목록에 적을 것들을정한다
	//1. 제목 , 작성자, 내용 ,날짜 , 조회수
	
	public String title;
	public String writer;
	public String contents;
	public int date;
	public int count;
	
	
	
	
	public Boardlist(String title, String writer, String contents, int date, int count) {
		super();
		this.title = title;
		this.writer = writer;
		this.contents = contents;
		this.date = date;
		this.count = count;
	}
	
	
	
	
	
	
}
