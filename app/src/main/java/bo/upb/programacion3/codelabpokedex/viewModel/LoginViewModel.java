package bo.upb.programacion3.codelabpokedex.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import bo.upb.programacion3.codelabpokedex.model.Repository.Base;
import bo.upb.programacion3.codelabpokedex.model.Repository.Usuario;
import bo.upb.programacion3.codelabpokedex.model.ui.userLogged;
import bo.upb.programacion3.codelabpokedex.model.utils.ResponseMapper;

public class LoginViewModel extends AndroidViewModel {
    public LoginViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Base> login(final String email, final String password) {
        final MutableLiveData<Base> result = new MutableLiveData<>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    Usuario user = new Usuario();
                    user.setUuid("1");
                    user.setEmail(email);

                    userLogged userLogged = ResponseMapper.mapUserToUserLooged(user);
                    result.postValue(new Base(userLogged));
                } catch (InterruptedException ex) {
                    result.postValue(new Base("Interrupted", ex));
                }
            }
        }).start();
        return result;
    }
}
