package com.confidents.app.modules.dashboard.`data`.model

import com.confidents.app.R
import com.confidents.app.appcomponents.di.MyApp
import kotlin.String

data class ListassortmentofcRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTheHealthiest: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_25_healthie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_jun_10_2021)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_5min_read)

)
