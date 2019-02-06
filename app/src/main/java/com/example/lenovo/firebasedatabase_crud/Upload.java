package com.example.lenovo.firebasedatabase_crud;

public class Upload {
    private String mName;
    private String mImageUrl;

    public Upload()
    {
        //empty construct needed
    }

    public Upload(String name, String imageUrl)
    {
        if(name.trim().equals(""))
        {
            name = "No Name";

        }
        mName = name;
        mImageUrl = imageUrl;
    }

 public String getmName()
 {
     return mName;
 }
 public void setName(String name)
 {
     mName=name;
 }
 public String getmImageUrl()
 {
     return mImageUrl;
 }
 public void setImageUrl(String imageUrl)
 {
     mImageUrl=imageUrl;
 }


}
