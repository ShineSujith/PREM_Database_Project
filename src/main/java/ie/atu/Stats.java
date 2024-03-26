package ie.atu;

public class Stats {
    public static void main(String[] args){
        PremTable[] premtable = new PremTable[]
                {
                        new Titles("Arsenal", 1, 3,0,14,2),
                };
        for(PremTable premtables : premtable){
            System.out.println("Position: " + premtables.getLeaguePosition());
            System.out.println("Name: " + premtables.getName());
            System.out.println("Premier Leagues Titles: " + premtables.getPremierLeagueCups());
            System.out.println("Champion Leagues Titles: " + premtables.getChampionsLeagueCups());
            System.out.println("Fa Cup Titles: " + premtables.getFaCups());
            System.out.println("EFl Cup Titles: " + premtables.getEFLCups());
        }
    }
}
