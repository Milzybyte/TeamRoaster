import java.util.*;

public class BowlingTeamDemo3
{
	public static void main(String[] args)
	{
		// vars and constants
		String name;
		int x;
		final int NUM_TEAM_MEMBERS = 4;
		int y;
		final int NUM_TEAMS = 4;
		BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
		
		// objects
		Scanner input = new Scanner(System.in);
		
		//input phase
		for(y = 0; y < NUM_TEAMS; ++y)
		{
			teams[y] = new BowlingTeam();
			System.out.print("Enter team name >> ");
			name = input.nextLine();
			teams[y].setTeamName(name);
			
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			{
				System.out.print("Enter team member's name: ");
				name = input.nextLine();
				teams[y].setMember(x, name);
			}
		}
		//output phase
		
		for(y = 0; y < NUM_TEAMS; ++y)
		{	
			System.out.println("\n Members of team " + teams[y].getTeamName());
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
				System.out.print(teams[y].getMember(x) + ", ");
			System.out.println();
		}
		System.out.print("\n\nEnter a Team name to see its roaster >> ");
		name = input.nextLine();
		for(y = 0; y < teams.length; ++y)
			if(name.equalsIgnoreCase(teams[y].getTeamName()))
				for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
					System.out.print(teams[y].getMember(x) + ", ");
		System.out.println();
	}
	
	
}