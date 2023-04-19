package es.joseljg.repaso2223;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database;
    private FirebaseAuth mAuth;
    private FirebaseUser currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //---------------------------------------------------
        mAuth = FirebaseAuth.getInstance();
        // PRUEBAS EN FIREBASE REALTIME
        database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        myRef.child("saludo3").setValue("Hola de nuevo");
    }
}