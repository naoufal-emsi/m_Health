package m.mhealth.ui.patient;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import m.health.R;

public class BookAppointmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Affiche activity_book_appointment.xml
        setContentView(R.layout.activity_book_appointment);
    }
}
