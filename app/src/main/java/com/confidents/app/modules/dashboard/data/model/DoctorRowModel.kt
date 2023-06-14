package com.confidents.app.modules.dashboard.`data`.model

import com.confidents.app.R
import com.confidents.app.appcomponents.di.MyApp
import kotlin.String

data class DoctorRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSukoharjo: String? = MyApp.getInstance().resources.getString(R.string.lbl_sukoharjo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRatting: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_800m_away)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrgAliImron: String? = MyApp.getInstance().resources.getString(R.string.msg_drg_ali_imron)

)
