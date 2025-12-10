package m.health;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AdminLoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        
        EditText usernameInput = findViewById(R.id.usernameInput);
        EditText passwordInput = findViewById(R.id.passwordInput);
        Button loginButton = findViewById(R.id.loginButton);
        
        loginButton.setOnClickListener(v -> {
            String username = usernameInput.getText().toString().trim();
            String password = passwordInput.getText().toString().trim();
            
            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                return;
            }
            
            // Simple validation (in real app, use proper authentication)
            if (username.equals("admin") && password.equals("admin123")) {
                startActivity(new Intent(this, AdminDashboardActivity.class));
                finish();
            } else {
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show();
            }
        });
    }
}