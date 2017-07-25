package com.example.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by wuzijian on 2017/7/24.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean isSolved;

    public Crime() {
        mDate = new Date();
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public void setSolved(boolean solved) {
        isSolved = solved;
    }
}
