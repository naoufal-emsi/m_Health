package m.health;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AccesProfilsActivity extends AppCompatActivity {

        private EditText etRecherche;
        private Button btnRechercher;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_acces_profils);

            etRecherche = findViewById(R.id.et_recherche_patient);
            btnRechercher = findViewById(R.id.btn_rechercher_patient);

            btnRechercher.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String requete = etRecherche.getText().toString().trim();

                    if (requete.isEmpty()) {
                        etRecherche.setError("Veuillez entrer un nom ou un ID");
                    } else {
                        effectuerRecherche(requete);
                    }
                }
            });
        }

        private void effectuerRecherche(String query) {
            String message = "Recherche du patient : " + query;
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();


        }

}