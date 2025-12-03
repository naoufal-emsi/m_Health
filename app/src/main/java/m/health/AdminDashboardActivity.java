package m.health;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AdminDashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);
        
        Button userButton = findViewById(R.id.userButton);
        Button patientButton = findViewById(R.id.patientButton);
        Button systemButton = findViewById(R.id.systemButton);
        
        userButton.setOnClickListener(v -> {
            startActivity(new Intent(this, UserManagementActivity.class));
        });
        
        patientButton.setOnClickListener(v -> {
            startActivity(new Intent(this, PatientDatabaseActivity.class));
        });
        
        systemButton.setOnClickListener(v -> {
            startActivity(new Intent(this, SystemMonitorActivity.class));
        });
    }
}