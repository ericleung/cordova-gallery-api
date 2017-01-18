package com.app21;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap.CompressFormat;
import android.util.Base64;

public class ImgHelper  {

    public static String encodeBase64(String imgPath) {

        Log.d(TAG, "转换Base64图片 :"+imgPath);
        //decode to bitmap
        Bitmap bitmap = BitmapFactory.decodeFile(path);
        //Log.d(TAG, "bitmap width: " + bitmap.getWidth() + " height: " + bitmap.getHeight());
        //convert to byte array
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPG, 100, baos);
        byte[] bytes = baos.toByteArray();

        //base64 encode
        byte[] encode = Base64.encode(bytes,Base64.DEFAULT);
        return "data:image/jpeg;base64,"+new String(encode);

    }


}