package ru.netology.domain;
// Класс предназначен для определения подписан ли пользователь на сообщество с публикацией
public class SubscribersInfo {
    private String id; //Идентификатор пользователя
    private boolean subscribeOrNot; //подписан или нет
    private int access; // определяет уровень доступа в сообществе

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isSubscribeOrNot() {
        return subscribeOrNot;
    }

    public void setSubscribeOrNot(boolean subscribeOrNot) {
        this.subscribeOrNot = subscribeOrNot;
    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }
}
