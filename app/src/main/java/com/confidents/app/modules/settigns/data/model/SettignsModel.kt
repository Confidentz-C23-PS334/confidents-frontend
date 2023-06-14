package com.confidents.app.modules.settigns.`data`.model

import com.confidents.app.R
import com.confidents.app.appcomponents.di.MyApp
import kotlin.String

data class SettignsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAgusWahyuUsti: String? =
      MyApp.getInstance().resources.getString(R.string.msg_agus_wahyu_usti)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHistory: String? = MyApp.getInstance().resources.getString(R.string.lbl_activity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFAQs: String? = MyApp.getInstance().resources.getString(R.string.lbl_faqs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelp: String? = MyApp.getInstance().resources.getString(R.string.lbl_help)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMessages: String? = MyApp.getInstance().resources.getString(R.string.lbl_reminder)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAppointment: String? = MyApp.getInstance().resources.getString(R.string.lbl_article)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
