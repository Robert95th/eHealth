package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HealthEducation extends AppCompatActivity {

    TextView summary, heading;
    Button btn1,btn2, btn3, btn4,btn5,btn6;
    LinearLayout v1,v2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_education);




        summary = findViewById(R.id.virusSummary);
        heading = findViewById(R.id.virusName);

        btn1= findViewById(R.id.desBtn1);
        btn2= findViewById(R.id.desBtn2);
        btn3= findViewById(R.id.desBtn3);
        btn4= findViewById(R.id.desBtn4);
        btn5= findViewById(R.id.desBtn5);
        btn6=findViewById(R.id.backBtn);

        v1= findViewById(R.id.v1);
        v2= findViewById(R.id.v2);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1.setVisibility(View.VISIBLE);
                v2.setVisibility(View.GONE);
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.VISIBLE);
                heading.setText("Tuberculosis");
                summary.setText("Overview\n" +
                        "Tuberculosis (TB) is a potentially serious infectious disease that mainly affects your lungs. The bacteria that cause tuberculosis are spread from one person to another through tiny droplets released into the air via coughs and sneezes.\n" +
                        "\n" +
                        "Once rare in developed countries, tuberculosis infections began increasing in 1985, partly because of the emergence of HIV, the virus that causes AIDS. HIV weakens a person's immune system so it can't fight the TB germs. In the United States, because of stronger control programs, tuberculosis began to decrease again in 1993, but remains a concern.\n" +
                        "\n" +
                        "Many strains of tuberculosis resist the drugs most used to treat the disease. People with active tuberculosis must take several types of medications for many months to eradicate the infection and prevent development of antibiotic resistance.\n" +
                        "\n" +
                        "Symptoms\n" +
                        "Although your body may harbor the bacteria that cause tuberculosis (TB), your immune system usually can prevent you from becoming sick. For this reason, doctors make a distinction between:\n" +
                        "\n" +
                        "Latent TB. In this condition, you have a TB infection, but the bacteria remain in your body in an inactive state and cause no symptoms. Latent TB, also called inactive TB or TB infection, isn't contagious. It can turn into active TB, so treatment is important for the person with latent TB and to help control the spread of TB. An estimated 2 billion people have latent TB.\n" +
                        "Active TB. This condition makes you sick and in most cases can spread to others. It can occur in the first few weeks after infection with the TB bacteria, or it might occur years later.\n" +
                        "Signs and symptoms of active TB include:\n" +
                        "\n" +
                        "Coughing that lasts three or more weeks\n" +
                        "Coughing up blood\n" +
                        "Chest pain, or pain with breathing or coughing\n" +
                        "Unintentional weight loss\n" +
                        "Fatigue\n" +
                        "Fever\n" +
                        "Night sweats\n" +
                        "Chills\n" +
                        "Loss of appetite\n" +
                        "Tuberculosis can also affect other parts of your body, including your kidneys, spine or brain. When TB occurs outside your lungs, signs and symptoms vary according to the organs involved. For example, tuberculosis of the spine may give you back pain, and tuberculosis in your kidneys might cause blood in your urine.");

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.VISIBLE);
                heading.setText("Chickenpox");
                summary.setText("Overview\n" +
                        "Chickenpox \n" +
                        "Chickenpox Open pop-up dialog box\n" +
                        "Chickenpox is an infection caused by the varicella-zoster virus. It causes an itchy rash with small, fluid-filled blisters. Chickenpox is highly contagious to people who haven't had the disease or been vaccinated against it. Today, a vaccine is available that protects children against chickenpox. Routine vaccination is recommended by the Centers for Disease Control and Prevention (CDC).\n" +
                        "\n" +
                        "The chickenpox vaccine is a safe, effective way to prevent chickenpox and its possible complications.\n" +
                        "\n" +
                        "Symptoms\n" +
                        "The itchy blister rash caused by chickenpox infection appears 10 to 21 days after exposure to the virus and usually lasts about five to 10 days. Other signs and symptoms, which may appear one to two days before the rash, include:\n" +
                        "\n" +
                        "Fever\n" +
                        "Loss of appetite\n" +
                        "Headache\n" +
                        "Tiredness and a general feeling of being unwell (malaise)\n" +
                        "Once the chickenpox rash appears, it goes through three phases:\n" +
                        "\n" +
                        "Raised pink or red bumps (papules), which break out over several days\n" +
                        "Small fluid-filled blisters (vesicles), which form in about one day and then break and leak\n" +
                        "Crusts and scabs, which cover the broken blisters and take several more days to heal\n" +
                        "New bumps continue to appear for several days, so you may have all three stages of the rash — bumps, blisters and scabbed lesions — at the same time. You can spread the virus to other people for up to 48 hours before the rash appears, and the virus remains contagious until all broken blisters have crusted over.\n" +
                        "\n" +
                        "The disease is generally mild in healthy children. In severe cases, the rash can cover the entire body, and lesions may form in the throat, eyes, and mucous membranes of the urethra, anus and vagina.");        }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.VISIBLE);
                heading.setText("Chronic cough");
                summary.setText("Overview\n" +
                        "A chronic cough is a cough that lasts eight weeks or longer in adults, or four weeks in children.\n" +
                        "\n" +
                        "A chronic cough is more than just an annoyance. A chronic cough can interrupt your sleep and leave you feeling exhausted. Severe cases of chronic cough can cause vomiting, lightheadedness and even rib fractures.\n" +
                        "\n" +
                        "While it can sometimes be difficult to pinpoint the problem that's triggering a chronic cough, the most common causes are tobacco use, postnasal drip, asthma and acid reflux. Fortunately, chronic cough typically disappears once the underlying problem is treated.\n" +
                        "\n" +

                        "Symptoms\n" +
                        "A chronic cough can occur with other signs and symptoms, which may include:\n" +
                        "\n" +
                        "A runny or stuffy nose\n" +
                        "A feeling of liquid running down the back of your throat (postnasal drip)\n" +
                        "Frequent throat clearing and sore throat\n" +
                        "Hoarseness\n" +
                        "Wheezing and shortness of breath\n" +
                        "Heartburn or a sour taste in your mouth\n" +
                        "In rare cases, coughing up blood");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.VISIBLE);
                heading.setText("Influenza");
                summary.setText("Overview\n" +
                        "Influenza is a viral infection that attacks your respiratory system — your nose, throat and lungs. Influenza is commonly called the flu, but it's not the same as stomach \"flu\" viruses that cause diarrhea and vomiting.\n" +
                        "\n" +
                        "For most people, influenza resolves on its own. But sometimes, influenza and its complications can be deadly. People at higher risk of developing flu complications include:\n" +
                        "\n" +
                        "Young children under age 5, and especially those under 12 months\n" +
                        "Adults older than age 65\n" +
                        "Residents of nursing homes and other long-term care facilities\n" +
                        "Pregnant women and women up to two weeks postpartum\n" +
                        "People with weakened immune systems\n" +
                        "People who have chronic illnesses, such as asthma, heart disease, kidney disease, liver disease and diabetes\n" +
                        "People who are very obese, with a body mass index (BMI) of 40 or higher\n" +
                        "Though the annual influenza vaccine isn't 100 percent effective, it's still your best defense against the flu.\n" +
                        "\n" +
                        "Symptoms\n" +
                        "Initially, the flu may seem like a common cold with a runny nose, sneezing and sore throat. But colds usually develop slowly, whereas the flu tends to come on suddenly. And although a cold can be a nuisance, you usually feel much worse with the flu.\n" +
                        "\n" +
                        "Common signs and symptoms of the flu include:\n" +
                        "\n" +
                        "Fever over 100.4 F (38 C)\n" +
                        "Aching muscles\n" +
                        "Chills and sweats\n" +
                        "Headache\n" +
                        "Dry, persistent cough\n" +
                        "Fatigue and weakness\n" +
                        "Nasal congestion\n" +
                        "Sore throat");

            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.VISIBLE);
                heading.setText("HIV/AID");
                summary.setText("Overview\n" +
                        "Acquired immunodeficiency syndrome (AIDS) is a chronic, potentially life-threatening condition caused by the human immunodeficiency virus (HIV). By damaging your immune system, HIV interferes with your body's ability to fight infection and disease.\n" +
                        "\n" +
                        "HIV is a sexually transmitted infection (STI). It can also be spread by contact with infected blood or from mother to child during pregnancy, childbirth or breast-feeding. Without medication, it may take years before HIV weakens your immune system to the point that you have AIDS.\n" +
                        "\n" +
                        "There's no cure for HIV/AIDS, but medications can dramatically slow the progression of the disease. These drugs have reduced AIDS deaths in many developed nations.\n" +
                        "\n" +
                        "Symptoms\n" +
                        "The symptoms of HIV and AIDS vary, depending on the phase of infection.\n" +
                        "\n" +
                        "Primary infection (Acute HIV)\n" +
                        "Some people infected by HIV develop a flu-like illness within two to four weeks after the virus enters the body. This illness, known as primary (acute) HIV infection, may last for a few weeks. Possible signs and symptoms include:\n" +
                        "\n" +
                        "Fever\n" +
                        "Headache\n" +
                        "Muscle aches and joint pain\n" +
                        "Rash\n" +
                        "Sore throat and painful mouth sores\n" +
                        "Swollen lymph glands, mainly on the neck\n" +
                        "Diarrhea\n" +
                        "Weight loss\n" +
                        "Cough\n" +
                        "Night sweats\n" +
                        "These symptoms can be so mild that you might not even notice them. However, the amount of virus in your bloodstream (viral load) is quite high at this time. As a result, the infection spreads more easily during primary infection than during the next stage.\n" +
                        "\n" +
                        "Clinical latent infection (Chronic HIV)\n" +
                        "In this stage of infection, HIV is still present in the body and in white blood cells. However, many people may not have any symptoms or infections during this time.\n" +
                        "\n" +
                        "This stage can last for many years if you're not receiving antiretroviral therapy (ART). Some people develop more severe disease much sooner.\n" +
                        "\n" +
                        "Symptomatic HIV infection\n" +
                        "As the virus continues to multiply and destroy your immune cells — the cells in your body that help fight off germs — you may develop mild infections or chronic signs and symptoms such as:\n" +
                        "\n" +
                        "Fever\n" +
                        "Fatigue\n" +
                        "Swollen lymph nodes — often one of the first signs of HIV infection\n" +
                        "Diarrhea\n" +
                        "Weight loss\n" +
                        "Oral yeast infection (thrush)\n" +
                        "Shingles (herpes zoster)\n" +
                        "Pneumonia\n" +
                        "Progression to AIDS\n" +
                        "Thanks to better antiviral treatments, most people with HIV in the U.S. today don't develop AIDS. Untreated, HIV typically turns into AIDS in about 8 to 10 years.\n" +
                        "\n" +
                        "When AIDS occurs, your immune system has been severely damaged. You'll be more likely to develop opportunistic infections or opportunistic cancers — diseases that wouldn't usually cause illness in a person with a healthy immune system.\n" +
                        "\n" +
                        "The signs and symptoms of some of these infections may include:\n" +
                        "\n" +
                        "Sweats\n" +
                        "Chills\n" +
                        "Recurring fever\n" +
                        "Chronic diarrhea\n" +
                        "Swollen lymph glands\n" +
                        "Persistent white spots or unusual lesions on your tongue or in your mouth\n" +
                        "Persistent, unexplained fatigue\n" +
                        "Weakness\n" +
                        "Weight loss\n" +
                        "Skin rashes or bumps ");

            }
        });





        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.about);


        //navigation

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch(menuItem.getItemId()){
                    case R.id.dashboard:
                        startActivity(new Intent(getApplicationContext()
                                , bookAppointment.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                , MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.about:
                        return true;
                    case R.id.doc:
                        startActivity(new Intent(getApplicationContext()
                                , DoctorsAdmin.class));
                        Intent intent = new Intent(HealthEducation.this, DoctorsAdmin.class);
                        intent.putExtra("message", "");
                        startActivity(intent);
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }
}
