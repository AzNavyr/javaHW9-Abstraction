package ru.netology.domain;

public class Post {
    private int postId;     //идентификатор поста
    private int authorId;     //идентификатор автора поста
    private int dataPost;       //дата публикации
    private String postText;      //текст публикации
    private int viewerPostCount;    //счетчик кол-ва просмотров поста
    private boolean isPrivatPostOrNot;      //приватная публикация или нет
    private boolean isFixedPostOrNot;       //закрепленная публикация или нет

    public void setAuthorId(int authorId) {
        //вызов команды присваиет идентификатор автора публикацие
    }

    public void setDataPost() {
        //данная команда присваивает дату публикации
    }

    public void setPostText(String postText) {
        //команда позволяет присвоить текст публикации
    }

    public void setViewerPostCount() {
        //команда подсчитывает количество просмотревщих запись
    }

    public boolean isFixedPostOrNot(int oneOrNull) {
        // команда принимает на вход 1 или 0 и обрабатывает данные 1 -закрепленный пост, 0 не закреплен
    }

    public boolean isPrivatOrNot(int oneOrNull) {
        //команда принимающая на вход 1 или 0 и обрабатывающая данные 1-приватный пост, 0-общедоступный
    }

}
