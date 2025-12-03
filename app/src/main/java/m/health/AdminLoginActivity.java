package m.health;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AdminLoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        
        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(v -> {
            startActivity(new Intent(this, AdminDashboardActivity.class));
        });
    }
}