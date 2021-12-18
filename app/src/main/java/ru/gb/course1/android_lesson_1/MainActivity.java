package ru.gb.course1.android_lesson_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.mbms.MbmsErrors;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private TextView first_text_view;
    private EditText second_email_edit_text;
    private Button third_button;
    private Switch fourth_switch;
    private CheckBox fifth_check_box;
    private ToggleButton sixth_toggle_button;

    private EditText text_edit_text;
    private EditText personal_name_edit_text;
    private EditText phone_edit_text;
    private EditText number_edit_text;
    private EditText password_edit_text;
    private EditText email_address_edit_text;
    private EditText date_edit_text;
    private EditText web_edit_text_edit_text;
    private EditText web_password_edit_text;

    private CalendarView calendar_calendar_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();
    }

    private void InitView() {
        first_text_view = findViewById(R.id.first_text_view);
        second_email_edit_text = findViewById(R.id.second_email_edit_text);
        third_button = findViewById(R.id.third_button);
        fourth_switch = findViewById(R.id.fourth_switch);
        fifth_check_box = findViewById(R.id.fifth_check_box);
        sixth_toggle_button = findViewById(R.id.sixth_toggle_button);

        text_edit_text = findViewById(R.id.text_edit_text);
        personal_name_edit_text = findViewById(R.id.personal_name_edit_text);
        phone_edit_text = findViewById(R.id.phone_edit_text);
        number_edit_text = findViewById(R.id.number_edit_text);
        password_edit_text = findViewById(R.id.password_edit_text);
        email_address_edit_text = findViewById(R.id.email_address_edit_text);
        date_edit_text = findViewById(R.id.date_edit_text);
        web_edit_text_edit_text = findViewById(R.id.web_edit_text_edit_text);
        web_password_edit_text = findViewById(R.id.web_password_edit_text);

        calendar_calendar_view = findViewById(R.id.calendar_calendar_view);
    }
}