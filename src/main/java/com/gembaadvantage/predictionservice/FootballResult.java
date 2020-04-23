package com.gembaadvantage.predictionservice;

public class FootballResult {
    private final long id;
    private static final String template = "%1$s 1 v 2 %2$s!";
    private final String result;


    public FootballResult(long id, String homeTeam, String awayTeam) {
        this.id = id;
        this.result = String.format(template, homeTeam, awayTeam);
    }

    public long getId() {
        return id;
    }

    public String getResult() {
        return result;
    }
}
