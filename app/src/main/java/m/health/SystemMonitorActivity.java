package m.health;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;

public class SystemMonitorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_monitor);
        
        ListView systemList = findViewById(R.id.systemList);
        Button refreshBtn = findViewById(R.id.refreshBtn);
        Button backBtn = findViewById(R.id.backBtn);
        
        ArrayList<String> systemStats = new ArrayList<>(Arrays.asList(
            "System Status: Online",
            "Active Users: 156",
            "Server Load: 67%",
            "Database Status: Healthy",
            "Security: No Threats",
            "Last Update: Today 1:30 PM"
        ));
        
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, systemStats);
        systemList.setAdapter(adapter);
        
        systemList.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "Monitor: " + systemStats.get(position), Toast.LENGTH_SHORT).show();
        });
        
        refreshBtn.setOnClickListener(v -> {
            Toast.makeText(this, "System refreshed", Toast.LENGTH_SHORT).show();
        });
        
        backBtn.setOnClickListener(v -> finish());
    }
}