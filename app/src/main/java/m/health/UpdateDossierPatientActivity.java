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


    public class UpdateDossierPatientActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_update_dossier_patient);

            Button btnNouveau = findViewById(R.id.btn_nouveau_dossier);
            Button btnModifier = findViewById(R.id.btn_maj_dossier_existant);
            Button btnVoirTout = findViewById(R.id.btn_voir_tous_dossier);

            btnNouveau.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(UpdateDossierPatientActivity.this,
                            "Ouverture du formulaire de création...", Toast.LENGTH_SHORT).show();
                }
            });

            btnModifier.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(UpdateDossierPatientActivity.this, FormModifierDossierActivity.class);
                    startActivity(intent);
                }
            });

            btnVoirTout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(UpdateDossierPatientActivity.this,
                            "Chargement de la liste des dossiers...", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
