package m.health;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SystemMonitorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_monitor);
        
        Button statusButton = findViewById(R.id.statusButton);
        Button securityButton = findViewById(R.id.securityButton);
        Button backupButton = findViewById(R.id.backupButton);
        Button backButton = findViewById(R.id.backButton);
        
        backButton.setOnClickListener(v -> finish());
    }
}