/*
 * [A]98
 * [TA's Advise]
 * 1. �|�X�{�@�Ǥp�p���޿���D, ���M���ܩ����{������, ���L�i�H�h�Q�Q��.
 * 2. �g�k�ܤ��x, �S����Ӥj���D, �t�~folder�R�W��ĳ���n�ϥ�src.
 * */

//����ĳpackage��src�R�W
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

			// �ƹ�W�o���do-while���Ӧn��, �]���A�����_�I�b�o�̤~�O.
			if (input.equals("Q") || input.equals("q"))// ��JQ�Ӹ��X�j��
			{
				break;
			}
			try {
				aGrade = Double.parseDouble(input);// �NString aGrade�নdouble
													// aGrade
				gradeanalyzer.addGrade(aGrade);
			} catch (Exception e) {
				System.out.println("Invalid input. Please enter numbers."); // �ư��{�����}
			}
			// �U���o�ӧP�_���A�w�g��W���������F, �J�MLine 20�P�_�r�ꤣ�Oq��Q, �o��۹�S����N�q.
		} while (input != "Q" || input != "q");

		if (gradeanalyzer.gradelist.size() >= 2) { // �ܤ֭n��J��Ӧ��Z
			gradeanalyzer.analyzeGrades();
			System.out.println(gradeanalyzer.toString());
		} else
			System.out.println("You did not enter enough grades to analyze. Please enter at least 2 valid grades.");

	}

}
