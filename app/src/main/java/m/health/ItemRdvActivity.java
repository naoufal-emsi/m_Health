package m.health;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

    public class ItemRdvActivity extends AppCompatActivity {

        private TextView tvNom, tvDetails;
        private Button btnConfirm, btnCancel;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_item_rdv);

            tvNom = findViewById(R.id.tv_patient_nom);
            tvDetails = findViewById(R.id.tv_rdv_details);
            btnConfirm = findViewById(R.id.btn_confirm);
            btnCancel = findViewById(R.id.btn_cancel);

            tvNom.setText("Jean Dupont");
            tvDetails.setText("15:45 - Dr. Martin (Salle 4)");

            btnConfirm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(ItemRdvActivity.this, "RDV de Jean Dupont confirmé", Toast.LENGTH_SHORT).show();
                    btnConfirm.setEnabled(false);
                    btnConfirm.setText("Confirmé");
                }
            });

            btnCancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(ItemRdvActivity.this, "RDV Annulé", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
