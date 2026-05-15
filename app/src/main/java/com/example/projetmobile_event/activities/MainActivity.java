package com.example.projetmobile_event.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.projetmobile_event.R;

public class MainActivity extends AppCompatActivity {

  private Button btnOrganisateur;
  private Button btnParticipant;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    btnOrganisateur = findViewById(R.id.btn_organisateur);
    btnParticipant = findViewById(R.id.btn_participant);

    btnOrganisateur.setOnClickListener(v ->
      startActivity(new Intent(MainActivity.this, CreateurActivity.class)));

    btnParticipant.setOnClickListener(v ->
      startActivity(new Intent(MainActivity.this, ParticipantActivity.class)));
  }
}
