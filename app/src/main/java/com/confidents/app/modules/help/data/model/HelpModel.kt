package com.confidents.app.modules.help.`data`.model

import com.confidents.app.R
import com.confidents.app.appcomponents.di.MyApp
import kotlin.String

data class HelpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpCenter: String? = MyApp.getInstance().resources.getString(R.string.lbl_help)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQWhatIsThis: String? = MyApp.getInstance().resources.getString(R.string.msg_bagaimana_cara)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_a_pertama_terg)

)
