package 세번;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Board {

	
	private void name() {
		Boardlist [] boardlist = new Boardlist[100];
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.println("============게시판=============");
			System.out.println("1.게시물 등록 2. 상세보기 >>>>>선택:"); int ch = scanner.nextInt();
			if (ch==1) {
				System.out.println("============게시물 등록===========");
				scanner.nextLine();
				System.out.println("제목입력 :"); String title = scanner.nextLine();
				System.out.println("작성자입력 :"); String writer = scanner.nextLine();
				System.out.println("내용입력  :");	 String contensts = scanner.nextLine();
				
				Date now = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd");
				String date   = dateFormat.format(now);
				
				String count="1";				
			for (int i = 0; i < boardlist.length; i++) {///두번봄 boardlist저장떄문에
					if (boardlist[i]==null) {
						boardlist[i].title=title;
						boardlist[i].writer=writer;
						boardlist[i].contents=contensts;
						
					}
				}	
				
				
			
			   if (ch==2) {
				   System.out.println("=============게시판 상세보기===============");///3번쨰
				   System.out.printf(" %2s \t %10s \t %5s \t %5s %3s\n","순번,"," 제목"," 작성자"," 내용"," 날짜"," 조회수");
				   for (int i = 0; i < boardlist.length; i++) {
					  if (boardlist[i]==null) {System.out.printf(" %2s \t %10s \t %5s \t %5s %3s\n",i,boardlist[i].title,
							  boardlist[i].writer,boardlist[i].contents,boardlist[i].date,boardlist[i].count); // 괄호()떄문에 6번봄
					  
				
					  
					  
						
					  
							
					
					  
					}
					
				} 
				
			}
		
		}}}}
	
	
	

