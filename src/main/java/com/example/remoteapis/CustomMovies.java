package com.example.remoteapis;

public class CustomMovies {
    private boolean adult;
    private int budget;
    private String original_title;

    public CustomMovies() {
    }

    public CustomMovies(boolean adult, int budget, String original_title) {
        this.adult = adult;
        this.budget = budget;
        this.original_title = original_title;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }
}
