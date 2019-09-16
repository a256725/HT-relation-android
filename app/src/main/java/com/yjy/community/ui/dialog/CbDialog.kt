package com.yjy.community.ui.dialog

/**
 * weiweiyu
 * 2019/9/16
 * 575256725@qq.com
 * 13115284785
 * 例子
 */
class CbDialog{
    fun show2(type: Int) {
//        val dialog = CBDialogBuilder(this, CBDialogBuilder.DIALOG_STYLE_NORMAL, 0.8f).showIcon(false)
//            .setTouchOutSideCancelable(false)
//            .showCancelButton(false)
//            .showConfirmButton(false)
//            .setTitle("")
//            .setDialoglocation(CBDialogBuilder.DIALOG_LOCATION_CENTER)
//            .setView(R.layout.dialog_pwd)
//            .create()
//        with(dialog) {
//            findViewById<TextView>(R.id.dialog_title).visibility = View.GONE
//            val pwd = findViewById<EditText>(R.id.et_pwd)
////            if (ModelUtils.isEMUI() && android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1) {
////                pwd.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_NORMAL
////            }
//            findViewById<RelativeLayout>(R.id.right_layout).setOnClickListener { dismiss() }
//            findViewById<TextView>(R.id.btn_close).setOnClickListener { dismiss() }
//            findViewById<TextView>(R.id.btn_sure).setOnClickListener {
//                if (TextUtils.isEmpty(pwd.text)) {
//                    toast(resources.getString(R.string.send_input_pwd))
//                    return@setOnClickListener
//                }
//                if (!StringUtils.isPwd(pwd.text.toString())) {
//                    toast(resources.getString(R.string.create_pwd_hint))
//                    return@setOnClickListener
//                }
//                if (yWallet.pwd != MD5Util.getMD5String(pwd.text.toString().trim())) {
//                    toast(resources.getString(R.string.send_err_pwd))
//                    return@setOnClickListener
//                }
//                var intent = Intent(this@WalletInfoActivity, CoinActivity::class.java)
//                intent.putExtra("data", Gson().toJson(yWallet.map))
//                intent.putExtra("pwd", pwd.text.toString().trim())
//                intent.putExtra("type", type)
//                startActivity(intent)
//                dismiss()
//            }
//            show()
//        }
    }

    //下方弹出选择
    fun actionDialog(){
//        val dialog = ActionSheetDialog(this@PlanWithdrawActivity)
//            .builder()
//            .setCancelable(true)
//            .setCanceledOnTouchOutside(true)
//
//        list.forEach { w ->
//            dialog.addSheetItem(w.address, R.color.txt_333333) {
//                tv_address.text = w.address
//                walt = w
//            }
//        }
//        dialog.show()
    }
}