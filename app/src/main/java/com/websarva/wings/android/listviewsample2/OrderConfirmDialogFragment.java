package com.websarva.wings.android.listviewsample2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class OrderConfirmDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        //ダイアログビルダーを生成。
        AlertDialog.builder builder = new AlertDialog.Builder(getActivity());
        //ダイアログのタイトルを設定。
        builder.setTitle(R.string.dialog_title);
        //ダイアログのメッセージを設定。
        builder.setMessage(R.string.dialog_msg);
        //Positive Buttonを設定。
        builder.setPositiveButton(R.string.dialog_btn_ok, new DialogButtonClickListener());
        //Negative Buttonを設定。
        builder.setNegativeButton(R.string.dialog_btn_ng, new DialogButtonClickListener());
        //NeutralButtonを設定。
        builder.setNeutralButton(R.string.dialog_btn_nu, new DialogButtonClickListener());
        //ダイアログオブジェクトを生成し、リターン
        AlertDialog dialog = builder.create();
        return dialog;
    }
}
