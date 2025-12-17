package m.health;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.List;

public class DoctorAppointmentsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_appointments);
        
        ListView appointmentsList = findViewById(R.id.appointmentsList);
        Button backButton = findViewById(R.id.backButton);
        
        List<String> appointments = Arrays.asList(
            "09:00 - Amina Cherkaoui - Consultation générale",
            "09:30 - Hassan Benjelloun - Suivi diabète",
            "10:00 - Salma Ouali - Contrôle tension",
            "10:30 - Karim El Fassi - Résultats analyses",
            "11:00 - Nadia Berrada - Consultation cardiologie",
            "11:30 - Mehdi Lahlou - Vaccination",
            "14:00 - Zineb Alaoui - Consultation pédiatrie",
            "14:30 - Abderrahim Tounsi - Suivi traitement",
            "15:00 - Leila Benkirane - Consultation dermatologie",
            "15:30 - Saad Chraibi - Bilan de santé"
        );
        
        AppointmentAdapter adapter = new AppointmentAdapter(this, appointments);
        appointmentsList.setAdapter(adapter);
        
        backButton.setOnClickListener(v -> finish());
    }
}