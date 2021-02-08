
public class StudentBean {

	//firstName, lastName,grade, discount and basicFees
	private String firstName;
	private String lastName;
	private String grade;
	private int discount;
	private int basicFees;
	
	
	
	
	public StudentBean(String firstName, String lastName, String grade, int discount, int basicFees) {
		//super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.discount = discount;
		this.basicFees = basicFees;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	/**
	 * @return the discount
	 */
	public int getDiscount() {
		return discount;
	}
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	/**
	 * @return the basicFees
	 */
	public int getBasicFees() {
		return basicFees;
	}
	/**
	 * @param basicFees the basicFees to set
	 */
	public void setBasicFees(int basicFees) {
		this.basicFees = basicFees;
	}
	@Override
	public String toString() {
		return "StudentBean [firstName=" + firstName + ", lastName=" + lastName + ", grade=" + grade + ", discount="
				+ discount + ", basicFees=" + basicFees + "]";
	}
	
	
}
