package ru.netology.domain;

public class CommentInfo {
    private int commentId;        //идентификатор коментария
    private int commentAuthorId;    //идентификатор автора коментария
    private int countComment;      //кол-во комментариев
    private int threadCount;      // счетчик кол-ва рекомментов
    private int threadId;
    private int likeCountComment;      //счетчик кол-ва лайков к каждому из комментариев

    public void setCommentId(int commentId) {
        this.commentId = commentId;//команда присваивает id пользователя
    }


}
