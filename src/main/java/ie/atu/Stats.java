package ie.atu;

public class Stats {
    public static void main(String[] args){
        PremTable[] premtable = new PremTable[]
                {
                        new Titles("Arsenal", 1, 3,0,14,2),
                        new Titles("Liverpool", 2,1,6,8,10),
                        new Titles("Manchester City", 3,6,1,7,8),
                        new Titles("Aston villa", 4,0,1,7,8),
                        new Titles("Tottenham Hotspur", 5,0,0,8,4),
                        new Titles("Manchester United", 6,13,3,12,6),
                        new Titles("West Ham United", 7,0,0,3,0),
                        new Titles("Brighton", 8,0,0,0,0),
                        new Titles("Wolves", 9,0,0,4,2),
                        new Titles("Newcastle United", 10,0,0,6,0),
                        new Titles("Chelsea", 11,5,2,8,5),
                        new Titles("Fulham", 12,0,0,0,0),
                        new Titles("Bournemouth", 13,0,0,0,0),
                        new Titles("Crystal Palace", 14,0,0,0,0),
                        new Titles("Brentford", 15,0,0,0,0),
                        new Titles("Everton", 16,0,0,5,0),
                        new Titles("Luton Town", 17,0,0,0,1),
                        new Titles("Nottingham forrest", 18,0,2,2,4),
                        new Titles("Burnley", 19,0,0,1,0),
                        new Titles("Sheffield United", 20,0,0,4,0),
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
