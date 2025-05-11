package com.example.musannafibneabishaibah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.musannafibneabishaibah.databinding.ActivityHomeBinding;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.pspdfkit.configuration.activity.PdfActivityConfiguration;
import com.pspdfkit.ui.PdfActivity;

public class HomeActivity extends AppCompatActivity {
    int check=3;
    int num_clicks=0;
    private InterstitialAd mInterstitialAd;
    private AdRequest adRequest;
    private AdView adView;

    private ActivityHomeBinding binding;
    private Uri uri;
    private PdfActivityConfiguration config;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        //Initializing Mobile Ads
        loadBannerAd();
        loadIntAd();


        //first pdf loader
        binding.pdf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_clicks++;
                if (mInterstitialAd != null&& num_clicks%check==0) {
                    mInterstitialAd.show(HomeActivity.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                        @Override
                        public void onAdClicked() {
                            // Called when a click is recorded for an ad.
                        }

                        @Override
                        public void onAdDismissedFullScreenContent() {
                            uri = Uri.parse("file:///android_asset/pdf1.pdf");
                            config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                            PdfActivity.showDocument(HomeActivity.this, uri, config);
                            loadIntAd();
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                            // Called when ad fails to show.
                            mInterstitialAd = null;
                        }

                        @Override
                        public void onAdImpression() {
                            // Called when an impression is recorded for an ad.
                        }

                        @Override
                        public void onAdShowedFullScreenContent() {
                            // Called when ad is shown.
                        }
                    });

                } else {
                    uri = Uri.parse("file:///android_asset/pdf1.pdf");
                    config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                    PdfActivity.showDocument(HomeActivity.this, uri, config);
                }
            }
        });

        //second pdf loader
        binding.pdf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_clicks++;
                if (mInterstitialAd != null&& num_clicks%check==0) {
                    mInterstitialAd.show(HomeActivity.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                        @Override
                        public void onAdClicked() {
                            // Called when a click is recorded for an ad.
                        }

                        @Override
                        public void onAdDismissedFullScreenContent() {
                            uri = Uri.parse("file:///android_asset/pdf2.pdf");
                            config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                            PdfActivity.showDocument(HomeActivity.this, uri, config);
                            loadIntAd();
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                            // Called when ad fails to show.
                            mInterstitialAd = null;
                        }

                        @Override
                        public void onAdImpression() {
                            // Called when an impression is recorded for an ad.
                        }

                        @Override
                        public void onAdShowedFullScreenContent() {
                            // Called when ad is shown.
                        }
                    });

                } else {
                    uri = Uri.parse("file:///android_asset/pdf2.pdf");
                    config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                    PdfActivity.showDocument(HomeActivity.this, uri, config);
                }
            }
        });

        //third pdf loader
        binding.pdf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_clicks++;
                if (mInterstitialAd != null&& num_clicks%check==0) {
                    mInterstitialAd.show(HomeActivity.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                        @Override
                        public void onAdClicked() {
                            // Called when a click is recorded for an ad.
                        }

                        @Override
                        public void onAdDismissedFullScreenContent() {
                            uri = Uri.parse("file:///android_asset/pdf3.pdf");
                            config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                            PdfActivity.showDocument(HomeActivity.this, uri, config);
                            loadIntAd();
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                            // Called when ad fails to show.
                            mInterstitialAd = null;
                        }

                        @Override
                        public void onAdImpression() {
                            // Called when an impression is recorded for an ad.
                        }

                        @Override
                        public void onAdShowedFullScreenContent() {
                            // Called when ad is shown.
                        }
                    });

                } else {
                    uri = Uri.parse("file:///android_asset/pdf3.pdf");
                    config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                    PdfActivity.showDocument(HomeActivity.this, uri, config);
                }
            }
        });

        //fourth pdf loader
        binding.pdf4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_clicks++;
                if (mInterstitialAd != null&& num_clicks%check==0) {
                    mInterstitialAd.show(HomeActivity.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                        @Override
                        public void onAdClicked() {
                            // Called when a click is recorded for an ad.
                        }

                        @Override
                        public void onAdDismissedFullScreenContent() {
                            uri = Uri.parse("file:///android_asset/pdf4.pdf");
                            config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                            PdfActivity.showDocument(HomeActivity.this, uri, config);
                            loadIntAd();
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                            // Called when ad fails to show.
                            mInterstitialAd = null;
                        }

                        @Override
                        public void onAdImpression() {
                            // Called when an impression is recorded for an ad.
                        }

                        @Override
                        public void onAdShowedFullScreenContent() {
                            // Called when ad is shown.
                        }
                    });

                } else {
                    uri = Uri.parse("file:///android_asset/pdf4.pdf");
                    config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                    PdfActivity.showDocument(HomeActivity.this, uri, config);
                }
            }
        });

        //fifth pdf loader
        binding.pdf5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_clicks++;
                if (mInterstitialAd != null&& num_clicks%check==0) {
                    mInterstitialAd.show(HomeActivity.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                        @Override
                        public void onAdClicked() {
                            // Called when a click is recorded for an ad.
                        }

                        @Override
                        public void onAdDismissedFullScreenContent() {
                            uri = Uri.parse("file:///android_asset/pdf5.pdf");
                            config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                            PdfActivity.showDocument(HomeActivity.this, uri, config);
                            loadIntAd();
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                            // Called when ad fails to show.
                            mInterstitialAd = null;
                        }

                        @Override
                        public void onAdImpression() {
                            // Called when an impression is recorded for an ad.
                        }

                        @Override
                        public void onAdShowedFullScreenContent() {
                            // Called when ad is shown.
                        }
                    });

                } else {
                    uri = Uri.parse("file:///android_asset/pdf5.pdf");
                    config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                    PdfActivity.showDocument(HomeActivity.this, uri, config);
                }
            }
        });

        //sixth pdf loader
        binding.pdf6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_clicks++;
                if (mInterstitialAd != null&& num_clicks%check==0) {
                    mInterstitialAd.show(HomeActivity.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                        @Override
                        public void onAdClicked() {
                            // Called when a click is recorded for an ad.
                        }

                        @Override
                        public void onAdDismissedFullScreenContent() {
                            uri = Uri.parse("file:///android_asset/pdf6.pdf");
                            config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                            PdfActivity.showDocument(HomeActivity.this, uri, config);
                            loadIntAd();
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                            // Called when ad fails to show.
                            mInterstitialAd = null;
                        }

                        @Override
                        public void onAdImpression() {
                            // Called when an impression is recorded for an ad.
                        }

                        @Override
                        public void onAdShowedFullScreenContent() {
                            // Called when ad is shown.
                        }
                    });

                } else {
                    uri = Uri.parse("file:///android_asset/pdf6.pdf");
                    config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                    PdfActivity.showDocument(HomeActivity.this, uri, config);
                }
            }
        });

        //seventh pdf loader
        binding.pdf7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_clicks++;
                if (mInterstitialAd != null&& num_clicks%check==0) {
                    mInterstitialAd.show(HomeActivity.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                        @Override
                        public void onAdClicked() {
                            // Called when a click is recorded for an ad.
                        }

                        @Override
                        public void onAdDismissedFullScreenContent() {
                            uri = Uri.parse("file:///android_asset/pdf7.pdf");
                            config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                            PdfActivity.showDocument(HomeActivity.this, uri, config);
                            loadIntAd();
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                            // Called when ad fails to show.
                            mInterstitialAd = null;
                        }

                        @Override
                        public void onAdImpression() {
                            // Called when an impression is recorded for an ad.
                        }

                        @Override
                        public void onAdShowedFullScreenContent() {
                            // Called when ad is shown.
                        }
                    });

                } else {
                    uri = Uri.parse("file:///android_asset/pdf7.pdf");
                    config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                    PdfActivity.showDocument(HomeActivity.this, uri, config);
                }
            }
        });

        //eighth pdf loader
        binding.pdf8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_clicks++;
                if (mInterstitialAd != null&& num_clicks%check==0) {
                    mInterstitialAd.show(HomeActivity.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                        @Override
                        public void onAdClicked() {
                            // Called when a click is recorded for an ad.
                        }

                        @Override
                        public void onAdDismissedFullScreenContent() {
                            uri = Uri.parse("file:///android_asset/pdf8.pdf");
                            config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                            PdfActivity.showDocument(HomeActivity.this, uri, config);
                            loadIntAd();
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                            // Called when ad fails to show.
                            mInterstitialAd = null;
                        }

                        @Override
                        public void onAdImpression() {
                            // Called when an impression is recorded for an ad.
                        }

                        @Override
                        public void onAdShowedFullScreenContent() {
                            // Called when ad is shown.
                        }
                    });

                } else {
                    uri = Uri.parse("file:///android_asset/pdf8.pdf");
                    config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                    PdfActivity.showDocument(HomeActivity.this, uri, config);
                }
            }
        });

        //ninth pdf loader
        binding.pdf9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_clicks++;
                if (mInterstitialAd != null&& num_clicks%check==0) {
                    mInterstitialAd.show(HomeActivity.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                        @Override
                        public void onAdClicked() {
                            // Called when a click is recorded for an ad.
                        }

                        @Override
                        public void onAdDismissedFullScreenContent() {
                            uri = Uri.parse("file:///android_asset/pdf9.pdf");
                            config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                            PdfActivity.showDocument(HomeActivity.this, uri, config);
                            loadIntAd();
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                            // Called when ad fails to show.
                            mInterstitialAd = null;
                        }

                        @Override
                        public void onAdImpression() {
                            // Called when an impression is recorded for an ad.
                        }

                        @Override
                        public void onAdShowedFullScreenContent() {
                            // Called when ad is shown.
                        }
                    });

                } else {
                    uri = Uri.parse("file:///android_asset/pdf9.pdf");
                    config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                    PdfActivity.showDocument(HomeActivity.this, uri, config);
                }
            }
        });

        //tenth pdf loader
        binding.pdf10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_clicks++;
                if (mInterstitialAd != null&& num_clicks%check==0) {
                    mInterstitialAd.show(HomeActivity.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                        @Override
                        public void onAdClicked() {
                            // Called when a click is recorded for an ad.
                        }

                        @Override
                        public void onAdDismissedFullScreenContent() {
                            uri = Uri.parse("file:///android_asset/pdf10.pdf");
                            config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                            PdfActivity.showDocument(HomeActivity.this, uri, config);
                            loadIntAd();
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                            // Called when ad fails to show.
                            mInterstitialAd = null;
                        }

                        @Override
                        public void onAdImpression() {
                            // Called when an impression is recorded for an ad.
                        }

                        @Override
                        public void onAdShowedFullScreenContent() {
                            // Called when ad is shown.
                        }
                    });

                } else {
                    uri = Uri.parse("file:///android_asset/pdf10.pdf");
                    config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                    PdfActivity.showDocument(HomeActivity.this, uri, config);
                }
            }
        });

        //eleventh pdf loader
        binding.pdf11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_clicks++;
                if (mInterstitialAd != null&& num_clicks%check==0) {
                    mInterstitialAd.show(HomeActivity.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                        @Override
                        public void onAdClicked() {
                            // Called when a click is recorded for an ad.
                        }

                        @Override
                        public void onAdDismissedFullScreenContent() {
                            uri = Uri.parse("file:///android_asset/pdf11.pdf");
                            config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                            PdfActivity.showDocument(HomeActivity.this, uri, config);
                            loadIntAd();
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                            // Called when ad fails to show.
                            mInterstitialAd = null;
                        }

                        @Override
                        public void onAdImpression() {
                            // Called when an impression is recorded for an ad.
                        }

                        @Override
                        public void onAdShowedFullScreenContent() {
                            // Called when ad is shown.
                        }
                    });

                } else {
                    uri = Uri.parse("file:///android_asset/pdf11.pdf");
                    config = new PdfActivityConfiguration.Builder(HomeActivity.this).build();
                    PdfActivity.showDocument(HomeActivity.this, uri, config);
                }
            }
        });
    }


    //loading banner Ad
    private void loadBannerAd()
    {
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
               //Banner Ad Settings
        adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3791280932715299/3026001788");
        AdRequest adRequest = new AdRequest.Builder().build();
        binding.adView.loadAd(adRequest);
    }

    //loading int ad
    public void loadIntAd(){
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,"ca-app-pub-3791280932715299/2138611313", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        mInterstitialAd = null;
                    }
                });
    }
}