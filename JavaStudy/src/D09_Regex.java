import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import myobj.MyScanner;

public class D09_Regex {
	public static void main(String[] args) {
		
		//Pattern.matches(regex, input) : input이 regex에 매치되는 문자열인지를 검사해주는 메서드
//		System.out.println(Pattern.matches("sleep", "sleEp"));
//		
//		// 
//		System.out.println(Pattern.matches("s[lh@]eep", "sleep"));//ture
//		System.out.println(Pattern.matches("s[lh@]eep", "sheep"));//ture
//		System.out.println(Pattern.matches("s[^lh@]eep", "s@eep"));//false
//		System.out.println(Pattern.matches("s[0-9a-z]eep", "s2eep"));//true 0~9, a~z까지 허용
//		System.out.println(Pattern.matches("s[a-d && c-f]eep", "sceep"));//true 
//		System.out.println(Pattern.matches("s[a-d && c-f]eep", "seeep"));//false 
//		
//		
//		
//		System.out.println(Pattern.matches("s.eep", "sheep"));//true // 모든문자
//		System.out.println(Pattern.matches("s[.]eep", "sheep"));//false // .만 허용
//		System.out.println(Pattern.matches("s\\.eep", "sheep"));//false // .만 허용
//		 
//		
//		System.out.println(Pattern.matches("s\\deep", "s9eep"));//true // 모든숫자
//		
//		System.out.println(Pattern.matches("\\D\\D\\D", "ㅊat"));//true // 모든 문자
//		
//		System.out.println(Pattern.matches("s\\seep", "s eep"));//true // 공백만 허용
//		System.out.println(Pattern.matches("s\\Seep", "s eep"));//true // 공백비허용
//		System.out.println(Pattern.matches("s\\weep", "s_eep"));//true // 공백비허용
		
		
//		Pattern instance = Pattern.compile("[0-9]@[0-9]");
		
//		System.out.println(Pattern.matches("[\\D3-5]{5}", "cat"));//false(5글자 되어야함)
//		System.out.println(Pattern.matches("[\\D3-5]{5}", "c3a4t"));//true
//		System.out.println(Pattern.matches("[\\D3-5]{5}", "34534"));//true
//		System.out.println(Pattern.matches("[\\D3-5]{5}", "34531"));//false(숫자는 3-5만)
		
//		String name = "ng4$3";
//		System.out.println("sad :" +Pattern.matches("[\\D3-5]{2,5}", name));//true
//		System.out.println(Pattern.matches("[\\D3-5]{2,5}", "345d31"));//false(글자수는 2~5)
//		
//		String regex1 = String.format(".{%d,}\\.txt", 2);
//		System.out.println(Pattern.matches(regex1, "abdc.txt"));//true
//		
//		System.out.println(Pattern.matches("[가-힣]{2,}", "안녕하세요"));//true
//		System.out.println(Pattern.matches("[가-힣]{4,}", "안녕요"));//false(글자수는 4개 이상)
//		
//		System.out.println(Pattern.matches("[가-힣]?\\.txt", ".txt"));//true (\\.은 .이 있어야한다는 의미)
//		System.out.println(Pattern.matches("[가-힣]?\\.txt", "한.txt"));//true
//		System.out.println(Pattern.matches("[가-힣]?\\.txt", "한글.txt"));//false(가-힣은 많아야 1번 나와야함)
//		System.out.println(Pattern.matches("0\\d{2}-?\\d{3,4}-?\\d{4}", "01012341234"));//true
//		System.out.println(Pattern.matches("0\\d{2}-?\\d{3,4}-?\\d{4}", "0101234134"));//true
//		System.out.println(Pattern.matches("0\\d{2}-?\\d{3,4}-?\\d{4}", "010-1234-4134"));//true
//		System.out.println(Pattern.matches("0\\d{2}-?\\d{3,4}-?\\d{4}", "010-123-4134"));//true
//		
//		
//		//자바에서 허용하는 변수명을 검사할 수 있는 정규표현식(첫번째 글자는 숫자 x, 공백 x, 특수문자는 _, $만)
//		System.out.println(Pattern.matches("[\\D&&($\\w)][$\\w]*", "$fsd"));
//		//							첫번째는 숫자x $,일반적인 문자 두번째부터는 $, 일반적인 문자임
//		
//		
		String fruit_text = "apple/banana/orange/grape/pineapple/peach/mango/redapple";
//		Pattern regex = Pattern.compile("/");
//		String[] fruits = regex.split(fruit_text);
//		System.out.println(Arrays.toString(fruits));
//		
		Pattern regex3 = Pattern.compile("[a-zA-Z]");//알파벳을 찾아줌
//		Pattern regex2 = Pattern.compile("apple");//apple이 되는 것들을 찾아줌
		Matcher matcher =  regex3.matcher(fruit_text);
//		System.out.println(fruit_text);
		while(matcher.find()){
			System.out.println("찾은것 : "+matcher.group());
//			System.out.println("위치 : "+matcher.start() + "부터" + matcher.end());
		}
//	숫자, 문자, 특수문자를 혼합 구성하고 2종류 이상의 문자를 조합 8자이상 16자 이하
//		String regex = "(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*_]).{8,16}";
//	
//		while(true) {
//			String input2=MyScanner.input("비밀번호 입력>>");
//		System.out.println(Pattern.matches(regex, input2));
//		}
	}
}
