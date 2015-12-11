public class answers
{
	//instance variable
	private String answers;


	//no argument constructor
	public answers()
	{
		answers = "";

	}
	
	//argument constructor
	public answers(int aID, String answers)
	{
		this.answers = answers;

	}

	public String getAnswers()
	{
		return answers;
	}


	public void setAnswers(String answers)
	{
		this.answers = answers;
	}

}
