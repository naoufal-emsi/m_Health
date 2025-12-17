package m.mhealth.Data;


import io.supabase.SupabaseClient;
import io.supabase.gotrue.GoTrueClient;
import io.supabase.postgrest.PostgrestClient;

public class SupabaseClientHelper {

    private static final String SUPABASE_URL = "postgresql://postgres:[Ja yke77elha 3maha]@db.oihfavrpnotjiisgapgt.supabase.co:5432/postgres";
    private static final String SUPABASE_KEY = "your-anon-public-key"; // Find this in Dashboard -> Settings -> API

    private static SupabaseClient client;

    // This method ensures we only ever have ONE connection
    public static SupabaseClient getInstance() {
        if (client == null) {
            client = new SupabaseClient(SUPABASE_URL, SUPABASE_KEY);
        }
        return client;
    }
}
