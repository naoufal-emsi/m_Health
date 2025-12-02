package m.health;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AdminDashboardActivity extends AppCompatActivity {
    private Button userManagementBtn, patientDatabaseBtn, systemMonitorBtn, logoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);
        
        userManagementBtn = findViewById(R.id.userManagementBtn);
        patientDatabaseBtn = findViewById(R.id.patientDatabaseBtn);
        systemMonitorBtn = findViewById(R.id.systemMonitorBtn);
        logoutBtn = findViewById(R.id.logoutBtn);
        
        userManagementBtn.setOnClickListener(v -> startActivity(new Intent(this, UserManagementActivity.class)));
        patientDatabaseBtn.setOnClickListener(v -> startActivity(new Intent(this, PatientDatabaseActivity.class)));
        systemMonitorBtn.setOnClickListener(v -> startActivity(new Intent(this, SystemMonitorActivity.class)));
        logoutBtn.setOnClickListener(v -> {
            startActivity(new Intent(this, AdminLoginActivity.class));
            finish();
        });
    }
}