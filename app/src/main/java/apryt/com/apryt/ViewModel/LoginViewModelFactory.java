package apryt.com.apryt.ViewModel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import apryt.com.apryt.Interface.LoginCallbacks;

public class LoginViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    public LoginCallbacks loginCallbacks;

    public LoginViewModelFactory(LoginCallbacks loginCallbacks){
        this.loginCallbacks = loginCallbacks;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new LoginViewModel(loginCallbacks);
    }


}
