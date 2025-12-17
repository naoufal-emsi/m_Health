package m.health;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.List;

public class DoctorResultsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_results);
        
        ListView resultsList = findViewById(R.id.resultsList);
        Button backButton = findViewById(R.id.backButton);
        
        List<String> medicalResults = Arrays.asList(
            "Amina Cherkaoui - Glycémie: 1.2g/L - Normal ✓",
            "Hassan Benjelloun - Tension: 14/9 - Élevée ⚠",
            "Salma Ouali - Spirométrie: 85% - Bon ✓",
            "Karim El Fassi - Cholestérol: 2.8g/L - Élevé ⚠",
            "Nadia Berrada - ECG: Rythme sinusal - Normal ✓",
            "Mehdi Lahlou - Radio thorax: RAS - Normal ✓",
            "Zineb Alaoui - Test allergique: Positif arachides ⚠",
            "Abderrahim Tounsi - CRP: 15mg/L - Inflammatoire ⚠",
            "Leila Benkirane - IRM cérébrale: RAS - Normal ✓",
            "Saad Chraibi - Bilan lipidique: Normal ✓"
        );
        
        MedicalResultAdapter adapter = new MedicalResultAdapter(this, medicalResults);
        resultsList.setAdapter(adapter);
        
        backButton.setOnClickListener(v -> finish());
    }
}