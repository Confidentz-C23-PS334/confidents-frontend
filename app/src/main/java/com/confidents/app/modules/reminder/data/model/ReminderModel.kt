package com.confidents.app.modules.reminder.`data`.model

import com.confidents.app.R
import com.confidents.app.appcomponents.di.MyApp
import kotlin.String

data class ReminderModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSchedule: String? = MyApp.getInstance().resources.getString(R.string.lbl_reminder)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCompleted: String? = MyApp.getInstance().resources.getString(R.string.lbl_completed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrgAliImron: String? = MyApp.getInstance().resources.getString(R.string.msg_drg_ali_imron)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChardiologist: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jl_adi_sumarmo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_26_06_2021)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_30_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmed: String? = MyApp.getInstance().resources.getString(R.string.lbl_upcoming)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScheduleOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_toothbrush_sche)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCompletedOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_completed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrAlysaHana: String? =
      MyApp.getInstance().resources.getString(R.string.msg_brush_your_teet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_00_pm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmedOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_late)

)
