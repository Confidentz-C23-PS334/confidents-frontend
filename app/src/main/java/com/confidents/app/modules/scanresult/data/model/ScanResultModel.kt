package com.confidents.app.modules.scanresult.`data`.model

import com.confidents.app.R
import com.confidents.app.appcomponents.di.MyApp
import kotlin.String

data class ScanResultModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenApple: String? = MyApp.getInstance().resources.getString(R.string.msg_agus_s_scan_res)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_28_may_2023)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.lbl_description)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenapplesha: String? =
      MyApp.getInstance().resources.getString(R.string.msg_gigi_ini_terind)

)
