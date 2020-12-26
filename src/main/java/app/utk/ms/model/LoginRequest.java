package app.utk.ms.model;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class LoginRequest implements Serializable {

    @NotBlank(message="Channel Id cannot be blank")
    private String channelId;

    //private int userTypeId = UserType.AGENT.getUserTypeId();

    @NotBlank(message="Username cannot be blank")
    private String username;

    @NotBlank(message="Password cannot be blank")
    private String password;

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
