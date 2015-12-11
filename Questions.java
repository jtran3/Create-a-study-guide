public class Questions
{
	//instance variable
	private String questions;
	private int qID;
	
	//no argument constructor
	public Questions()
	{
		questions = "";
		qID = 0;
	}
	//argument constructor
	public Questions(int qID, String questions)
	{
		this.questions = questions;
		this.qID = qID;
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
	
	/**
	 * Method name: getqID
	 * @return qID
	 * description: get the qID information that was set
	 */
	public int getqID()
	{
		return qID;
	}

	/**
	 * Method name: setqID
	 * @param qID
	 * description: set the qID information
	 */
	public void setqID(int qID)
	{
		this.qID = qID;
	}

	@Override
	public String toString()
	{
		return "Questions: " + qID + questions;
	}
	
	
}
