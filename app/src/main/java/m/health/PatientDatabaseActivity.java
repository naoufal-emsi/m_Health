package m.health;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;

public class PatientDatabaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_database);
        
        ListView patientList = findViewById(R.id.patientList);
        Button addPatientBtn = findViewById(R.id.addPatientBtn);
        Button backBtn = findViewById(R.id.backBtn);
        
        ArrayList<String> patients = new ArrayList<>(Arrays.asList(
            "Total Patients: 1,247",
            "Active Records: 1,198", 
            "Pending Approvals: 12",
            "Data Integrity: 99.8%",
            "Last Backup: Today 2:00 AM"
        ));
        
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, patients);
        patientList.setAdapter(adapter);
        
        patientList.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "View details: " + patients.get(position), Toast.LENGTH_SHORT).show();
        });
        
        addPatientBtn.setOnClickListener(v -> {
            Toast.makeText(this, "Add patient functionality", Toast.LENGTH_SHORT).show();
        });
        
        backBtn.setOnClickListener(v -> finish());
    }
}