/**
 * 
 */

/**
 * @author ezekiel.inalegwu
 *
 */
enum BaseRoomFare {
	Standard(2500), Deluxe(3500), Cottage(5500);

	private int value;

	private BaseRoomFare(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}

public class RoomDetails implements RoomBillComponent {

	private int billId;
	private String customerName;
	private String typeOfRoom;
	private int noOfExtraPersons;
	private int noOfDaysOfStay;
	private static int counter = 101;

	private RoomDetails() {

		this.billId = RoomDetails.counter;
		RoomDetails.counter++;
	}

	public RoomDetails(String customerName, String typeOfRoom, int noOfDaysOfStay, int noOfExtraPersons) {

		this();

		this.customerName = customerName;
		this.typeOfRoom = typeOfRoom;
		this.noOfDaysOfStay = noOfDaysOfStay;
		this.noOfExtraPersons = noOfExtraPersons;
	}

	/**
	 * @return the billId
	 */
	public int getBillId() {
		return billId;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @return the typeOfRoom
	 */
	public String getTypeOfRoom() {
		return typeOfRoom;
	}

	/**
	 * @return the noOfDaysOfStay
	 */
	public int getNoOfDaysOfStay() {
		return noOfDaysOfStay;
	}

	/**
	 * @return the noOfExtraPersons
	 */
	public int getNoOfExtraPersons() {
		return noOfExtraPersons;
	}

	/**
	 * @param validate noOfDaysOfStay
	 */
	public boolean validateNoOfDaysOfStay() {
		return this.noOfDaysOfStay > 0 && this.noOfDaysOfStay < 16;
	}

	/**
	 * @return validate noOfExtraPersons
	 */
	public boolean validateNoOfExtraPersons() {
		if (this.noOfExtraPersons < 3) {
			return true;
		} else {
			System.out.println("No of extra persons must be less than 3");
		}
		return false;
	}

	/**
	 * @return validate typeOfRoom
	 */
	public boolean validateTypeOfRoom() {

		switch (this.typeOfRoom) {
		case "Standard":
			return true;
		case "Deluxe":
			return true;
		case "Cottage":
			return true;
		default:
			return false;
		}
	}

	/**
	 * 
	 * @return bill
	 */
	@Override
	public float CalculateBill() {

		if (this.validateNoOfDaysOfStay() && this.validateNoOfExtraPersons() && this.validateTypeOfRoom()) {
			double totalBill = (this.getNoOfDaysOfStay() * this.getBaseRoomFare())
					+ (this.getNoOfDaysOfStay() * (FOOD_CHARGE)) + (EXTRA_PERSON_CHARGE * this.getNoOfExtraPersons());

			return (float) ((float) totalBill * (1 + TAX / 100));
		}
		return 0;
	}

	private float getBaseRoomFare() {
		switch (this.typeOfRoom) {
		case "Standard":
			return BaseRoomFare.Standard.getValue();
		case "Deluxe":
			return BaseRoomFare.Deluxe.getValue();
		case "Cottage":
			return BaseRoomFare.Cottage.getValue();
		default:
			return 0;
		}
	}

}
