package com.confidents.app.modules.faqs.`data`.model

import com.confidents.app.R
import com.confidents.app.appcomponents.di.MyApp
import kotlin.String

data class FaqsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtInteractiveFAQ: String? = MyApp.getInstance().resources.getString(R.string.lbl_faqs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelM: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_select_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_placing_an_orde)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_not_listed_your)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlaceholdertex: String? =
      MyApp.getInstance().resources.getString(R.string.msg_write_your_ques)

)
