package com.rahul.springdemo.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Movies")
public class tutorial {
@Id
    @Column(name = "imdb_title_id")
    private String imdb_title_id;
    @Column(name = "title")
    private String title;
    @Column(name = "original_title")
    private String original_title;
    @Column(name = "year")
    private int year;
    @Column(name = "date_published")
    private String date_published;
    @Column(name = "genre")
    private String genre;
    @Column(name = "duration")
    private int duration;
    @Column(name = "country")
    private String country;
    @Column(name = "language")
    private String language;
    @Column(name = "director")
    private String director;
    @Column(name = "writer")
    private String writer;
    @Column(name = "production_company")
    private String production_company;
    @Column(name = "actors")
    private String actors;
    @Column(name = "description")
    private String description;
    @Column(name = "avg_vote")
    private float avg_vote;
    @Column(name = "votes")
    private int votes;
    @Column(name = "budget")
    private String budget;
    @Column(name = "usa_gross_income")
    private String usa_gross_income;
    @Column(name = "worlwide_gross_income")
    private String worlwide_gross_income;
    @Column(name = "metascore")
    private String metascore;
    @Column(name = "reviews_from_users")
    private int reviews_from_users;
    @Column(name = "reviews_from_critics")
    private int reviews_from_critics;

    @Override
    public String toString() {
        return "tutorial{" +
                "imdb_title_id='" + imdb_title_id + '\'' +
                ", title='" + title + '\'' +
                ", original_title='" + original_title + '\'' +
                ", year=" + year +
                ", date_published=" + date_published +
                ", genre='" + genre + '\'' +
                ", duration=" + duration +
                ", country='" + country + '\'' +
                ", language='" + language + '\'' +
                ", director='" + director + '\'' +
                ", writer='" + writer + '\'' +
                ", production_company='" + production_company + '\'' +
                ", actors='" + actors + '\'' +
                ", description='" + description + '\'' +
                ", avg_vote=" + avg_vote +
                ", votes=" + votes +
                ", budget='" + budget + '\'' +
                ", usa_gross_income='" + usa_gross_income + '\'' +
                ", worlwide_gross_income='" + worlwide_gross_income + '\'' +
                ", metascore='" + metascore + '\'' +
                ", reviews_from_users=" + reviews_from_users +
                ", reviews_from_critics=" + reviews_from_critics +
                '}';
    }

    public tutorial(String imdb_title_id, String title, String original_title, int year, String date_published, String genre, int duration, String country, String language, String director, String writer, String production_company, String actors, String description, float avg_vote, int votes, String budget, String usa_gross_income, String worlwide_gross_income, String metascore, int reviews_from_users, int reviews_from_critics) {
        this.imdb_title_id = imdb_title_id;
        this.title = title;
        this.original_title = original_title;
        this.year = year;
        this.date_published = date_published;
        this.genre = genre;
        this.duration = duration;
        this.country = country;
        this.language = language;
        this.director = director;
        this.writer = writer;
        this.production_company = production_company;
        this.actors = actors;
        this.description = description;
        this.avg_vote = avg_vote;
        this.votes = votes;
        this.budget = budget;
        this.usa_gross_income = usa_gross_income;
        this.worlwide_gross_income = worlwide_gross_income;
        this.metascore = metascore;
        this.reviews_from_users = reviews_from_users;
        this.reviews_from_critics = reviews_from_critics;
    }

    public String getImdb_title_id() {
        return imdb_title_id;
    }

    public void setImdb_title_id(String imdb_title_id) {
        this.imdb_title_id = imdb_title_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDate_published() {
        return date_published;
    }

    public void setDate_published(String date_published) {
        this.date_published = date_published;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getProduction_company() {
        return production_company;
    }

    public void setProduction_company(String production_company) {
        this.production_company = production_company;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getAvg_vote() {
        return avg_vote;
    }

    public void setAvg_vote(float avg_vote) {
        this.avg_vote = avg_vote;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getUsa_gross_income() {
        return usa_gross_income;
    }

    public void setUsa_gross_income(String usa_gross_income) {
        this.usa_gross_income = usa_gross_income;
    }

    public String getWorlwide_gross_income() {
        return worlwide_gross_income;
    }

    public void setWorlwide_gross_income(String worlwide_gross_income) {
        this.worlwide_gross_income = worlwide_gross_income;
    }

    public String getMetascore() {
        return metascore;
    }

    public void setMetascore(String metascore) {
        this.metascore = metascore;
    }

    public int getReviews_from_users() {
        return reviews_from_users;
    }

    public void setReviews_from_users(int reviews_from_users) {
        this.reviews_from_users = reviews_from_users;
    }

    public int getReviews_from_critics() {
        return reviews_from_critics;
    }

    public void setReviews_from_critics(int reviews_from_critics) {
        this.reviews_from_critics = reviews_from_critics;
    }
}
