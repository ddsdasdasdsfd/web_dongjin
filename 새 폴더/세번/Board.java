package ����;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Board {

	
	private void name() {
		Boardlist [] boardlist = new Boardlist[100];
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.println("============�Խ���=============");
			System.out.println("1.�Խù� ��� 2. �󼼺��� >>>>>����:"); int ch = scanner.nextInt();
			if (ch==1) {
				System.out.println("============�Խù� ���===========");
				scanner.nextLine();
				System.out.println("�����Է� :"); String title = scanner.nextLine();
				System.out.println("�ۼ����Է� :"); String writer = scanner.nextLine();
				System.out.println("�����Է�  :");	 String contensts = scanner.nextLine();
				
				Date now = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd");
				String date   = dateFormat.format(now);
				
				String count="1";				
			for (int i = 0; i < boardlist.length; i++) {///�ι��� boardlist���勚����
					if (boardlist[i]==null) {
						boardlist[i].title=title;
						boardlist[i].writer=writer;
						boardlist[i].contents=contensts;
						
					}
				}	
				
				
			
			   if (ch==2) {
				   System.out.println("=============�Խ��� �󼼺���===============");///3����
				   System.out.printf(" %2s \t %10s \t %5s \t %5s %3s\n","����,"," ����"," �ۼ���"," ����"," ��¥"," ��ȸ��");
				   for (int i = 0; i < boardlist.length; i++) {
					  if (boardlist[i]==null) {System.out.printf(" %2s \t %10s \t %5s \t %5s %3s\n",i,boardlist[i].title,
							  boardlist[i].writer,boardlist[i].contents,boardlist[i].date,boardlist[i].count); // ��ȣ()������ 6����
					  
				
					  
					  
						
					  
							
					
					  
					}
					
				} 
				
			}
		
		}}}}
	
	
	

