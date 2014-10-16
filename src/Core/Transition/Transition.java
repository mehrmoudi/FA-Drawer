package Core.Transition;

/**
 * 
 * @author Mehran Mahmoudi
 * 
 */
public interface Transition {
	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public boolean isLambda();

	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public char getLetter();

	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public String getFrom();

	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public String getTo();

	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public void setLetter(char letter);

	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public void setFrom(String from);

	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public void setTo(String to);
}