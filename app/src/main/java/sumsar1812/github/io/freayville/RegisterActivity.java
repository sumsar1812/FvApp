package sumsar1812.github.io.freayville;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    private EditText username;
    private EditText passowrd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initViews();
        if (savedInstanceState == null) {
            Bundle extra = getIntent().getExtras();
            if (extra != null) {
                username.setText("Navn: " + extra.getString(Constants.USERNAME_EXTRA));
            }
        } else {
            username.setText("Navn: " + (String) savedInstanceState.getSerializable(Constants.USERNAME_EXTRA));
        }
    }

    private void initViews() {
        username = findViewById(R.id.editTextUsername);
        passowrd = findViewById(R.id.editTextPassword);
    }
}
