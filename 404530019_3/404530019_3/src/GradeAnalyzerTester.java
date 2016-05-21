/*
 * [A]98
 * [TA's Advise]
 * 1. 會出現一些小小的邏輯問題, 雖然不至於讓程式掛掉, 不過可以去想想看.
 * 2. 寫法很中矩, 沒什麼太大問題, 另外folder命名建議不要使用src.
 * */

//不建議package用src命名
package src;

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String[] args) {

		String input = "";

		GradeAnalyzer gradeanalyzer = new GradeAnalyzer();
		double aGrade = 0;

		do {

			input = (String) JOptionPane.showInputDialog(null, "Please Enter Grades", "Grade Analyzer",
					JOptionPane.QUESTION_MESSAGE, null, null, "Enter Here.(Enter 'Q' or 'q' if finshed)");

			// 事實上這邊用do-while不太好喔, 因為你的中斷點在這裡才是.
			if (input.equals("Q") || input.equals("q"))// 輸入Q來跳出迴圈
			{
				break;
			}
			try {
				aGrade = Double.parseDouble(input);// 將String aGrade轉成double
													// aGrade
				gradeanalyzer.addGrade(aGrade);
			} catch (Exception e) {
				System.out.println("Invalid input. Please enter numbers."); // 排除程式跳開
			}
			// 下面這個判斷式你已經把上面都完成了, 既然Line 20判斷字串不是q或Q, 這行相對沒什麼意義.
		} while (input != "Q" || input != "q");

		if (gradeanalyzer.gradelist.size() >= 2) { // 至少要輸入兩個成績
			gradeanalyzer.analyzeGrades();
			System.out.println(gradeanalyzer.toString());
		} else
			System.out.println("You did not enter enough grades to analyze. Please enter at least 2 valid grades.");

	}

}
