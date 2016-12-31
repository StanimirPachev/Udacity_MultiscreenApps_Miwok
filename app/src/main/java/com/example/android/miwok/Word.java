package com.example.android.miwok;

import java.security.InvalidParameterException;

/**
 * Created by SPP on 30/12/2016.
 */

public class Word {
    private String mMiwokWord;
    private String mEngWord;

    @SuppressWarnings("unqualified-field-access")
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

    @SuppressWarnings("unqualified-field-access")
    public void setmMiwokWord(String mMiwokWord) {
        if (this.mMiwokWord.isEmpty()) {
            throw new InvalidParameterException("Miwok word not provided. Word must be provided!");
        } else {
            this.mMiwokWord = mMiwokWord;

        }

    }

    public String getmEngWord() {
        return mEngWord;
    }

    @SuppressWarnings("unqualified-field-access")
    public void setmEngWord(String mEngWord) {
        if (mEngWord.isEmpty()) {
            throw new InvalidParameterException("English word not provided. Word must be provided!");
        } else {
            this.mEngWord = mEngWord;

        }

    }
}
