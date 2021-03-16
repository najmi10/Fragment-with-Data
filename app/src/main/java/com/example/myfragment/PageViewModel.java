package com.example.myfragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class PageViewModel extends ViewModel {
    /**
     * Live Data Instance
     */
    private MutableLiveData<String> mName = new MutableLiveData<>();
    public void setName(String name) {
        mName.setValue(name);
    }
    public LiveData<String> getName() {
        return mName;
    }
    private MutableLiveData<String> mAge = new MutableLiveData<>();
    public void setAge(String age){
        mAge.setValue(age);
    }
    public LiveData<String> getAge(){
        return mAge;
    }
    private MutableLiveData<String> mNumber = new MutableLiveData<>();
    public void setNumber(String number){
        mNumber.setValue(number);
    }
    public LiveData<String> getNumber(){
        return mNumber;
    }
    private MutableLiveData<String> mAddress = new MutableLiveData<>();
    public void setAddress(String address){
        mAddress.setValue(address);
    }
    public LiveData<String> getAddress(){
        return mAddress;
    }
}