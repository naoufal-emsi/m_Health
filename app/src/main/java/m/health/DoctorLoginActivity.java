package m.health;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DoctorLoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_login);
        
        EditText usernameInput = findViewById(R.id.doctorUsernameInput);
        EditText passwordInput = findViewById(R.id.doctorPasswordInput);
        Button loginButton = findViewById(R.id.doctorLoginButton);
        
        loginButton.setOnClickListener(v -> {
            String username = usernameInput.getText().toString().trim();
            String password = passwordInput.getText().toString().trim();
            
            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
                return;
            }
            
            if (username.equals("medecin") && password.equals("medecin123")) {
                startActivity(new Intent(this, DoctorDashboardActivity.class));
                finish();
            } else {
                Toast.makeText(this, "Identifiants incorrects", Toast.LENGTH_SHORT).show();
            }
        });
    }
}