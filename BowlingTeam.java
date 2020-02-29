public class BowlingTeam
{
    // instance vars for the bowlingteam class
	private String teamName;
	private String[] members = new String[4];
		
	// mutator method for teamName field 
	public void setTeamName(String team)
	{
		teamName = team;
	}	
	//accessor method for the teamName
	public String getTeamName()
	{
		return teamName;
	}
	
	// mutator method for the members names
	public void setMember(int number, String name)
	{
		members[number] = name;
	}
	
	//accessor  method for members names
	public String getMember(int number)
	{
		return members[number];
	}
}