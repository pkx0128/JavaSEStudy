package array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StudentsScore studentsScore = new StudentsScore();
		System.out.println("请输入学生姓名:");
		String chioce = null;
		try {
			chioce = input.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) {
			if(studentsScore.students[i].equals(chioce)) {
				System.out.println("学生"+studentsScore.students[i]+"成绩如下：");
				System.out.println("c语言程序设计："+studentsScore.grades[i][0]+
						" java:"+studentsScore.grades[i][1]+
						" php:"+studentsScore.grades[i][2]+
						" javascript:"+studentsScore.grades[i][3]+
						" c++:"+studentsScore.grades[i][4]+
						" swift:"+studentsScore.grades[i][5]);
				break;
			}
		}
		
	}

}
