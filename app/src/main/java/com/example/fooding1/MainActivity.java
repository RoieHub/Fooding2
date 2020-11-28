package com.example.fooding1;

import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button log_in_button;
    Button sign_in_button;
    Button enter_anon_button;
    EditText enter_password;
    EditText user_name;
    TextView output_to_user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        log_in_button = (Button)findViewById(R.id.log_in_button);
        sign_in_button = (Button)findViewById(R.id.sing_in_button);
        enter_anon_button = (Button)findViewById(R.id.enter_as_anon_button);
        output_to_user = (TextView)findViewById(R.id.output_to_user);
        enter_password = (EditText)findViewById(R.id.enter_pass);
        user_name = (EditText)findViewById(R.id.enter_user_name_plain_text);

        /**
         * Example on output user
         *   output_to_user.setText("My text");
         */


        log_in_button.setOnClickListener(this);
        sign_in_button.setOnClickListener(this);
        enter_anon_button.setOnClickListener(this);


    }

    /**
     *  Called when user taps the Log in button
     */

    public void logIn(View view)
    {
        /**
         *    If user or pass field empty
         *          make toast "no user name or pass given , fill the fields"
         *
         *    If user name exists
         *                if pass match
         *                          go to the next page
         *                 else (pass not match)
         *                          make a toast " User name and password dosent match"
         *    else
         *            make a toast writen " No Such user exist , click on sign in to crate an account"
         */

    }

    /**
     *Called when user taps the "sign in" button
     */

    public void signIn(View view)
    {
        /**
         * If user or pass field empty
         *           make toast "no user name or pass given , fill the fields"
         *
         * If user name allrady exist
         *          show message "user name allready exist. if it is yours log in ,  if not use a register with a different user name"
         *

         *
         */
    }

    /**
     * Called when user click the "Anonymus" button
     */
    public void enterAnon(View view)
    {

    }

    @Override
    public void onClick(View view) {
        if(view == log_in_button) {
            logIn(view);
        }
        if(view == sign_in_button)
        {
          signIn(view);
        }
        if(view == enter_anon_button)
        {
         //   output_to_user.setText("You pressed anon");
        }

    }
  }
