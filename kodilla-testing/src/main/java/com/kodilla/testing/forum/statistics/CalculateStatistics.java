package com.kodilla.testing.forum.statistics;


public class CalculateStatistics {

    Statistics statistics;
    int numbersOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double avrPosts;
    double avrComments;
    double avrCommToPost;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getNumbersOfUsers() {
        return numbersOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvrPosts() {
        return avrPosts;
    }

    public double getAvrComments() {
        return avrComments;
    }

    public double getAvrCommToPost() {
        return avrCommToPost;
    }

    public void CalculateAdvStatistics(Statistics statistics) {
        numbersOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postCount();
        numberOfComments = statistics.commentsCount();
        if(numberOfPosts == 0 || numbersOfUsers == 0) {
            avrPosts = 0;
        } else {
            avrPosts =  (double) numberOfPosts /   numbersOfUsers;
        }
        if(numberOfComments == 0 || numbersOfUsers == 0) {
            avrComments = 0;
        } else {
            avrComments = (double) numberOfComments / numbersOfUsers;
        }
        if(numberOfComments == 0 || numberOfPosts == 0) {
            avrCommToPost = 0;
        }else {
            avrCommToPost = (double) numberOfComments / numberOfPosts;
        }
    }
}
