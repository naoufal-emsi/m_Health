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


    public class FormModifierDossierActivity extends AppCompatActivity {

        private EditText etIdSearch, etAddress, etPhone, etMutuelle;
        private Button btnLoad, btnSave;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_form_modifier_dossier);

            etIdSearch = findViewById(R.id.et_id_search);
            etAddress = findViewById(R.id.et_edit_address);
            etPhone = findViewById(R.id.et_edit_phone);
            etMutuelle = findViewById(R.id.et_edit_mutuelle);

            btnLoad = findViewById(R.id.btn_load_data);
            btnSave = findViewById(R.id.btn_save_changes);

            btnLoad.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String id = etIdSearch.getText().toString().trim();
                    if (!id.isEmpty()) {
                        Toast.makeText(FormModifierDossierActivity.this,
                                "Données du patient " + id + " chargées", Toast.LENGTH_SHORT).show();

                        etAddress.setText("123 Rue de la Santé");
                        etPhone.setText("0612345678");
                        etMutuelle.setText("Ma Mutuelle Santé");
                    } else {
                        etIdSearch.setError("Entrez un ID valide");
                    }
                }
            });

            btnSave.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String adresse = etAddress.getText().toString();
                    String tel = etPhone.getText().toString();

                    if (adresse.isEmpty() || tel.isEmpty()) {
                        Toast.makeText(FormModifierDossierActivity.this,
                                "Veuillez remplir les champs obligatoires", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(FormModifierDossierActivity.this,
                                "Dossier mis à jour avec succès !", Toast.LENGTH_LONG).show();


                    }
                }
            });
        }
    }
