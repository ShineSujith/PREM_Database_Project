package ie.atu;

class Titles implements PremTable{
    private String name;
    private double LeaguePosition;

    private double premierleaguecups;

    private double championleaguecups;

    private double facups;

    private double eflcups;

    public double getPremierLeagueCups() {
        return premierleaguecups;
    }
    public double getChampionsLeagueCups() {
        return championleaguecups;
    }
    public double getFaCups() {
        return facups;
    }

    public double getEFLCups() {
        return eflcups;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getLeaguePosition() {
        return LeaguePosition;
    }
    public Titles(String name, double LeaguePosition, double premierleaguecups, double championleaguecups, double facups, double eflcups)
    {
        this.name = name;
        this.LeaguePosition = LeaguePosition;
        this.premierleaguecups = premierleaguecups;
        this.championleaguecups = championleaguecups;
        this.facups = facups;
        this.eflcups = eflcups;
    }

}

