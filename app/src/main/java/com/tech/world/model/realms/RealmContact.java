package com.tech.world.model.realms;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by Devlomi on 17/01/2018.
 */


//Contact to send or receive
public class RealmContact extends RealmObject implements Parcelable {
    //contact name
    private String name;
    //list of phoneNumber of the contact
    private RealmList<PhoneNumber> realmList;

    private String jsonString;

    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

    public RealmContact() {
    }

    public void updateRealmList(List<PhoneNumber> numbers) {
        RealmList<PhoneNumber> realmList = new RealmList();
        realmList.addAll(numbers);
        this.realmList = realmList;
    }

    public RealmContact(String name, ArrayList<PhoneNumber> numbers) {
        this.name = name;

        //this hack is to make realmList Parcelable
        //more info at:
        // https://stackoverflow.com/questions/43619845/how-to-make-a-realmlist-parcelable
        realmList = new RealmList<>();
        realmList.addAll(numbers);
    }

    public RealmContact(String name, ArrayList<PhoneNumber> numbers, String jsonString) {
        this.name = name;
        realmList = new RealmList<>();
        realmList.addAll(numbers);
        this.jsonString = jsonString;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RealmList<PhoneNumber> getRealmList() {
        return realmList;
    }

    public HashMap<String, String> toMap() {
        HashMap<String, String> numbers = new HashMap<>();
        for (int i = 0; i < realmList.size(); i++) {
            PhoneNumber phoneNumber = realmList.get(i);
            numbers.put(String.valueOf(i), phoneNumber.getNumber());
        }
        return numbers;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeTypedList(realmList);
    }

    protected RealmContact(Parcel in) {
        this.name = in.readString();
        this.realmList = new RealmList<>();
        this.realmList.addAll(in.createTypedArrayList(PhoneNumber.CREATOR));
    }

    public static final Creator<RealmContact> CREATOR = new Creator<RealmContact>() {
        public RealmContact createFromParcel(Parcel source) {
            return new RealmContact(source);
        }

        public RealmContact[] newArray(int size) {
            return new RealmContact[size];
        }
    };
}
