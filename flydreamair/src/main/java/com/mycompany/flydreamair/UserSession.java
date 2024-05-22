package com.mycompany.flydreamair;


public class UserSession {
    private static User currentUser;
    
    public UserSession() {
        
    }
    
    public static User getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(User user) {
        currentUser = user;
    }
    
}
