package apryt.com.apryt.ViewModel;

import android.arch.lifecycle.ViewModel;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import apryt.com.apryt.Interface.LoginCallbacks;
import apryt.com.apryt.Model.User;

public class LoginViewModel extends ViewModel {

    private User user;
    private LoginCallbacks loginCallbacks;

    public LoginViewModel(LoginCallbacks loginCallbacks){
        this.loginCallbacks = loginCallbacks;
        this.user = new User();
    }

    public TextWatcher getEmailTextWatcher(){
        return  new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                user.setEmail(s.toString());
            }
        };
    }

    public TextWatcher getPasswordTextWatcher(){
        return  new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                user.setPassword(s.toString());
            }
        };
    }

    // method to process Login
    public void onLoginClicked(View view){

        if(user.isValidData()){
            loginCallbacks.onSuccess("Login Successful");
        }else{
            loginCallbacks.onError("Login Error");
        }
    }
}
