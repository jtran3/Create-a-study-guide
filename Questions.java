public class Questions
{
	//instance variable
	private String questions;
	
	//no argument constructor
	public Questions()
	{
		questions = "";
	}
	//argument constructor
	public Questions(String questions)
	{
		this.questions = questions;
	}
	
	
    
	/**
	 * Method name: getQuestions()
	 * Description: calls the question
	 * @return the questions
	 */
	public String getQuestions()
	{
		return questions;
	}

	/**
	 * Method name: setQuestions
	 * @param questions
	 * description: set information of the question
	 */
	public void setQuestions(String questions)
	{
		this.questions = questions;
	}

	
}
