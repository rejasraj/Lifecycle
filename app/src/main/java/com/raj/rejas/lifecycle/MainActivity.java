package com.raj.rejas.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    TextView onCreateCurrent;
    TextView onStartCurrent;
    TextView onResumeCurrent;
    TextView onPauseCurrent;
    TextView onStopCurrent;
    TextView onRestartCurrent;
    TextView onDestroyCurrent;
    TextView onCreateAll;
    TextView onStartAll;
    TextView onResumeAll;
    TextView onPauseAll;
    TextView onStopAll;
    TextView onRestartAll;
    TextView onDestroyAll;
    Button resetCurrent;
    Button resetAll;
    Counter counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        counter = new Counter(sharedPreferences);
        onCreateCurrent = (TextView) findViewById(R.id.onCreateCurrent);
        onStartCurrent = (TextView) findViewById(R.id.onStartCurrent);
        onResumeCurrent = (TextView) findViewById(R.id.onResumeCurrent);
        onPauseCurrent = (TextView) findViewById(R.id.onPauseCurrent);
        onStopCurrent = (TextView) findViewById(R.id.onStopCurrent);
        onRestartCurrent = (TextView) findViewById(R.id.onRestartCurrent);
        onDestroyCurrent = (TextView) findViewById(R.id.onDestroyCurrent);
        onCreateAll = (TextView) findViewById(R.id.onCreateAll);
        onStartAll = (TextView) findViewById(R.id.onStartAll);
        onResumeAll = (TextView) findViewById(R.id.onResumeAll);
        onPauseAll = (TextView) findViewById(R.id.onPauseAll);
        onStopAll = (TextView) findViewById(R.id.onStopAll);
        onRestartAll = (TextView) findViewById(R.id.onRestartAll);
        onDestroyAll = (TextView) findViewById(R.id.onDestroyAll);
        resetCurrent = (Button) findViewById(R.id.resetCurrent);
        resetAll = (Button) findViewById(R.id.resetAll);

        onCreateAll.setText("onCreate: " + counter.getCreateAll());
        onStartAll.setText("onStart: " + counter.getStartAll());
        onResumeAll.setText("onResume: " + counter.getResumeAll());
        onPauseAll.setText("onPause: " + counter.getPauseAll());
        onStopAll.setText("onStop: " + counter.getStopAll());
        onRestartAll.setText("onRestart: " + counter.getRestartAll());
        onDestroyAll.setText("onDestroy: " + counter.getDestroyAll());

        onCreateCurrent.setText("onCreate: " + counter.getCreateCurrent());
        onStartCurrent.setText("onStart: " + counter.getStartCurrent());
        onResumeCurrent.setText("onResume: " + counter.getResumeCurrent());
        onPauseCurrent.setText("onPause: " + counter.getPauseCurrent());
        onStopCurrent.setText("onStop: " + counter.getStopCurrent());
        onRestartCurrent.setText("onRestart: " + counter.getRestartCurrent());
        onDestroyCurrent.setText("onDestroy: " + counter.getDestroyCurrent());

        resetCurrent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setCreateCurrent(0);
                counter.setStartCurrent(0);
                counter.setResumeCurrent(0);
                counter.setPauseCurrent(0);
                counter.setStopCurrent(0);
                counter.setRestartCurrent(0);
                counter.setDestroyCurrent(0);
                onCreateCurrent.setText("onCreate: 0");
                onStartCurrent.setText("onStart: 0");
                onResumeCurrent.setText("onResume: 0");
                onPauseCurrent.setText("onPause: 0");
                onStopCurrent.setText("onStop: 0");
                onRestartCurrent.setText("onRestart: 0");
                onDestroyCurrent.setText("onDestroy: 0");
            }
        });

        resetAll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                counter.setCreateCurrent(0);
                counter.setStartCurrent(0);
                counter.setResumeCurrent(0);
                counter.setPauseCurrent(0);
                counter.setStopCurrent(0);
                counter.setRestartCurrent(0);
                counter.setDestroyCurrent(0);
                onCreateCurrent.setText("onCreate: 0");
                onStartCurrent.setText("onStart: 0");
                onResumeCurrent.setText("onResume: 0");
                onPauseCurrent.setText("onPause: 0");
                onStopCurrent.setText("onStop: 0");
                onRestartCurrent.setText("onRestart: 0");
                onDestroyCurrent.setText("onDestroy: 0");
                counter.setCreateAll(0);
                counter.setStartAll(0);
                counter.setResumeAll(0);
                counter.setPauseAll(0);
                counter.setStopAll(0);
                counter.setRestartAll(0);
                counter.setDestroyAll(0);
                onCreateAll.setText("onCreate: 0");
                onStartAll.setText("onStart: 0");
                onResumeAll.setText("onResume: 0");
                onPauseAll.setText("onPause: 0");
                onStopAll.setText("onStop: 0");
                onRestartAll.setText("onRestart: 0");
                onDestroyAll.setText("onDestroy: 0");
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        counter.setStartCurrent(counter.getStartCurrent() + 1);
        counter.setStartAll(counter.getStartAll() + 1);
        onStartCurrent.setText("onStart: " + counter.getStartCurrent());
        onStartAll.setText("onStart: " + counter.getStartAll());
    }

    @Override
    public void onResume() {
        super.onResume();
        counter.setResumeCurrent(counter.getResumeCurrent() + 1);
        counter.setResumeAll(counter.getResumeAll() + 1);
        onResumeCurrent.setText("onResume: " + counter.getResumeCurrent());
        onResumeAll.setText("onResume: " + counter.getResumeAll());
    }

    @Override
    public void onPause() {
        super.onPause();
        counter.setPauseCurrent(counter.getPauseCurrent() + 1);
        counter.setPauseAll(counter.getPauseAll() + 1);
        onPauseCurrent.setText("onPause: " + counter.getPauseCurrent());
        onPauseAll.setText("onPause: " + counter.getPauseAll());
    }

    @Override
    public void onStop() {
        super.onStop();
        counter.setStopCurrent(counter.getStopCurrent() + 1);
        counter.setStopAll(counter.getStopAll() + 1);
        onStopCurrent.setText("onStop: " + counter.getStopCurrent());
        onStopAll.setText("onStop: " + counter.getStopAll());
    }

    @Override
    public void onRestart() {
        super.onRestart();
        counter.setRestartCurrent(counter.getRestartCurrent() + 1);
        counter.setRestartAll(counter.getRestartAll() + 1);
        onRestartCurrent.setText("onRestart: " + counter.getRestartCurrent());
        onRestartAll.setText("onRestart: " + counter.getRestartAll());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        counter.setDestroyCurrent(counter.getDestroyCurrent() + 1);
        counter.setDestroyAll(counter.getDestroyAll() + 1);
        onDestroyCurrent.setText("onDestroy: " + counter.getDestroyCurrent());
        onDestroyAll.setText("onDestroy: " + counter.getDestroyAll());
    }
}
class Counter {
    private SharedPreferences sharedPreferences;
    private int createCurrent;
    private int startCurrent;
    private int resumeCurrent;
    private int pauseCurrent;
    private int stopCurrent;
    private int restartCurrent;
    private int destroyCurrent;
    private int createAll;
    private int startAll;
    private int resumeAll;
    private int pauseAll;
    private int stopAll;
    private int restartAll;
    private int destroyAll;

