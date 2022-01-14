package ru.netology.domain;

public class LikeInfo {
    private int likeId;  //идентификатор пользователя поставившего лайк
    private int likeCountOfPost;   //счетчик кол-ва лайков публикации
    private int likeCountComment;      //счетчик кол-ва лайков к каждому из комментариев

    public void setCanRepost(int canRepos) {
        //если 1 то может сделать репост, 0 тогда не может сделать репост
    }

}
