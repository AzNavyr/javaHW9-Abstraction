package ru.netology.domain;

public class Post {
    private WritingOnTheWall writingOnTheWall;
    private Information information;
    private SubscribersInfo subscribersInfo;
    private String postId; //идентификатор записи
    private int ownerId; //идентификатор пользователя или сообщества.
    private int fromId;
    private int createBy;
    private int date; // время и дата публикауии
    private String text; // текст публикации
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private CommentInfo commentInfo; //комментарии
    private Copyright copyright;
    private LikeInfo likeInfo; //лайки
    private RepostInfo repostInfo; // репосты
    private View view;
    private String postType;
    private PostSource postSource;
    private String imageUrl; //адрес картинки
    private Geo geo;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPenned;
    private int markedAsAds;
    private boolean isFavorite;
    private Donut donut;
    private int postponedId;
    private String name; // название

    public WritingOnTheWall getWritingOnTheWall() {
        return writingOnTheWall;
    }

    public void setWritingOnTheWall(WritingOnTheWall writingOnTheWall) {
        this.writingOnTheWall = writingOnTheWall;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public CommentInfo getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(CommentInfo commentInfo) {
        this.commentInfo = commentInfo;
    }

    public LikeInfo getLikeInfo() {
        return likeInfo;
    }

    public void setLikeInfo(LikeInfo likeInfo) {
        this.likeInfo = likeInfo;
    }

    public RepostInfo getRepostInfo() {
        return repostInfo;
    }

    public void setRepostInfo(RepostInfo repostInfo) {
        this.repostInfo = repostInfo;
    }

    public SubscribersInfo getSubscribersInfo() {
        return subscribersInfo;
    }

    public void setSubscribersInfo(SubscribersInfo subscribersInfo) {
        this.subscribersInfo = subscribersInfo;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }
}