    public Counter(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
        this.createCurrent = 1;
        this.startCurrent = 0;
        this.resumeCurrent = 0;
        this.pauseCurrent = 0;
        this.stopCurrent = 0;
        this.restartCurrent = 0;
        this.destroyCurrent = 0;
        this.createAll = sharedPreferences.getInt("onCreate", 0) + 1;
        this.startAll = sharedPreferences.getInt("onStart", 0);
        this.resumeAll = sharedPreferences.getInt("onResume", 0);
        this.pauseAll = sharedPreferences.getInt("onPause", 0);
        this.stopAll = sharedPreferences.getInt("onStop", 0);
        this.restartAll = sharedPreferences.getInt("onRestart", 0);
        this.destroyAll = sharedPreferences.getInt("onDestroy", 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("onCreate", this.createAll + 1);
        editor.apply();
    }

    public int getCreateCurrent() {
        return createCurrent;
    }

    public void setCreateCurrent(int createCurrent) {
        this.createCurrent = createCurrent;
    }

    public int getStartCurrent() {
        return startCurrent;
    }

    public void setStartCurrent(int startCurrent) {
        this.startCurrent = startCurrent;
    }

    public int getResumeCurrent() {
        return resumeCurrent;
    }

    public void setResumeCurrent(int resumeCurrent) {
        this.resumeCurrent = resumeCurrent;
    }

    public int getPauseCurrent() {
        return pauseCurrent;
    }

    public void setPauseCurrent(int pauseCurrent) {
        this.pauseCurrent = pauseCurrent;
    }

    public int getStopCurrent() {
        return stopCurrent;
    }

    public void setStopCurrent(int stopCurrent) {
        this.stopCurrent = stopCurrent;
    }

    public int getRestartCurrent() {
        return restartCurrent;
    }

    public void setRestartCurrent(int restartCurrent) {
        this.restartCurrent = restartCurrent;
    }

    public int getDestroyCurrent() {
        return destroyCurrent;
    }

    public void setDestroyCurrent(int destroyCurrent) {
        this.destroyCurrent = destroyCurrent;
    }

    public int getCreateAll() {
        return createAll;
    }

    public void setCreateAll(int createAll) {
        this.createAll = createAll;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("onCreate", this.createAll);
        editor.apply();
    }

    public int getStartAll() {
        return startAll;
    }

    public void setStartAll(int startAll) {
        this.startAll = startAll;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("onStart", this.startAll);
        editor.apply();
    }

    public int getResumeAll() {
        return resumeAll;
    }

    public void setResumeAll(int resumeAll) {
        this.resumeAll = resumeAll;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("onResume", this.resumeAll);
        editor.apply();
    }

    public int getPauseAll() {
        return pauseAll;
    }

    public void setPauseAll(int pauseAll) {
        this.pauseAll = pauseAll;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("onPause", this.pauseAll);
        editor.apply();
    }

    public int getStopAll() {
        return stopAll;
    }

    public void setStopAll(int stopAll) {
        this.stopAll = stopAll;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("onStop", this.stopAll);
        editor.apply();
    }

    public int getRestartAll() {
        return restartAll;
    }

    public void setRestartAll(int restartAll) {
        this.restartAll = restartAll;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("onRestart", this.restartAll);
        editor.apply();
    }

    public int getDestroyAll() {
        return destroyAll;
    }

    public void setDestroyAll(int destroyAll) {
        this.destroyAll = destroyAll;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("onDestroy", this.destroyAll);
        editor.apply();
    }
}
