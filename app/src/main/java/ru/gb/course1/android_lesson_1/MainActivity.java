package ru.gb.course1.android_lesson_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.mbms.MbmsErrors;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

//    private TextView firstTextView;
//    private EditText secondEmailEditText;
//    private Button thirdButton;
//    private Switch fourthSwitch;
//    private CheckBox fifthCheckBox;
//    private ToggleButton sixthToggleButton;
//
//    private EditText textEditText;
//    private EditText personalNameEditText;
//    private EditText phoneEditText;
//    private EditText numberEditText;
//    private EditText passwordEditText;
//    private EditText emailAddressEditText;
//    private EditText dateEditText;
//    private EditText webEditTextEditText;
//    private EditText webPasswordEditText;
//
//    private CalendarView calendarCalendarView;

//    private TextView inputChoiceTextView;
    private Button blueButton;
    private Button greenButton;
    private TextView resultTextView;
    private Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();
        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if (rnd.nextInt(10) < 5)
                    resultTextView.setText("Поздравляю! Вы угадали! :)");
                else resultTextView.setText("Сожалеем! Вы не угадали! :(");
            }
        });
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if (rnd.nextInt(10) >= 5)
                    resultTextView.setText("Поздравляю! Вы угадали! :)");
                else resultTextView.setText("Сожалеем! Вы не угадали! :(");
            }
        });
    }

    private void InitView() {
//        firstTextView = findViewById(R.id.first_text_view);
//        secondEmailEditText = findViewById(R.id.second_email_edit_text);
//        thirdButton = findViewById(R.id.third_button);
//        fourthSwitch = findViewById(R.id.fourth_switch);
//        fifthCheckBox = findViewById(R.id.fifth_check_box);
//        sixthToggleButton = findViewById(R.id.sixth_toggle_button);
//
//        textEditText = findViewById(R.id.text_edit_text);
//        personalNameEditText = findViewById(R.id.personal_name_edit_text);
//        phoneEditText = findViewById(R.id.phone_edit_text);
//        numberEditText = findViewById(R.id.number_edit_text);
//        passwordEditText = findViewById(R.id.password_edit_text);
//        emailAddressEditText = findViewById(R.id.email_address_edit_text);
//        dateEditText = findViewById(R.id.date_edit_text);
//        webEditTextEditText = findViewById(R.id.web_edit_text_edit_text);
//        webPasswordEditText = findViewById(R.id.web_password_edit_text);
//
//        calendarCalendarView = findViewById(R.id.calendar_calendar_view);

//        inputChoiceTextView = findViewById(R.id.input_choice_text_view);
        blueButton = findViewById(R.id.blue_button);
        greenButton = findViewById(R.id.green_button);
        resultTextView = findViewById(R.id.result_text_view);
    }
}