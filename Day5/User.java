public class User {
    String userID;
    String userName;
    String userAddress;
    String userPhoneNumber;

    public User(String userID, String userName, String userAddress, String userPhoneNumber) {
        this.userID = userID;
        this.userName = userName;
        this.userAddress = userAddress;
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    @Override
    public String toString()
    {
        return "User ID: "+userID+" User Name: "+userName+" User Address: "+userAddress+" User Phone: "+userPhoneNumber;
    }
    
}
