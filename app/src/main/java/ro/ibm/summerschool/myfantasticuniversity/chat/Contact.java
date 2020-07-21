package ro.ibm.summerschool.myfantasticuniversity.chat;

public class Contact extends Message {

    private String contactName;
    private String description;

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


    @Override
    public String toString() {
        return "Contact{" +
                "contactName='" + contactName + '\'' +
                ", description='" + description + '\'' +
                ", profileUrl='" + profileUrl + '\'' +
                ", ContactId=" + ContactId +
                '}';
    }
}
