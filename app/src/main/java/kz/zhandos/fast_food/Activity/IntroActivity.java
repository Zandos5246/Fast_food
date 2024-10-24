package kz.zhandos.fast_food.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import kz.zhandos.fast_food.R;
import kz.zhandos.fast_food.databinding.ActivityIntroBinding;

public class IntroActivity extends BaseActivity {
    ActivityIntroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding=ActivityIntroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setVariable();
        getWindow().setStatusBarColor(Color.parseColor("#F75564"));

    }

    private void setVariable() {
        binding.LoginBtn.setOnClickListener(view -> {
            if(mAuth.getCurrentUser()!=null){
                startActivity(new Intent(IntroActivity.this, MainActivity.class));
            }else{
                startActivity(new Intent(IntroActivity.this, LoginActivity.class));
            }

        });
        binding.SignUp.setOnClickListener(view -> startActivity(new Intent(IntroActivity.this, SignupActivity.class)));
    }
}