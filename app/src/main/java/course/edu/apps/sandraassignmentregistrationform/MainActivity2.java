package course.edu.apps.sandraassignmentregistrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView   name;
    private TextView   email;
    private TextView   pass;
    private TextView   phone;
    private TextView   DOB;
    private TextView   position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        view();
        Intent intent= getIntent();
        String NameData = intent.getStringExtra("NAME");
        name.setText("Your Name is " +NameData);
        String emailData = intent.getStringExtra("email");
        email.setText("Your Email is " +emailData);
        String passData = intent.getStringExtra("password");
        pass.setText("Your Password is " +passData);
        String phoneData = intent.getStringExtra("phone");
        phone.setText("Your Phone Number is " +phoneData);
        String dateData = intent.getStringExtra("DOB");
        DOB.setText("Your Date Of Birth is " +dateData);
        String positionData = intent.getStringExtra("spinner");
        position.setText("Your position is " +positionData);
    }

    private void view() {
        name=findViewById(R.id.NameTxt);
        email=findViewById(R.id.EmailTxt);
        pass=findViewById(R.id.passTxt);
        phone=findViewById(R.id.PhoneTxt);
        DOB=findViewById(R.id.DOBTxt);
        position=findViewById(R.id.PosTxT);
    }

}