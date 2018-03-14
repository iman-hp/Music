package ir.kushaweb.www.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class GetdataActivity extends AppCompatActivity {
ListView listdrawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getdata);
        Button btnlogin=(Button)findViewById(R.id.btnlogin);
        Button btnproduct=(Button)findViewById(R.id.btnproduct);


        btnproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(GetdataActivity.this,MusicListActivity.class);
                intent.putExtra("salam","123456");
                startActivity(intent);
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(GetdataActivity.this,LoginActivity.class);
                intent.putExtra("salam","123456");
                startActivity(intent);
            }
        });

        listdrawer=(ListView)findViewById(R.id.listdrawer);

        String names[]={"Products","Learning","About","Register",};
        ListdrawerAdapter adapter=new ListdrawerAdapter(this,names);
        listdrawer.setAdapter(adapter);

    }
    }

