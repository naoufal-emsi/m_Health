package m.health;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

    public class CoordinationMedecinActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_coordination_medecin);

            Button btnPlanning = findViewById(R.id.btn_consulter_planning_medecin);
            Button btnDemandes = findViewById(R.id.btn_transmettre_demandes_rdv);
            Button btnUrgences = findViewById(R.id.btn_transmettre_messages_urgents);

            btnPlanning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(CoordinationMedecinActivity.this, ConsultationPlanningActivity.class);
                    startActivity(intent);
                }
            });

            btnDemandes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(CoordinationMedecinActivity.this,
                            "Demande de RDV transmise au médecin", Toast.LENGTH_SHORT).show();
                }
            });

            btnUrgences.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(CoordinationMedecinActivity.this,
                            "ALERTE : Message urgent envoyé", Toast.LENGTH_LONG).show();
                }
            });
        }
    }
