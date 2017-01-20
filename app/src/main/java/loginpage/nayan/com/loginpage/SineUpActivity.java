package loginpage.nayan.com.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SineUpActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvName, tvEmail, tvPassword, tvTextView;
    private EditText etFirstEditText1, etSecondEditText2, etThirdEditText3;
    private Button tvCreateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sine_up);

        ini();
        create_account();
    }

    private void ini() {
        etFirstEditText1 = (EditText) findViewById(R.id.etFirstEditText1);
        etSecondEditText2 = (EditText) findViewById(R.id.etSecondEditText2);
        etThirdEditText3 = (EditText) findViewById(R.id.etThirdEditText3);
        tvCreateButton = (Button) findViewById(R.id.tvCreateButton);
    }

    public void create_account() {
        tvCreateButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btCreateButton:
                create();
                break;
        }

    }

    public void create() {
        Toast.makeText(getApplicationContext(), "Please", Toast.LENGTH_LONG).show();
    }
}


