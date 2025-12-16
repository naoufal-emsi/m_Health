package m.mhealth.ui.doctor;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import m.health.R;

public class HomeMedecin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // affiche le layout du médecin
        setContentView(R.layout.homemedecin);
    }
}
