package ru.netology.domain;

public class LikeInfo {
    private int likeId;  //идентификатор пользователя поставившего лайк
    private int likeCountOfPost;   //счетчик кол-ва лайков публикации
    private int likeCountComment;      //счетчик кол-ва лайков к каждому из комментариев

    public int getLikeId() {
        return likeId;
    }

    public void setLikeId(int likeId) {
        this.likeId = likeId;
    }

    public int getLikeCountOfPost() {
        return likeCountOfPost;
    }

    public void setLikeCountOfPost(int likeCountOfPost) {
        this.likeCountOfPost = likeCountOfPost;
    }

    public int getLikeCountComment() {
        return likeCountComment;
    }

    public void setLikeCountComment(int likeCountComment) {
        this.likeCountComment = likeCountComment;
    }
}
