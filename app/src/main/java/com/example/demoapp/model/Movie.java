package com.example.demoapp.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;


public class Movie {
        public String getTitle() {
                return Title;
        }

        public void setTitle(String title) {
                Title = title;
        }

        public List<String> getImages() {
                return images;
        }

        public void setImages(List<String> images) {
                this.images = images;
        }

        public String getYear() {
                return Year;
        }

        public void setYear(String year) {
                Year = year;
        }

        public String getRated() {
                return Rated;
        }

        public void setRated(String rated) {
                Rated = rated;
        }

        public String getReleased() {
                return Released;
        }

        public void setReleased(String released) {
                Released = released;
        }

        public String getRuntime() {
                return Runtime;
        }

        public void setRuntime(String runtime) {
                Runtime = runtime;
        }

        public String getGenre() {
                return Genre;
        }

        public void setGenre(String genre) {
                Genre = genre;
        }

        public String getDirector() {
                return Director;
        }

        public void setDirector(String director) {
                Director = director;
        }

        public String getWriter() {
                return Writer;
        }

        public void setWriter(String writer) {
                Writer = writer;
        }

        public String getActors() {
                return Actors;
        }

        public void setActors(String actors) {
                Actors = actors;
        }

        public String getPlot() {
                return Plot;
        }

        public void setPlot(String plot) {
                Plot = plot;
        }

        public String getLanguage() {
                return Language;
        }

        public void setLanguage(String language) {
                Language = language;
        }

        public String getCountry() {
                return Country;
        }

        public void setCountry(String country) {
                Country = country;
        }

        public String getAwards() {
                return Awards;
        }

        public void setAwards(String awards) {
                Awards = awards;
        }

        public String getPoster() {
                return Poster;
        }

        public void setPoster(String poster) {
                Poster = poster;
        }

        public String getMetascore() {
                return Metascore;
        }

        public void setMetascore(String metascore) {
                Metascore = metascore;
        }

        public String getImdbRating() {
                return imdbRating;
        }

        public void setImdbRating(String imdbRating) {
                this.imdbRating = imdbRating;
        }

        public String getImdbVotes() {
                return imdbVotes;
        }

        public void setImdbVotes(String imdbVotes) {
                this.imdbVotes = imdbVotes;
        }

        public String getImdbType() {
                return imdbType;
        }

        public void setImdbType(String imdbType) {
                this.imdbType = imdbType;
        }

        public String getType() {
                return Type;
        }

        public void setType(String type) {
                Type = type;
        }

        public String getResponse() {
                return Response;
        }

        public void setResponse(String response) {
                Response = response;
        }

        private String Title;
        private List<String> images;
        private String Year;
        private String Rated;
        private String Released;
        private String Runtime;
        private String Genre;
        private String Director;
        private String Writer;
        private String Actors;
        private String Plot;
        private String Language;
        private String Country;
        private String Awards;
        private String Poster;
        private String Metascore;
        private String imdbRating;
        private String imdbVotes;
        private String imdbType;
        private String Type;
        private String Response;


}
