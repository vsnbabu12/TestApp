package apryt.com.apryt;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import apryt.com.apryt.Interface.LoginCallbacks;
import apryt.com.apryt.ViewModel.LoginViewModel;
import apryt.com.apryt.ViewModel.LoginViewModelFactory;
import apryt.com.apryt.databinding.LoginLayoutBinding;
import es.dmoral.toasty.Toasty;

public class LoginActivity extends AppCompatActivity implements LoginCallbacks{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.login_layout);
            //LoginLayoutBinding loginLayoutBinding = DataBindingUtil.
        LoginLayoutBinding loginLayoutBinding = DataBindingUtil.setContentView(this,R.layout.login_layout);
        loginLayoutBinding.setViewModel(ViewModelProviders.of(this,
                new LoginViewModelFactory(this))
                .get(LoginViewModel.class));
    }

    @Override
    public void onSuccess(String message) {

        Toasty.success(this,"Login Success", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onError(String message) {
        Toasty.error(this,"Login Error", Toast.LENGTH_SHORT).show();
    }
}
