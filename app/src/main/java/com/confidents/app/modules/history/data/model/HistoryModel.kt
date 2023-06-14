package com.confidents.app.modules.history.`data`.model

import com.confidents.app.R
import com.confidents.app.appcomponents.di.MyApp
import kotlin.String

data class HistoryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtActivity: String? = MyApp.getInstance().resources.getString(R.string.lbl_activity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_28_may_2023)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYH: String? = MyApp.getInstance().resources.getString(R.string.lbl_yh)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouHavePerfor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hasil_pengeceka)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_gigi_ini_terind)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_09_00_am)

)
