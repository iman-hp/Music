package ir.kushaweb.www.music;

import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.orhanobut.hawk.Hawk;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText email;
    EditText pass;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Hawk.init(this).build();
        bindViews();
    }


    void bindViews() {

        email = (EditText) findViewById(R.id.edtmail);
        pass = (EditText) findViewById(R.id.edtpass);
        save = (Button) findViewById(R.id.btn_send);
        save.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_send) {
            String emailV=email.getText().toString();
            String passV=pass.getText().toString();
            setShared("email",emailV);
            setShared("pass",passV);
        }
    }

    void setShared(String key,String value){
        PreferenceManager.getDefaultSharedPreferences(this).edit().putString(key,value).apply();
        setHawk(key,value);
    }
    String getShared(String key,String value){
        return PreferenceManager.getDefaultSharedPreferences(this).getString(key,value);



    }

void setHawk(String key,String value){
        Hawk.put(key,value);
}
String getHawk(String key){
    return Hawk.get("key");
}
}
