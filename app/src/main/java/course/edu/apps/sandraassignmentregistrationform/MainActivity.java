package course.edu.apps.sandraassignmentregistrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText emailTxt;
    private EditText password;
    private EditText phoneNumber;
    private EditText DateTxt;

    Spinner spinner ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.positionSpinner);
        setupViews();
        populateSpinner();
    }

    private void setupViews() {
        name=findViewById(R.id.name);
        emailTxt=findViewById(R.id.emailTxt);
        password=findViewById(R.id.password);
        phoneNumber=findViewById(R.id.phone);
        DateTxt=findViewById(R.id.DateTxt);

    }

    private void populateSpinner() {
        ArrayList<String> data = new ArrayList<>();
        data.add("Under Graduate");
        data.add("Student");
        data.add("Employee");
        data.add("Non Worker");
        ArrayAdapter<String > adpter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,data);
        spinner.setAdapter(adpter);
    }

    public void SaveBtn_OnClick(View view) {
        Intent intent = new Intent(this,MainActivity2.class);

        String Name = name.getText().toString();
        intent.putExtra("NAME", Name);
        String email = emailTxt.getText().toString();
        intent.putExtra("email", email);
        String pass = password.getText().toString();
        intent.putExtra("password", pass);
        String phone = phoneNumber.getText().toString();
        intent.putExtra("phone", phone);
        String birthDate = DateTxt.getText().toString();
        intent.putExtra("DOB", birthDate);
        String str = spinner.getSelectedItem().toString();
        intent.putExtra("spinner",str);


        startActivity(intent);
        InputMethodManager mgr =(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(),0);
        //Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
}