package ro.ibm.summerschool.myfantasticuniversity.chat;

import java.io.Serializable;

public class Contact implements Serializable {

     String contactName;
     String description;

    String profileUrl;
    Integer ContactId;

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public Integer getContactId() {
        return ContactId;
    }

    public void setContactId(Integer contactId) {
        ContactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public Contact(String contactName, String description) {
//        this.contactName = contactName;
//        this.description = description;
//    }

}
