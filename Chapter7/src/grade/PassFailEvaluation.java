package grade;

public class PassFailEvaluation implements GradeEvaluation{

	@Override
	public String getGrade(int point) {

		if(point >= 70) return "p";
		else return "F";
	}

}
