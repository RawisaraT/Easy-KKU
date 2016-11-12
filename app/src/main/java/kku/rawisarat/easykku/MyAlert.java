package kku.rawisarat.easykku;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by Koony on 12/11/2559.
 */

public class MyAlert {

    //Explicit
    private Context context; //ท่อส่งข้อมูล
    private int anInt; // ICON
    private String titleString, messageString;

    public MyAlert(Context context, int anInt, String titleString, String messageString) {
        this.context = context;
        this.anInt = anInt;
        this.titleString = titleString;
        this.messageString = messageString;
    }//Constructor

    public void myDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(context); //PopUp Alert ใส่ปุ่มสูงสุดได้แค่ 3 ปุ่ม
        builder.setCancelable(false);
        builder.setIcon(anInt);
        builder.setTitle(titleString);
        builder.setMessage(messageString);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();

            }
        });
        builder.show();


    } // myDialog

}// Main Class
