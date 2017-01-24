package id.sch.smktelkom_mlg.learn.fragment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements InputFragment.IListener {

    //EditText etNama, etUmur;
    //TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*etNama = (EditText) findViewById(R.id.editTextNama);
        etUmur = (EditText) findViewById(R.id.editTextUmur);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        findViewById(R.id.buttonProses).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doProses();
            }
        });*/
    }

    /*private void doProses() {
        tvHasil.setText(etNama.getText().toString() + " (" + etUmur.getText().toString() +
                " tahun)");
    }*/

    @Override
    public void doProses(String nama, String umur) {
        OutputFragment fragOut = (OutputFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentOutput);
        fragOut.doProses(nama, umur);
    }
}
