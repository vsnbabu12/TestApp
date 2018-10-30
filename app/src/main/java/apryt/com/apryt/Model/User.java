package apryt.com.apryt.Model;

import android.databinding.BaseObservable;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Patterns;

public class User extends BaseObservable {

    @NonNull
    private String email;
    @NonNull
    private String password;

    public User(@NonNull String email,@NonNull   String password) {
          this.email = email;
        this.password = password;
    }

    public User() {

    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    public boolean isValidData(){
        return !TextUtils.isEmpty(getEmail()) &&
                Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() &&
                getPassword().length()  > 6;
    }
}
