package ru.netology.domain;

public class CommentInfo {
    private int count;
    private int canPost;
    private int groupCanPost;
    private boolean canClose;
    private boolean canOpen;
    private int commentId;        //идентификатор коментария
    private int commentAuthorId;    //идентификатор автора коментария
    private int countComment;      //кол-во комментариев
    private int threadCount;      // счетчик кол-ва рекомментов
    private int threadId;         //
    private int likeCountComment;      //счетчик кол-ва лайков к каждому из комментариев

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCanPost() {
        return canPost;
    }

    public void setCanPost(int canPost) {
        this.canPost = canPost;
    }

    public int getGroupCanPost() {
        return groupCanPost;
    }

    public void setGroupCanPost(int groupCanPost) {
        this.groupCanPost = groupCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getCommentAuthorId() {
        return commentAuthorId;
    }

    public void setCommentAuthorId(int commentAuthorId) {
        this.commentAuthorId = commentAuthorId;
    }

    public int getCountComment() {
        return countComment;
    }

    public void setCountComment(int countComment) {
        this.countComment = countComment;
    }

    public int getThreadCount() {
        return threadCount;
    }

    public void setThreadCount(int threadCount) {
        this.threadCount = threadCount;
    }

    public int getThreadId() {
        return threadId;
    }

    public void setThreadId(int threadId) {
        this.threadId = threadId;
    }

    public int getLikeCountComment() {
        return likeCountComment;
    }

    public void setLikeCountComment(int likeCountComment) {
        this.likeCountComment = likeCountComment;
    }
}
