package sumsar1812.github.io.freayville;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterCodeActivity extends AppCompatActivity {

    private Button acceptBtn;
    private EditText codeInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_code);
        initViews();
    }

    private void initViews() {
        acceptBtn = findViewById(R.id.acceptCodeBtn);
        codeInput = findViewById(R.id.editTextCodeReg);

        acceptBtn.setWidth(codeInput.getWidth());


    }
}

