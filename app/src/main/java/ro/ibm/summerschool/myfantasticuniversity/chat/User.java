package ro.ibm.summerschool.myfantasticuniversity.chat;

import ro.ibm.summerschool.myfantasticuniversity.chat.Message;

public class User  extends MessageModel {
    String nickname;
    String profileUrl;
    Integer UserId;

    public User(String message, int messageType) {
        super(message, messageType);
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }
}
