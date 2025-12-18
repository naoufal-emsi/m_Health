package m.health;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AppointmentAdapter extends BaseAdapter {
    private Context context;
    private List<String> appointments;
    private LayoutInflater inflater;

    public AppointmentAdapter(Context context, List<String> appointments) {
        this.context = context;
        this.appointments = appointments;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return appointments.size();
    }

    @Override
    public Object getItem(int position) {
        return appointments.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_appointment, parent, false);
        }

        String appointmentInfo = appointments.get(position);
        String[] parts = appointmentInfo.split(" - ");
        
        TextView appointmentTime = convertView.findViewById(R.id.appointmentTime);
        TextView appointmentPatient = convertView.findViewById(R.id.appointmentPatient);
        TextView appointmentReason = convertView.findViewById(R.id.appointmentReason);
        
        appointmentTime.setText(parts[0]);
        appointmentPatient.setText(parts.length > 1 ? parts[1] : "Patient");
        appointmentReason.setText(parts.length > 2 ? parts[2] : "Consultation");

        return convertView;
    }
}