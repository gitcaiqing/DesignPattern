package String;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**@Projectname: DesignPattern
 * @Typename: String 
 * @Description: TODO
 * @CreateDate:  2017-7-20 上午9:47:57
 * @LastModified: 2017-7-20 上午9:47:57
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class StringAndStringBuffer {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "word";
		System.out.println(s1+"------"+s2);
		change(s1, s2);
		System.out.println("change之后的 的 s2:"+s2 +",hashcode:"+s2.hashCode());
		System.out.println(s1+"------"+s2);
		System.out.println("-----------------------------------");
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("word");
		System.out.println(sb1+"------"+sb2);
		change(sb1, sb2);
		System.out.println("change之后的 的 sb2:"+sb2 +",hashcode:"+sb2.hashCode());
		System.out.println(sb1+"------"+sb2);
		
		List<List<String>> fList = new ArrayList<List<String>>();
		List<String> cList = new ArrayList<>();
		cList.add("111111111111");
		fList.add(cList);
		cList.add("222222222222");
		System.out.println("fList:"+fList);
	}
	
	private static void change(String s1, String s2){
		s1 = s2;
		s2 = s1 + s2;
		System.out.println("change 的 s2:"+s2 +",hashcode:"+s2.hashCode());
	}
	private static void change(StringBuffer sb1, StringBuffer sb2){
		sb1 = sb2;
		sb2.append(sb1);
		System.out.println("change 的 sb2:"+sb2 +",hashcode:"+sb2.hashCode());
	}
	
}
