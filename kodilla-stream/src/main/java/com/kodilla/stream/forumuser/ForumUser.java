package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int identyfier;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfposts;

    public ForumUser(final int identyfier, final String userName, final char sex, LocalDate birthDate, final int numberOfPosts) {
        this.identyfier = identyfier;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.numberOfposts = numberOfPosts;
    }

    public int getIdentyfier() {
        return identyfier;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfposts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identyfier=" + identyfier +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberOfposts=" + numberOfposts +
                '}';
    }
}
