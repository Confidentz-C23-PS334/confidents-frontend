package com.confidents.app.modules.signup.`data`.model

import com.confidents.app.R
import com.confidents.app.appcomponents.di.MyApp
import kotlin.String

data class SignupModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateYourAcc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_your_acc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelM: String? = MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_mobile_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_have_an_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10198Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10198OneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10198TwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10198ThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10198FourValue: String? = null
)
