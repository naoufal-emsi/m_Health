package m.health;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.List;

public class SystemMonitorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_monitor);
        
        ListView statusList = findViewById(R.id.statusList);
        Button backButton = findViewById(R.id.backButton);
        
        List<String> systemStatus = Arrays.asList(
            "✓ Database Server: Online",
            "✓ Web Server: Running",
            "✓ Security System: Active",
            "✓ Backup Service: Completed",
            "⚠ Memory Usage: 78%",
            "✓ Network Status: Stable",
            "✓ User Sessions: 12 Active",
            "✓ Last Backup: Today 02:00",
            "✓ System Uptime: 15 days"
        );
        
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, systemStatus);
        statusList.setAdapter(adapter);
        
        backButton.setOnClickListener(v -> finish());
    }
}