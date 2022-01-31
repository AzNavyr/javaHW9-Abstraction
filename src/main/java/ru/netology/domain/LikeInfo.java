package ru.netology.domain;

public class LikeInfo {
    private int likeCountOfPost;   //счетчик кол-ва лайков публикации
    private int likeId;  //идентификатор пользователя поставившего лайк
    private int canLike;
    private int canPublish;
    private SubscribersInfo subscribersInfo;
    private int likeCountComment;      //счетчик кол-ва лайков к каждому из комментариев

    public int getLikeCountOfPost() {
        return likeCountOfPost;
    }

    public void setLikeCountOfPost(int likeCountOfPost) {
        this.likeCountOfPost = likeCountOfPost;
    }

    public int getLikeId() {
        return likeId;
    }

    public void setLikeId(int likeId) {
        this.likeId = likeId;
    }

    public int getCanLike() {
        return canLike;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }

    public SubscribersInfo getSubscribersInfo() {
        return subscribersInfo;
    }

    public void setSubscribersInfo(SubscribersInfo subscribersInfo) {
        this.subscribersInfo = subscribersInfo;
    }

    public int getLikeCountComment() {
        return likeCountComment;
    }

    public void setLikeCountComment(int likeCountComment) {
        this.likeCountComment = likeCountComment;
    }
}
