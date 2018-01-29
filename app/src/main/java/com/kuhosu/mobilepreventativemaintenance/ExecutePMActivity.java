package com.kuhosu.mobilepreventativemaintenance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.kuhosu.mobilepreventativemaintenance.model.SparePart;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ExecutePMActivity extends AppCompatActivity {

    @BindView(R.id.btnAssetDetail) RelativeLayout mAssetDetailBtn;
    @BindView(R.id.btnSafety) RelativeLayout mSafetyBtn;
    @BindView(R.id.btnSparePart) RelativeLayout mSparePart;
    @BindView(R.id.btnRemark) RelativeLayout mRemarkBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_execute_pm);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnAssetDetail)
    public void OnClickAssetDetailBtn(){
        Intent intent = new Intent(this, AssetDetailsActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnSafety)
    public void OnClickSafetylBtn(){
        Intent intent = new Intent(this, SafetyPrecautionActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnSparePart)
    public void OnClickSparePartBtn(){
        Intent intent = new Intent(this, SparePartsActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnRemark)
    public void OnClickRemarkBtn(){
        Intent intent = new Intent(this, RemarksActivity.class);
        startActivity(intent);
    }


}
