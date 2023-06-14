package com.confidents.app.modules.drdetails.`data`.model

import com.confidents.app.R
import com.confidents.app.appcomponents.di.MyApp
import kotlin.String

data class DrDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDoctordetail: String? = MyApp.getInstance().resources.getString(R.string.lbl_doctor_detail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_drg_ali_imron2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChardiologist: String? = MyApp.getInstance().resources.getString(R.string.lbl_sukoharjo)
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
  var txtAbout: String? = MyApp.getInstance().resources.getString(R.string.lbl_about)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_drg_ali_imron3)

)
