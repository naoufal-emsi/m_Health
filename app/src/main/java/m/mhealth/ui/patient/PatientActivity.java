package m.mhealth.ui.patient;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import m.health.R;

public class PatientActivity extends AppCompatActivity {

    private LinearLayout cardRdv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ✅ On affiche l'écran patient
        setContentView(R.layout.activity_patient_dashboard);

        // ✅ On récupère la carte Rendez-vous
        cardRdv = findViewById(R.id.cardRdv);

        // Sécurité (évite crash si problème d'id)
        if (cardRdv != null) {
            cardRdv.setOnClickListener(v -> {
                Intent intent = new Intent(
                        PatientActivity.this,
                        BookAppointmentActivity.class
                );
                startActivity(intent);
            });
        }
    }
}
