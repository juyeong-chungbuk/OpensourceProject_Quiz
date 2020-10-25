import java.io.*;
import java.util.*;
public class test{
	public static void main(String[] args) {
		byte a[]=new byte[1024];
		byte b[]=new byte[1024];
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		try {
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		String src=scanner.nextLine();
		
		System.out.print("두번째 파일 이름을 입력하세요>>");
		String dst=scanner.nextLine();
		
		File f1=new File("c:\\temp",src);
		File f2=new File("c:\\temp",dst);
		
		FileInputStream fin1=new FileInputStream(src);
		FileInputStream fin2=new FileInputStream(dst);
		fin1.read(a);
		fin2.read(b);
		
		System.out.println(src+ "와" +dst+ "를 비교합니다.");
		if(f1.equals(f2))
			System.out.println("파일이 같습니다.");
		else
			System.out.println("파일이 다릅니다.");
		}
		catch(IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
		
		int srcCount=10, dstCount=10;
		
		for(int i=0;i<srcCount;i++) {
			System.out.print(i);
		}
		for(int i=0;i<dstCount;i++) {
			System.out.print(i);
		}
	}
}
