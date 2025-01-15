public class User {
    private String userId;
    private String password;
    private String email;
    private String userType;

    // Constructor
    public User(String userId, String password, String email, String userType) {
        this.userId = userId;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    // Method to create a user
    public String createUser() {
        return "User " + userId + " created.";
    }

    // Method to reset the password
    public String resetPassword(String newPassword) {
        this.password = newPassword;
        return "Password for user " + userId + " has been reset.";
    }

    // Getters and Setters (optional for encapsulation)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
