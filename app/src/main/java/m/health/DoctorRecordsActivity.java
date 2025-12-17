package m.health;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.List;

public class DoctorRecordsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_records);
        
        ListView patientRecordsList = findViewById(R.id.patientRecordsList);
        Button backButton = findViewById(R.id.backButton);
        
        List<String> patientRecords = Arrays.asList(
            "Amina Cherkaoui - Diabète Type 2 - Dernière visite: 15/12/2024",
            "Hassan Benjelloun - Hypertension - Dernière visite: 14/12/2024",
            "Salma Ouali - Asthme - Dernière visite: 13/12/2024",
            "Karim El Fassi - Cholestérol élevé - Dernière visite: 12/12/2024",
            "Nadia Berrada - Arythmie cardiaque - Dernière visite: 11/12/2024",
            "Mehdi Lahlou - Suivi post-opératoire - Dernière visite: 10/12/2024",
            "Zineb Alaoui - Allergie alimentaire - Dernière visite: 09/12/2024",
            "Abderrahim Tounsi - Arthrite - Dernière visite: 08/12/2024",
            "Leila Benkirane - Migraine chronique - Dernière visite: 07/12/2024",
            "Saad Chraibi - Bilan de santé - Dernière visite: 06/12/2024"
        );
        
        PatientAdapter adapter = new PatientAdapter(this, patientRecords);
        patientRecordsList.setAdapter(adapter);
        
        backButton.setOnClickListener(v -> finish());
    }
}