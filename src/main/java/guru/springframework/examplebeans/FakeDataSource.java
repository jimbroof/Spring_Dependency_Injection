package guru.springframework.examplebeans;

/**
 * Created by Joachim on 23/03/2018.
 */
public class FakeDataSource {

    private String user;
    private String password;
    private String url;

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }


    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
