package loginpage.nayan.com.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //    private TextView tvEmail, tvPassword, tvBottomTextView;
    private EditText etFirstEditText, etSecondEditText;
    private Button btLoginButton, btCreateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ini();
        loginButton();
    }

    public void ini() {
//        tvEmail= (TextView) findViewById(R.id.tvEmail);
//        tvPassword= (TextView) findViewById(R.id.tvPassword);
//        tvBottomTextView= (TextView) findViewById(R.id.tvBottomTextView);
        etFirstEditText = (EditText) findViewById(R.id.etFirstEditText1);
        etSecondEditText = (EditText) findViewById(R.id.etSecondEditText);
        btLoginButton = (Button) findViewById(R.id.btLoginButton);
        btCreateButton = (Button) findViewById(R.id.btCreateButton);

    }

    private void loginButton() {
        btLoginButton.setOnClickListener(this);
        btCreateButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btLoginButton:
                login();

                break;
            case R.id.btCreateButton:
                sineUp();
                break;

        }

    }

    public void login() {
        String userName = etFirstEditText.getText().toString().trim();
        String password = etSecondEditText.getText().toString().trim();

        if (userName.matches("")) {
            Toast.makeText(getApplicationContext(), "Please Enter Your Email and Password.", Toast.LENGTH_LONG).show();
            return;
            } else {
            Intent output=new Intent(MainActivity.this, OutputActivity.class);
            startActivity(output);
            Toast.makeText(getApplicationContext(),"User Name: "+ userName+"\nPassword: "+password,Toast.LENGTH_LONG).show();
            return;
        }
//           else {
//            Toast.makeText(getApplicationContext(), "Username :" + userName + "\nPassword  :" + password, Toast.LENGTH_LONG).show();
//            return;
//        }


    }

    public void sineUp() {
        Intent sineUpName = new Intent(MainActivity.this, SineUpActivity.class);
        startActivity(sineUpName);


    }


}


