package keywords.finalkeyword;

public class TeamLead extends Employee {

    public TeamLead(int id, String name) {
        super(id, name);
    }

    public static void main(String[] args) {
        TeamLead lead = new TeamLead(101, "Sinchana");
        lead.display();
    }
    
}