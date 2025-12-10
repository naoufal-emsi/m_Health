package m.health;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class AdminDashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);
        
        CardView userCard = findViewById(R.id.userCard);
        CardView patientCard = findViewById(R.id.patientCard);
        CardView systemCard = findViewById(R.id.systemCard);
        
        userCard.setOnClickListener(v -> {
            startActivity(new Intent(this, UserManagementActivity.class));
        });
        
        patientCard.setOnClickListener(v -> {
            startActivity(new Intent(this, PatientDatabaseActivity.class));
        });
        
        systemCard.setOnClickListener(v -> {
            startActivity(new Intent(this, SystemMonitorActivity.class));
        });
    }
}