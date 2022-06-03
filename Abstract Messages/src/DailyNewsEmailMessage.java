public class DailyNewsEmailMessage implements message
{
	
	public String prepareMessage(String placeHolders) {
		String daily="Daily Email"+placeHolders;
		System.out.println(daily);
		return daily;
	}
}
