import java.util.ArrayList;
import java.util.Random;

public class QuestionsList 
{
	private ArrayList<Questions> QuestionsList;

	public QuestionsList()
	{
		QuestionsList = new ArrayList<Questions>();
	}
	
	public QuestionsList(ArrayList<Questions> questionsList)
	{
		
		QuestionsList = questionsList;
	}

	public ArrayList<Questions> getQuestionsList()
	{
		return QuestionsList;
	
	}

	public void setQuestionsList(ArrayList<Questions> string)
	{
		QuestionsList = string;
	}

	
}
