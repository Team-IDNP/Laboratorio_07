package com.example.laboratorio_07.ui.addalerta;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddalertaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AddalertaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Nueva Alerta");
    }

    public LiveData<String> getText() {
        return mText;
    }
}