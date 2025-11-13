import java.util.*;
import java.io.*;

public class users {
    
    private String username;
    private String email;
    private UUID userId;

    public users(String username, String email) {
        this.username = username;
        this.email = email;
        this.userId = UUID.randomUUID();
    }

    private String getUsername() {
        return this.username;
    }

}