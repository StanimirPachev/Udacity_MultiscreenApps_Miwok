package com.example.android.miwok;

import java.security.InvalidParameterException;

/**
 * Created by SPP on 30/12/2016.
 */

public class Word {
    private String mMiwokWord;
    private String mEngWord;

    @SuppressWarnings("WeakerAccess")
    public Word(String mMiwokWord, String mEngWord) {
        if (mMiwokWord.isEmpty() || mEngWord.isEmpty()) {
            throw new InvalidParameterException("Miwok word or English word not provided. Both words must be provided!");
        } else {
            this.setmMiwokWord(mMiwokWord);
            this.setmEngWord(mEngWord);
        }
    }


    public String getmMiwokWord() {
        return mMiwokWord;
    }

    @SuppressWarnings("WeakerAccess")
    public void setmMiwokWord(String mMiwokWord) {

        this.mMiwokWord = mMiwokWord;
        if (this.mMiwokWord.isEmpty())
            throw new InvalidParameterException("Miwok word not provided. Word must be provided!");
    }


    public String getmEngWord() {
        return mEngWord;
    }

    @SuppressWarnings("WeakerAccess")
    public void setmEngWord(String mEngWord) {
        this.mEngWord = mEngWord;
        if (this.mEngWord.isEmpty())
            throw new InvalidParameterException("Miwok word not provided. Word must be provided!");
    }
}
