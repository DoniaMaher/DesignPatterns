public class GradesAnnouncementEmailMessage implements message {

	public String prepareMessage(String placeHolders) {
		String daily="Grades Email"+placeHolders;
		System.out.println(daily);
		return "";
	}
	
	public boolean verifyGrades() {
		// code to verify Grades before announcement
		
		return true;
	}
}
