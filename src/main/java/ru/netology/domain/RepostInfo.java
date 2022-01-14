package ru.netology.domain;

public class RepostInfo {
    private  int countReposts;
    private int userReposted;

    public int getCountReposts() {
        return countReposts;
    }

    public void setCountReposts(int countReposts) {
        this.countReposts = countReposts;
    }

    public int getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }
}