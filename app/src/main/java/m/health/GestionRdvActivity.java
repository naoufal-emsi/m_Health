package m.health;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GestionRdvActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_gestion_rdv);

            Button btnCreer = findViewById(R.id.btn_creer_rdv);
            Button btnModifier = findViewById(R.id.btn_modifier_annuler_rdv);
            Button btnConfirmer = findViewById(R.id.btn_confirmer_rdv);
            Button btnConsulter = findViewById(R.id.btn_consulter_liste_rdv);


            btnCreer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(GestionRdvActivity.this, "Créer un nouveau RDV", Toast.LENGTH_SHORT).show();
                }
            });

            btnModifier.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(GestionRdvActivity.this, "Modifier/Annuler RDV", Toast.LENGTH_SHORT).show();
                }
            });

            btnConfirmer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(GestionRdvActivity.this, "Confirmation des RDV", Toast.LENGTH_SHORT).show();
                }
            });

            btnConsulter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(GestionRdvActivity.this, "Liste des rendez-vous", Toast.LENGTH_SHORT).show();
                }
            });
        }

}