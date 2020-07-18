package com.example.myapplication.customalertdialog

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_custom_alert_dialog_main.*

class CustomAlertDialogMainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_alert_dialog_main)

        buttonSuccess.setOnClickListener(this)
        buttonWarning.setOnClickListener(this)
        buttonError.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.buttonSuccess -> {
                showSuccessDialog()
            }
            R.id.buttonWarning -> {
                showWarningDialog()
            }
            R.id.buttonError -> {
                showErrorDialog()
            }
            else -> {

            }

        }
    }


    //    val builder = AlertDialog.Builder(this)
//    val dialogView = layoutInflater.inflate(R.layout.custom_dialog, null)
//    val dialogText = dialogView.findViewById<EditText>(R.id.dialogEt)
//    val dialogRatingBar = dialogView.findViewById<RatingBar>(R.id.dialogRb)
//
//    builder.setView(dialogView)
//    .setPositiveButton("확인") { dialogInterface, i ->
//        mainTv.text = dialogText.text.toString()
//        mainRb.rating = dialogRatingBar.rating
//        /* 확인일 때 main의 View의 값에 dialog View에 있는 값을 적용 */
//
//    }
//    .setNegativeButton("취소") { dialogInterface, i ->
//        /* 취소일 때 아무 액션이 없으므로 빈칸 */
//    }
//    .show()
    private fun showSuccessDialog() {
        val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
        val view = LayoutInflater.from(this).inflate(
            R.layout.layout_success_dialog,
            findViewById<ConstraintLayout>(R.id.layoutDialogContainer)
        )
        view.findViewById<TextView>(R.id.textTitle).text = getString(R.string.success_title)
        view.findViewById<TextView>(R.id.textMessage).text = getString(R.string.dummy_text)
        view.findViewById<Button>(R.id.buttonAction).text = getString(R.string.okay)
        view.findViewById<ImageView>(R.id.imageIcon).setImageResource(R.drawable.ic_success)

        val alertDialog = builder.setView(view).create()

        view.findViewById<Button>(R.id.buttonAction).setOnClickListener {
            alertDialog.dismiss()
        }

        if (alertDialog.window != null) {
            alertDialog.window!!.setBackgroundDrawable(ColorDrawable(0))
        }
        alertDialog.show()
    }

    private fun showWarningDialog() {
        val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
        val view = LayoutInflater.from(this).inflate(
            R.layout.layout_warning_dialog,
            findViewById<ConstraintLayout>(R.id.layoutDialogContainer)
        )
        view.findViewById<TextView>(R.id.textTitle).text = getString(R.string.success_title)
        view.findViewById<TextView>(R.id.textMessage).text = getString(R.string.dummy_text)
        view.findViewById<Button>(R.id.buttonYes).text = getString(R.string.yes)
        view.findViewById<Button>(R.id.buttonNo).text = getString(R.string.no)
        view.findViewById<ImageView>(R.id.imageIcon).setImageResource(R.drawable.ic_warning)

        val alertDialog = builder.setView(view).create()

        view.findViewById<Button>(R.id.buttonYes).setOnClickListener {
            alertDialog.dismiss()
            Toast.makeText(this, "Yes", Toast.LENGTH_SHORT).show()
        }

        if (alertDialog.window != null) {
            alertDialog.window!!.setBackgroundDrawable(ColorDrawable(0))
        }
        alertDialog.show()
    }

    private fun showErrorDialog() {
        val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
        val view = LayoutInflater.from(this).inflate(
            R.layout.layout_error_dialog,
            findViewById<ConstraintLayout>(R.id.layoutDialogContainer)
        )
        view.findViewById<TextView>(R.id.textTitle).text = getString(R.string.success_title)
        view.findViewById<TextView>(R.id.textMessage).text = getString(R.string.dummy_text)
        view.findViewById<Button>(R.id.buttonAction).text = getString(R.string.okay)
        view.findViewById<ImageView>(R.id.imageIcon).setImageResource(R.drawable.ic_error)

        val alertDialog = builder.setView(view).create()

        view.findViewById<Button>(R.id.buttonAction).setOnClickListener {
            alertDialog.dismiss()
        }

        if (alertDialog.window != null) {
            alertDialog.window!!.setBackgroundDrawable(ColorDrawable(0))
        }
        alertDialog.show()
    }


}
