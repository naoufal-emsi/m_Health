package m.health;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.List;

public class PatientDatabaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_database);
        
        ListView patientsList = findViewById(R.id.patientsList);
        Button addButton = findViewById(R.id.addButton);
        Button backButton = findViewById(R.id.backButton);
        
        List<String> patients = Arrays.asList(
            "Amina Cherkaoui - ID: 001",
            "Hassan Benjelloun - ID: 002",
            "Salma Ouali - ID: 003",
            "Karim El Fassi - ID: 004",
            "Nadia Berrada - ID: 005",
            "Mehdi Lahlou - ID: 006",
            "Zineb Alaoui - ID: 007",
            "Abderrahim Tounsi - ID: 008",
            "Leila Benkirane - ID: 009",
            "Saad Chraibi - ID: 010"
        );
        
        PatientAdapter adapter = new PatientAdapter(this, patients);
        patientsList.setAdapter(adapter);
        
        backButton.setOnClickListener(v -> finish());
    }
}