package Files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

//Scanner = FileReader 응용

public class File6 {

	public static void main(String[] args) {
		Notice n = new Notice();
		try {
			n.view();
		} catch (IOException e) {
			System.out.println("메소드 함수 오류");
			if(e.getMessage()!=null) {

				System.out.println(e);
				
			}
		}
	}
}
class Notice{
	Scanner sc;
	FileReader fr;
	public void view() throws IOException{
		fr = new FileReader("D:\\Project\\HomePC\\JavaStart\\src\\Files\\Notice.txt");
		sc = new Scanner(this.fr);
		//해당 scanner에 파일 내용을 모두 적용시킴
		//System.in : 직접입력
		//System.out : 출력파트
		
		
//		System.out.println(this.sc.hasNext());  // 출력메시지 true
		while(this.sc.hasNext()) { // 해당 문서가 true 문장이 있을때까지 출력시킨다는의미
			System.out.println(this.sc.nextLine());
			//nextLine() : 단어 띄어쓰기로 인하여 데이터가 짤리는 현상을 방지
		}		
		this.sc.close();
		this.fr.close();
	}
}
