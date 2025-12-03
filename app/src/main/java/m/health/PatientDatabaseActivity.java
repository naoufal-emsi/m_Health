package m.health;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class PatientDatabaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_database);
        
        Button viewButton = findViewById(R.id.viewButton);
        Button addButton = findViewById(R.id.addButton);
        Button updateButton = findViewById(R.id.updateButton);
        Button backButton = findViewById(R.id.backButton);
        
        backButton.setOnClickListener(v -> finish());
    }
}